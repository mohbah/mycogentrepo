package com.Repository;

import com.Entity.Account;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    List<Account> findByUsertype(Boolean x);
    Account findByName(String string);





}
