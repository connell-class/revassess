package com.rev.config;

import java.sql.ResultSet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
@NamedStoredProcedureQuery(name = "revassessProc", procedureName = ConnectionConfig.TIER_3_PROCEDURE_NAME, parameters = {
    @StoredProcedureParameter(type = Integer.class, mode = ParameterMode.IN),
    @StoredProcedureParameter(type = ResultSet.class, mode = ParameterMode.OUT) })

@Entity
public class Sample {
    @Id
    private int id;
}