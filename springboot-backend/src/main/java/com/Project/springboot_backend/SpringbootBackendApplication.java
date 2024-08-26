package com.Project.springboot_backend;

import com.Project.springboot_backend.model.Employee;
import com.Project.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Ansh");
//		employee.setLastName("Soni");
//		employee.setEmailId("anshdevs22@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 =new Employee();
//		employee1.setFirstName("John");
//		employee1.setLastName("Wick");
//		employee1.setEmailId("wickjohn19@gmail.com");
//		employeeRepository.save(employee1);


	}
}
