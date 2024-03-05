package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao dpDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: department findById ===");
        Department department = dpDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== Test 2: department findByAll ===");
        List<Department> list = dpDao.findAll();

        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== Test 3: department insert ===");
        Department newDepartment = new Department(null, "Foods");
        dpDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== Test 4: department update ===");
        department = dpDao.findById(1);
        department.setName("Software");
        dpDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== Test 5: department deleteById ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        dpDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}