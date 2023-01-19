import controller.customerController;
import dao.customerDaoImpl;
import service.customerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        customerDaoImpl cusdaoimpl = new customerDaoImpl();
        customerService cs = new customerService(cusdaoimpl);
        customerController cc = new customerController(cs);
        System.out.println("Welcome to Customer Management Application");
        do {

            System.out.println("1-Add record");
            System.out.println("2-Read records");
            System.out.println("3-Delete record");
            System.out.println("4-Update record");
            System.out.println("5-Find customer by ID");
            System.out.println("6-Find yougest customer");
            System.out.println("7-Exit");
            System.out.println("Please enter your choice...");
            choice=scanner.nextInt();
            cc.accept(choice);

        }while(choice!=0);
        scanner.close();
    }


}
