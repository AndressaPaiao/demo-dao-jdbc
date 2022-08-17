package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();

//        System.out.println("\n=== TEST 3: departament INSERT =====");
//        Department newDepartment = new Department(null,"Music");
//        departmentDao.insert(newDepartment);
//        System.out.println("Inserted! New id = " + newDepartment.getId());
    }
}
