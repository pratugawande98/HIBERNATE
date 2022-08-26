package com.cg.jpstart.entities;

import javax.persistence.EntityManager;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

public static void main(String[] args) {
		
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em=factory.createEntityManager();
	em.getTransaction().begin();
	
	//create an employee1
	Employee emp=new Employee();
	emp.setName("Pratiksha");
	emp.setSalary(35000);
	em.persist(emp);
	
	//create an employee1
	Employee emp1=new Employee();
	emp1.setName("Shravani");
	emp1.setSalary(45000);
	em.persist(emp1);
	
	//create an Manager
	Manager mg=new Manager();
	mg.setName("Akanksha");
	mg.setSalary(65000);
	mg.setDeptName("Information Technology");
	em.persist(mg);
	
	em.getTransaction().commit();
	System.out.println("Added Employees and Manager Successfully");
	em.close();
	factory.close();
	
}

}
