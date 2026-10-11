package com.bank.repository;

import com.bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository 
public interface AccountRepository extends JpaRepository<Account, Long> {

    // Spring Data JPA derives the sql query from the method name!
    Optional<Account> findByAccountNumber(String accountNumber);

    //Checking if an account already exists, it is useful for avpiding redundancy
    boolean existsByAccountNumber(String accountNumber);
}

