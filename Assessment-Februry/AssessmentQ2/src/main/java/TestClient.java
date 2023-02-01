import java.util.Scanner;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class TestClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        JavaLang javalang = new JavaLang();
        CLang clang = new CLang();

        Thread javathread = new Thread(javalang);
        Thread cthread = new Thread(clang);

        System.out.println(" Welcome to the Application, What is your favorite language? 1)C    2)Java");
        int choice = scanner.nextInt();


        switch (choice){
            case 1:
                cthread.setPriority(MAX_PRIORITY);
                javathread.setPriority(MIN_PRIORITY);
                javathread.start();
                cthread.start();
                break;

            case 2:
                cthread.setPriority(MIN_PRIORITY);
                javathread.setPriority(MAX_PRIORITY);
                cthread.start();
                javathread.start();
                break;
        }




    }
}
