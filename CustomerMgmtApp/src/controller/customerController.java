package controller;

import service.customerService;

import java.util.Scanner;

public class customerController {
    customerService cs;
    Scanner scanner = new Scanner(System.in);
    public customerController( customerService css){
        this.cs=css;
    }
    public void accept(int choice){
        switch (choice){
            case 1:
                cs.serviceCreate();
                break;
            case 2:
                cs.serviceRead();
                break;
            case 3:
                System.out.println("Enter the Customer ID!");
                cs.serviceDelete(scanner.next());
                break;
            case 4:
                System.out.println("Please enter the customer ID");
                String id = scanner.next();
                cs.serviceUpdate(id);
                break;

            case 5:
                System.out.println("Enter the Customer ID!");
                String idd = scanner.next();
                cs.serviceFindCustomerById(idd);
                break;
            case 6:
                cs.serviceFindYoungest();
                break;



        }
    }
}
