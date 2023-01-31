package Model;

public class Product {
    int pid;
    String pname;
    String pcat;
    String manufacture_date;
    String price_expiry_date;

    public Product(int pid, String pname, String pcat, String manufacture_date, String price_expiry_date) {
        this.pid = pid;
        this.pname = pname;
        this.pcat = pcat;
        this.manufacture_date = manufacture_date;
        this.price_expiry_date = price_expiry_date;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcat() {
        return pcat;
    }

    public void setPcat(String pcat) {
        this.pcat = pcat;
    }

    public String getManufacture_date() {
        return manufacture_date;
    }

    public void setManufacture_date(String manufacture_date) {
        this.manufacture_date = manufacture_date;
    }

    public String getPrice_expiry_date() {
        return price_expiry_date;
    }

    public void setPrice_expiry_date(String price_expiry_date) {
        this.price_expiry_date = price_expiry_date;
    }

    @Override
    public String toString() {
        return "Product"+
                "\n"+
                "{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pcat='" + pcat + '\'' +
                ", manufacture_date='" + manufacture_date + '\'' +
                ", price_expiry_date='" + price_expiry_date + '\'' +
                '}'+ "\n" ;
    }
}
