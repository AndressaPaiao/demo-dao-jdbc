package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();

        System.out.println("=== TEST 1: department findById =====");
        Department department = departmentDao.findbyId(3);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findByAll =====");
        List<Department> list = departmentDao.findAll();
        for(Department d : list){
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3: department INSERT =====");
        Department newDepartment = new Department(null,"Games");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update =====");
        department = departmentDao.findbyId(1);
        department.setName("TI");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 6: department delete =====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
