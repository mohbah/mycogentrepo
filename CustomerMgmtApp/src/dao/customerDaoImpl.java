package dao;

import model.Customer;

import java.util.Scanner;

public class customerDaoImpl implements customerDao{


    Scanner scanner = new Scanner(System.in);

    Customer customers[];
    @Override
    public void create() {
        System.out.println("How many customer you want to create?");
        int size= scanner.nextInt();
        customers = new Customer[size];
        for(int i = 0 ; i< size; i++){
            Customer cust = new Customer();
            System.out.println("Please enter customer ID:");
            cust.setcId(scanner.next());
            System.out.println("Please enter customer name:");
            cust.setcName(scanner.next());
            System.out.println("Please enter customer email ");
            cust.setcEmail(scanner.next());
            System.out.println("Please enter customer age ");
            cust.setAge(scanner.nextInt());
            customers[i]= cust;
            System.out.println("Successfully created!");

        }


    }

    @Override
    public void read() {

        try {
            for (Customer customer: customers){
                System.out.println(customer);

            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(" There is no record yet!");
        }


    }

    @Override
    public void update(String id) {
        try {
            for( Customer customer:customers){
                if(customer.getcId().equals(id)){
                    System.out.println(" Enter updated email!");
                    customer.setcEmail(scanner.next());
                    System.out.println(" Enter updated Name!");
                    customer.setcName(scanner.next());
                    System.out.println("Successfully updated!");

                }
                else {
                    System.out.println("This ID does not exist!");
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(" There is no record with respective ID!");
        }


    }

    @Override
    public void delete(String id) {
        try {
            for( Customer customer:customers){
                if(customer.getcId().equals(id)){
                    customer.setAge(null);
                    customer.setcEmail("Deleted");
                    customer.setcName("Deleted");
                    customer.setcId("Deleted");
                    System.out.println("Successfully Deleted!");

                }else{
                    System.out.println("This ID does not exist!");
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(" There is no record with respective ID!");
        }


    }

    @Override
    public void findCustomerById(String id) {
        try {
            for (Customer customer : customers){
                if(customer.getcId().equals(id)){
                    System.out.print(customer);}


            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(" There is no record with respective ID!");
        }

    }

    @Override
    public void findYoungestCustomer() {
        Integer younget = customers[0].getAge();
        for( int i = 0; i< customers.length; i++){
            if(customers[i].getAge() < younget){
                younget = customers[i].getAge();
            }

        }
        System.out.println("Youngest customers followed below with the age "+ younget);
        for (Customer customer:customers){
            if(customer.getAge()== younget){
                System.out.println(customer.getcName()
                );
            }
        }


    }
}
