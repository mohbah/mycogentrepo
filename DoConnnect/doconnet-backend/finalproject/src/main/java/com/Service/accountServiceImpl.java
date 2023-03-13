package com.Service;

import com.Entity.Account;


import com.Exception.AccountNotFoundException;
import com.Repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
public class accountServiceImpl implements accountService {

    @Autowired
    private AccountRepository userRepository;


    @Override
    public Account saveUser(Account user) {
        return userRepository.save(user);
    }

    @Override
    public List<Account> getAllAccounts() {
        return userRepository.findAll();
    }

    @Override
    public List<Account> getAllAdmins() {
        return userRepository.findByUsertype(true);

    }

    @Override
    public List<Account> getAllClients() {

        return userRepository.findByUsertype(false);
    }

    @Override
    public ResponseEntity<Account> GetUserByID(Integer idi) {

        Account account = userRepository.findById(idi)
                .orElseThrow(()->new AccountNotFoundException("Account does not exist with id : " + idi));

        return ResponseEntity.ok(account);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteAccount(Integer id) {
        Account account = userRepository.findById(id)
                .orElseThrow(()->new AccountNotFoundException("Account does not exist with id : " + id));
        userRepository.delete(account);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);


    }

    @Override
    public ResponseEntity<Account> updateAccount(Integer id, Account account) {
        Account acc = userRepository.findById(id)
                .orElseThrow(()->new AccountNotFoundException("Account does not exist with id : " + id));
        acc.setName(account.getName());
        acc.setUsername(account.getUsername());
        acc.setPassword(account.getPassword());
        acc.setEmail(account.getEmail());
        Account updated = userRepository.save(acc);
        return ResponseEntity.ok(updated);
    }
}
