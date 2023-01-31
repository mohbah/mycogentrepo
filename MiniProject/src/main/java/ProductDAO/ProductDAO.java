package ProductDAO;

import Model.Product;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

public interface ProductDAO {
    public void addProduct(int pid, String pname, String pcat, String manufacture_date, String price_expiry_date);
    public void deleteProduct (int pid);
    public void getAllProducts();
    public  void updateById(int pid);
    public void deletecat( String cat);
    public  void findProductByCat(String cat);
    public  void findProductById(int ID);


}

