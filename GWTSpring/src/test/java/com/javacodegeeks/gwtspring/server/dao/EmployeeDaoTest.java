package com.javacodegeeks.gwtspring.server.dao;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class EmployeeDaoTest {
	@Autowired
	EmployeeDAO employeeDao;
	
	final Logger logger = LoggerFactory.getLogger(EmployeeDaoTest.class);
	
	@Test
    public void testHibernateTemplate() throws SQLException {
		 assertNotNull("Employee DAO is null.", employeeDao);
	}

}
