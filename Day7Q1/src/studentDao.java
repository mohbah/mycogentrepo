import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class studentDao {
         ArrayList<Student> studentlist= new ArrayList();
        Scanner scanner = new Scanner(System.in);

        public void addstudent (){
            System.out.println("Enter the student id!");
            int id = scanner.nextInt();
            System.out.println("Enter the student name!");
            String name = scanner.next();
            System.out.println("Enter the student age!");
            int age= scanner.nextInt();
            System.out.println("Enter the student Email!");
            String email = scanner.next();
            Student student = new Student(id,name,age,email);
            studentlist.add(student);
            System.out.println("Successfully added!");
                    }



        public void searchName() {
            System.out.println("Enter the name you are looking for!");
            String n = scanner.next();
            for (Student student : studentlist) {
                if (student.name.equals(n)) {
                    System.out.println(student.name);
                    System.out.println(student.studentId);
                    System.out.println(student.age);
                    System.out.println(student.email);
                } else {
                    System.out.println(n + " does not exist on the records");
                }


            }
        }

            public void searchnamebyindex () {
                System.out.println("Enter the index for the student ");
                Integer i = scanner.nextInt();
                System.out.println(studentlist.get(i));
            }

            public void printnames () {
                System.out.println(studentlist);
            }

            public void removename () {
                System.out.println(" Enter the name you want to remove");
                String s = scanner.next();
                for (Student student : studentlist) {
                    if (student.name.equals(s)) {
                        studentlist.remove(student);
                        System.out.println(s + " Successfully deleted!");

                    }
                }
            }}