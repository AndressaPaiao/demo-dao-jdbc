package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findbyId(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findByAll =====");

        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller INSERT =====");
        Seller newSeller = new Seller(null, "Maria Black", "mari.black@gmail.com", new Date(), 8000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update =====");
        seller = sellerDao.findbyId(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");
    }
}
