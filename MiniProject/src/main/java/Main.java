import Controller.ProductController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=8;
        ProductController pc=new ProductController();
        do {
            System.out.println("1-Add");
            System.out.println("2-Display");
            System.out.println("3-Update");
            System.out.println("4-Delete");
            System.out.println("5-Delete By Category");
            System.out.println("6-Display by Category");
            System.out.println("7-Find Product By ID");
            System.out.println("8-Exit");
            System.out.println("Please enter your choice?");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Please enter product id");
                    int pId=sc.nextInt();
                    System.out.println("Please enter product name");
                    String pName=sc.next();
                    System.out.println("Enter product category");
                    String pCat=sc.next();
                    System.out.println("Enter manufecture date");
                    String manufecture_date=sc.next();
                    System.out.println("Please enter expiry date");
                    String expiry=sc.next();
                    pc.create(pId, pName, pCat, manufecture_date, expiry);
                    break;
                case 2:
                    pc.display();
                    break;



                case 4:
                    System.out.println("Please enter product id");
                    int pIdd=sc.nextInt();
                    pc.remove(pIdd);
                    break;

                case 5:
                    System.out.println("Please enter Category you want to delete");
                    String cat = sc.next();
                    pc.removebycat(cat);
                    break;

                case 6:
                    System.out.println("Enter the Category");
                    String cat1= sc.next();
                    pc.findByCat(cat1);
                    break;

                case 7:
                    System.out.println("Enter Product ID");
                    int id = sc.nextInt();
                    pc.findByID(id);
                    break;


            }
        }while(choice!=8);

    }
}
