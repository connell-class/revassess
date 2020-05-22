package com.tier3.answers;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rev.config.ConnectionConfig;
import com.rev.config.TestConfig;

import org.hibernate.SessionFactory;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.jdbc.dialect.internal.StandardDialectResolver;
import org.hibernate.engine.jdbc.dialect.spi.DialectResolutionInfo;
import org.hibernate.engine.jdbc.dialect.spi.DialectResolver;
import org.hibernate.jdbc.ReturningWork;
import org.junit.Test;
import static com.tier3.answers.PointsTests.addPoints;

/**
 * prompt: 
 * Create a sequence that produces 
 * numbers beginning at 6 and increments
 * by 3 each time.
 * 
 */
public class Answer2Tests {

    @Test
    public void testSequence() {
        String sequence = ConnectionConfig.TIER_3_SEQUENCE_NAME;
        assertEquals(0, getSequenceResult(sequence)%3);
        assertEquals(1, (getSequenceResult(sequence)+1)%3);
        assertEquals(2, (getSequenceResult(sequence)+2)%3);
        addPoints(20);
    }

    public long getSequenceResult(final String sequenceName) {
        ReturningWork<Long> sequenceWork = new ReturningWork<Long>() {
            @Override
            public Long execute(Connection connection) throws SQLException {
                DialectResolver dialectResolver = new StandardDialectResolver();
                Dialect dialect =  dialectResolver.resolveDialect((DialectResolutionInfo) connection.getMetaData());
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try {
                    preparedStatement = connection.prepareStatement( dialect.getSequenceNextValString(sequenceName));
                    resultSet = preparedStatement.executeQuery();
                    resultSet.next();
                    return resultSet.getLong(1);
                }catch (SQLException e) {
                    throw e;
                } finally {
                    if(preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if(resultSet != null) {
                        resultSet.close();
                    }
                }

            }
        };
        return TestConfig.getInstance().openSession().doReturningWork(sequenceWork);

    }
    

}