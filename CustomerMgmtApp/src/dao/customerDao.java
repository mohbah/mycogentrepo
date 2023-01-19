package dao;

import model.Customer;

public interface customerDao {
     void create();
     void read();
     void update(String id);
     void delete(String id);
     void findCustomerById(String id);
     void findYoungestCustomer();


}
