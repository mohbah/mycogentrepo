public class Employee {
    int employeeId;
    String emloyeeName;
    double employeeSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmloyeeName() {
        return emloyeeName;
    }

    public void setEmloyeeName(String emloyeeName) {
        this.emloyeeName = emloyeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", emloyeeName='" + emloyeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
