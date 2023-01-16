import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        Task[] tasks = null;

        do {
            System.out.println("*****Menu****");
            System.out.println("1- Adding a new task");
            System.out.println("2- Update a task");
            System.out.println("3-Delete a task");
            System.out.println("4- Searching for a new task");
            System.out.println("0-Exit");
            System.out.println("Please Enter your choice!");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How many tasks you want to create?");
                    int x = scanner.nextInt();
                    tasks = new Task[x];
                    TaskDao.create(tasks, x);
                    break;

                case 2:
                    System.out.println("Enter the Task ID you want to update");
                    int y = scanner.nextInt();
                    TaskDao.update(tasks,y);
                    break;

                case 3:
                    System.out.println("Enter the Task ID you want to delete");
                    int z = scanner.nextInt();
                    TaskDao.delete(tasks,z);
                    break;
                case 4:
                    TaskDao.search(tasks);
                    break;









            }



        } while (choice != 0) ;


    }}