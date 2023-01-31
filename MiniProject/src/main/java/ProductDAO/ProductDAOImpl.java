package ProductDAO;

import JDBC.JDBCUtils;
import Model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    private static final String INSERT_USERS_SQL = "INSERT INTO product" +
            "  (pid, pname,category, manufacture_Date,expiry_date) VALUES " +
            " (?, ?, ?, ?, ?);";

    @Override
    public void addProduct(int pid, String pname, String pcat, String manufacture_date, String price_expiry_date) {
        try {

            Connection connection=JDBCUtils.getCOnnection();
            PreparedStatement pstmt=connection.prepareStatement(INSERT_USERS_SQL);
            pstmt.setInt(1, pid);
            pstmt.setString(2, pname);
            pstmt.setString(3, pcat);
            pstmt.setString(4,manufacture_date );
            pstmt.setString(5, price_expiry_date);
            int count=pstmt.executeUpdate();
            if(count>0)
            {
                System.out.println("Record added into DB");
            }
            else {
                System.out.println("Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void deleteProduct(int pid) {
        try(
                Connection connection = JDBCUtils.getCOnnection()){
            String sql = "delete from product where pid= ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,pid);
            int count=preparedStatement.executeUpdate();
            if(count>0)
            {
                System.out.println("Record Deleted from DB");
            }
            else {
                System.out.println("Failed");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getAllProducts() {
        try (Connection connection = JDBCUtils.getCOnnection()) {
            String sql = "select * from product;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Product> ProductList = new ArrayList<>();
            while (resultSet.next()) {
                Product product = new Product(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)

                );

                ProductList.add(product);


            }
            System.out.println(ProductList);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void updateById(int pid) {

    }

    @Override
    public void deletecat(String catt) { try(
            Connection connection = JDBCUtils.getCOnnection()){
        String sql = "delete from product where category = ? ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,catt);
        int count=preparedStatement.executeUpdate();
        if(count>0)
        {
            System.out.println("Records Deleted from Category:" + catt);
        }
        else {
            System.out.println("Failed");
        }


    } catch (SQLException e) {
        e.printStackTrace();
    }

    }

    @Override
    public void findProductByCat(String cat) {
        try (Connection connection = JDBCUtils.getCOnnection()) {
            String sql = "select * from product where category = ? ;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,cat);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Product> ProductList = new ArrayList<>();
            while (resultSet.next()) {
                Product product = new Product(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)

                );

                ProductList.add(product);


            }
            System.out.println(ProductList);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void findProductById(int ID) {
        try (Connection connection = JDBCUtils.getCOnnection()) {
            String sql = "select * from product where pid = ? ;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)

                );
                System.out.println(product);

            }
        } catch (SQLException e) {
            e.printStackTrace();


        }


    }}



