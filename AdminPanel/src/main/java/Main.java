import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import model.Employee;

import java.sql.SQLException;

/**
 * Created by Yaroslav on 16.06.2016.
 */
public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        EmployeeDAO employeeDAO = new EmployeeDaoImpl();
        Employee employee = employeeDAO.readEmployee("Vasiliy");
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Employee experiance: " + employee.getExperiance());
    }
}
