package org.sid.ebankingbackend.repositories;

import org.sid.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepositories extends JpaRepository<BankAccount,String>{}