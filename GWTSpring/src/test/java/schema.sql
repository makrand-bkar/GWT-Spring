DROP TABLE EMPLOYEE IF EXISTS;


CREATE TABLE EMPLOYEE (
    employee_id integer identity primary key,  
    employee_name varchar(50) not null,
    employee_surname varchar(50) not null,
	job varchar(50) not null,
	PRIMARY KEY (employee_id)
);

INSERT INTO EMPLOYEE(employee_id, employee_name, employee_surname, job) 
   VALUES(1, 'Joe', 'Smith', 'developer');

INSERT INTO EMPLOYEE(employee_id, employee_name, employee_surname, job) 
   VALUES(2, 'John', 'Wilson', 'progress');

INSERT INTO EMPLOYEE(employee_id, employee_name, employee_surname, job) 
 VALUES(3, 'Rick', 'Martin', 'java');