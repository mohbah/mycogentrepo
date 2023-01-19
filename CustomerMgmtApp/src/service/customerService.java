package service;

import dao.customerDaoImpl;
import model.Customer;

public class customerService {
    customerDaoImpl dao;
    public customerService(customerDaoImpl dd){
        this.dao = dd;
    }

    public void serviceCreate(){
        dao.create();
    }

    public void serviceRead(){
        dao.read();
    }

    public void serviceUpdate(String id){
        dao.update(id);
    }

    public void serviceDelete(String id){
        dao.delete(id);
    }

    public void serviceFindCustomerById(String id){
        dao.findCustomerById(id);
    }

    public void serviceFindYoungest(){
         dao.findYoungestCustomer();
    }




}
