package domain;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.*;
import entity.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by Jesus on 21.09.2017.
 */
public class Domain {
    public static void main(String [] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AddressRepository addressRepository = context.getBean(AddressRepository.class);
        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        ProjectRepository projectRepository = context.getBean(ProjectRepository.class);

        Address address = new Address();
        address.setId(1L);
        address.setCountry("Ukraine");
        address.setCity("Kyiv");
        address.setStreet("Pidvysotskogo");
        address.setPostCode("01014");

        Project project = new Project();
        project.setId(1L);
        project.setTitle("Kyiv UA");

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("Jesus");
        employee.setLastName("Raichuk");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1996, Calendar.MAY, 12);

        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddress(address);

        Set<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        project.setEmployees(employees);

        Set<Project> projects = new HashSet<Project>();
        projects.add(project);
        employee.setProjects(projects);

        System.out.println(employeeRepository.findByFirstAndLastName("Jesus", "Raichuk"));
    }
}
