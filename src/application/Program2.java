package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: testing insert ===");
        /*
        Department department = new Department(null, "Fishing");
        departmentDao.insert(department);
        System.out.println("Department inserted successfully!");
        */

        System.out.println("=== TEST 2: testing update ===");
        /*
        department.setName("Cars");
        departmentDao.update(department);
        System.out.println("Department updated successfully!");
         */

        System.out.println("=== TEST 3: testing delete ===");
        System.out.println("insert ID to delete: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Department deleted successfully!");

        
    }
}
