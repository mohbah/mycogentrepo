import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int choice =0;
        Scanner scanner= new Scanner(System.in);
        Employee emp[] = null;

        do{
            System.out.println("1- Create a record");
            System.out.println("2- Read all records");
            System.out.println("3- Update the record");
            System.out.println("4-Delete the record");
            System.out.println("5-Exit");
            System.out.println("Please Enter your choice!");
            choice= scanner.nextInt();

            switch (choice){
                case 1:
                System.out.println("How many records you want to create?");
                int x = scanner.nextInt();
                emp = new Employee[x];
                EmployeeDao.create(emp,x);
                break;

                case 2:
                    EmployeeDao.read(emp);
                    break;

                case 3:
                    System.out.println("ENter the Employee ID you want to update");
                    int y = scanner.nextInt();
                    EmployeeDao.update(emp,y);
                    break;
                case 4:
                    System.out.println("Enter the Employee ID you want to delete");
                    int z = scanner.nextInt();
                    EmployeeDao.delete(emp,z);




            }
        }while (choice!=5);








    }

}



