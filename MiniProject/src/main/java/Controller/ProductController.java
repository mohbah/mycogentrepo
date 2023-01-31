package Controller;

import ProductDAO.ProductDAOImpl;

public class ProductController {

    ProductDAOImpl productDAO = new ProductDAOImpl();
    public void create(int pId, String pName, String pCat, String manufecture_date, String price_expiry_date)
    {
        productDAO.addProduct(pId, pName,pCat,manufecture_date, price_expiry_date);
    }

    public void remove(int pid){
        productDAO.deleteProduct(pid);
    }

    public void display(){
        productDAO.getAllProducts();
    }

    public void removebycat(String cat){
        productDAO.deletecat(cat);
    }

    public void findByCat(String cat){
        productDAO.findProductByCat(cat);
    }

    public void findByID(int id){
        productDAO.findProductById(id);
    }
}
