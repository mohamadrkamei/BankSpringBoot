package com.example.bankspringboot.repository;

import com.example.bankspringboot.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

}
