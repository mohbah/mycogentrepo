import java.util.Scanner;

public class Task {
    int taskId;
    String taskName;

    public Task(){};

    public Task(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Welcome to the application " + name);
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();
        System.out.println("Enter your first task id?");
        task1.taskId = scanner.nextInt();
        System.out.println("Enter your first task ?");
        task1.taskName = scanner.next();
        System.out.println("Enter your second task id?");
        task2.taskId = scanner.nextInt();
        System.out.println("Enter your second task ?");
        task2.taskName = scanner.next();
        System.out.println("Enter your third task id?");
        task3.taskId = scanner.nextInt();
        System.out.println("Enter your third task ?");
        task3.taskName = scanner.next();
        if (task1.taskName.equals(task2.taskName.toLowerCase())) {
            System.out.println(" task 1 and task 2 are the same!");

        }
        if (task1.taskName.equals(task3.taskName.toLowerCase())) {
            System.out.println(" task 1 and task 3 are the same!");
        }
        if (task2.taskName.equals(task3.taskName.toLowerCase())) {
            System.out.println(" task 2 and task 3 are the same!");
        }

        if (task2.taskName.equals(task3.taskName.toLowerCase()) && task1.taskName.equals(task3.taskName.toLowerCase())) {
            System.out.println(" all of your tasks are the same!");

        }


        int choice = 0;
        do {
            System.out.println("1- Increasing order?");
            System.out.println("2- Deacreasing order?");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if ((task1.taskName.compareTo(task2.taskName) < 0) && (task1.taskName.compareTo(task3.taskName) < 0)) {
                        System.out.println(task1.taskName);
                        if (task2.taskName.compareTo(task3.taskName) < 0) {
                            System.out.println(task2.taskName);
                            System.out.println(task3.taskName);
                        } else {
                            System.out.println(task3.taskName);
                            System.out.println(task2.taskName);
                        }
                    } else if ((task1.taskName.compareTo(task2.taskName) > 0) && (task2.taskName.compareTo(task3.taskName) < 0)) {
                        System.out.println(task2.taskName);
                        if (task1.taskName.compareTo(task3.taskName) < 0) {
                            System.out.println(task1.taskName);
                            System.out.println(task3.taskName);
                        } else {
                            System.out.println(task3.taskName);
                            System.out.println(task1.taskName);
                        }
                    } else {
                        System.out.println(task3.taskName);
                        if (task1.taskName.compareTo(task2.taskName) < 0) {
                            System.out.println(task1.taskName);
                            System.out.println(task2.taskName);
                        } else {
                            System.out.println(task2.taskName);
                            System.out.println(task1.taskName);
                        }

                    }
                    break;


                case 2:
                    if ((task1.taskName.compareTo(task2.taskName) < 0) && (task1.taskName.compareTo(task3.taskName) < 0)) {

                        if (task2.taskName.compareTo(task3.taskName) < 0) {
                            System.out.println(task3.taskName);
                            System.out.println(task2.taskName);
                            System.out.println(task1.taskName);
                        } else {
                            System.out.println(task2.taskName);
                            System.out.println(task3.taskName);

                            System.out.println(task1.taskName);
                        }
                    } else if ((task1.taskName.compareTo(task2.taskName) > 0) && (task2.taskName.compareTo(task3.taskName) < 0)) {

                        if (task1.taskName.compareTo(task3.taskName) < 0) {

                            System.out.println(task3.taskName);
                            System.out.println(task1.taskName);
                            System.out.println(task2.taskName);
                        } else {

                            System.out.println(task1.taskName);
                            System.out.println(task3.taskName);
                            System.out.println(task2.taskName);
                        }
                    } else {

                        if (task1.taskName.compareTo(task2.taskName) < 0) {
                            System.out.println(task2.taskName);
                            System.out.println(task1.taskName);
                            System.out.println(task3.taskName);
                        } else {
                            System.out.println(task1.taskName);
                            System.out.println(task2.taskName);
                            System.out.println(task3.taskName);
                        }


                    }
            }


        } while (choice != 0);


    }

}

























