import java.util.Scanner;

public class EmployeeDao {
    public static void create(Employee employee[], int size){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< employee.length; i++){
            Employee emp1 = new Employee();
            System.out.println("Enter employee id!");
            int empno = scanner.nextInt();
            System.out.println("Enter employee name!");
            String empnm= scanner.next();
            System.out.println("Enter employee salary!");
            double sal = scanner.nextDouble();
            emp1.setEmployeeId((empno));
            emp1.setEmloyeeName(empnm);
            emp1.setEmployeeSalary(sal);
            employee[i]= emp1;



        }
        System.out.println("Successfully has been created!");
    }
    public static void read(Employee emp[]) {
        try {
            for (Employee employee : emp) {
                System.out.println(employee);
            }
        } catch (NullPointerException e) {
            System.out.println("Exception handled, no records to read!");
        }
    }
    public static void update(Employee employee[] ,int id){
        try{
        Scanner scanner = new Scanner(System.in);
        for(Employee employee1: employee){
            if (employee1.employeeId ==id){
                System.out.println("Enter updated name for this Employee!");
                String newName = scanner.next();
                employee1.emloyeeName = newName;
                System.out.println("Enter updated salary for this Employee!");
                double newSalary = scanner.nextDouble();
                employee1.employeeSalary = newSalary;
                System.out.println("Successfully has been updated!");


            }else {
                System.out.println("This ID does not exist!");
            }
        }

    } catch (NullPointerException e) {
            System.out.println("Exception handled, no records to update!");
        }




}   public static void delete(Employee employee[] ,int id) {
        try{
            Scanner scanner = new Scanner(System.in);
            for(Employee employee1: employee){
                if (employee1.employeeId ==id){
                    employee1.employeeId = 0;
                    employee1.emloyeeName = null;
                    employee1.employeeSalary = 0;
                    System.out.println("Successfully has been deleted!");


                }else {
                    System.out.println("This ID does not exist!");
                }
            }

        } catch (NullPointerException e) {
            System.out.println("Exception handled, no records to delete!");
        }
    }


    }