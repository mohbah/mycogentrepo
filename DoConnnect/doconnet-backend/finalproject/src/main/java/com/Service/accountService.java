package com.Service;

import com.Entity.Account;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface accountService {
    Account saveUser(Account account);
    List<Account> getAllAccounts();
    List<Account> getAllAdmins();
    List<Account> getAllClients();
    ResponseEntity<Account> GetUserByID(Integer id);
    ResponseEntity<Map<String, Boolean>> deleteAccount(Integer id);
    ResponseEntity<Account> updateAccount(Integer id, Account account);





}

