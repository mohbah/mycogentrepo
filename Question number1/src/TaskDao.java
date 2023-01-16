import java.util.Scanner;

public class TaskDao {
    public static void create(Task task[], int size) {
        Scanner scanner = new Scanner(System.in);
        for (int i =0 ; i<task.length; i++){
             Task task1 = new Task();
             System.out.println("Enter task id!");
             int tskid = scanner.nextInt();
             System.out.println("Enter the task!");
             String tskbody = scanner.next();
             task1.taskId = tskid;
             task1.taskName = tskbody;
             task[i]= task1;
        } System.out.println(" Created successfully!");

    }

    public static void update(Task task[], int id) {
        try {
            Scanner scanner = new Scanner(System.in);

            for (Task tsk : task) {
                if (tsk.taskId == id) {
                    System.out.println("Enter updated Task for this ID!");
                    String newName = scanner.next();
                    tsk.taskName = newName;
                    System.out.println("Successfully has been updated!");


                } else {
                    System.out.println("This ID does not exist!");
                }
            }

        } catch (NullPointerException e) {
            System.out.println("Exception handled, no records to delete!");
        }}

        public static void delete(Task task[], int id){
            try{
                Scanner scanner = new Scanner(System.in);
                for(Task tsk: task){
                    if (tsk.taskId ==id){
                        tsk.taskId = 0;
                        tsk.taskName = null;
                        System.out.println("Successfully has been deleted!");


                    }else {
                        System.out.println("This ID does not exist!");
                    }
                }

            } catch (NullPointerException e) {
                System.out.println("Exception handled, no records to delete!");
            }

        }

        public static void search(Task tsk[]){
        try{
            for(Task tsssk:tsk){
                System.out.println(tsssk);
            }
        } catch (NullPointerException e) {
            System.out.println("Exception handled, no records to read!");
        }
        }











}
