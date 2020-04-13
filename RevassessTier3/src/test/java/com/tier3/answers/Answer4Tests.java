package com.tier3.answers;

import static com.tier3.answers.PointsTests.addPoints;
import static org.junit.Assert.assertTrue;

import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.StoredProcedureQuery;

import com.rev.config.ConnectionConfig;
import com.rev.config.TestConfig;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * prompt: Implement a stored procedure that takes a user's id as an IN
 * parameter and a cursor as a OUT parameter. This procedure will insert a
 * result set into the provided cursor; the result set must contain the study
 * sets belonging to the user with the provided id.
 */
public class Answer4Tests {

    @PersistenceContext
    private EntityManager em;

    @Test
    public void test4() {
        Session sess = TestConfig.getInstance().openSession();
        Transaction tx = sess.beginTransaction();
        em = Persistence.createEntityManagerFactory("com.rev.config.Sample").createEntityManager();
        StoredProcedureQuery store = em.createNamedStoredProcedureQuery("revassessProc").setParameter(1, 1);
        Boolean os = store.execute();
        assertTrue(os.booleanValue());
        tx.rollback();
        addPoints(40);
    }
}