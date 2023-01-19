package model;

public class Customer {
    private String cId;
    private String cName;
    private String cEmail;
    private Integer age;

    public Customer() {};

    public Customer(String cId, String cName, String cEmail, Integer age) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
        this.age = age;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cEmail='" + cEmail + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
