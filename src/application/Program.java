package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: testing FindById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("=== TEST 2: testing FindByDepartment ===");
        Department dep = new Department(2, null);
        List<Seller> sellerList = sellerDao.findByDepartment(dep);
        for (Seller s : sellerList) {
            System.out.println(s);
        }

        System.out.println("=== TEST 3: testing FindAll ===");
        sellerList = sellerDao.findAll();
        for (Seller s : sellerList) {
            System.out.println(s);
        }


        System.out.println("=== TEST 3: testing insert ===");
        /*
        Seller newSeller = new Seller(null, "Greg", "gregmail@gmail.com", 4300.00, LocalDate.of(2025, 6, 1), dep );
        sellerDao.insert(newSeller);
        System.out.println("Inserted!, new ID: " + newSeller.getId());
        */

    }
}
