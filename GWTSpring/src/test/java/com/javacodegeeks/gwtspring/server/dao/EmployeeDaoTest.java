package com.javacodegeeks.gwtspring.server.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javacodegeeks.gwtspring.shared.dto.EmployeeDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class EmployeeDaoTest {
	@Autowired
	EmployeeDAO employeeDAO;
	
	final Logger logger = LoggerFactory.getLogger(EmployeeDaoTest.class);
	
	@Test
    public void testHibernateTemplate() throws SQLException {
		 assertNotNull("Employee DAO is null.", employeeDAO);
        Collection<EmployeeDTO> lEmps = employeeDAO.findAll();
        int expected = 3;
        
        assertNotNull("Employee list is null.", lEmps);
        assertEquals("Number of Employees should be " + expected + ".", expected, lEmps.size());
       
	}

}
