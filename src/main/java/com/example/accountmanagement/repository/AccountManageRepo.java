package com.example.accountmanagement.repository;

import com.example.accountmanagement.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountManageRepo extends JpaRepository<Account, Long> {

    @Query("select a from Account a where a.role = ?1")
    Account findByRole(Integer role);
}
