package com.Controller;

import com.Entity.Account;


import com.Service.accountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
    @Autowired
    accountServiceImpl userService;

    @PostMapping("/user")
    public Account AddUser(@Validated @RequestBody Account user){
       return userService.saveUser(user);
       }

    @GetMapping("/users")
    public List<Account> getallusers(){
        return userService.getAllAccounts();
    }
    @GetMapping("/admins")
    public  List<Account> getalladmins(){
        return userService.getAllAdmins();
    }

    @GetMapping("/clients")
    public  List<Account> getallclients(){
        return userService.getAllClients();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Account> getUserByidd(@PathVariable Integer id){
        return userService.GetUserByID(id);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Integer id){
        return userService.deleteAccount(id);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable Integer id, @RequestBody Account accountDetails){
        return userService.updateAccount(id, accountDetails);
    }



}
