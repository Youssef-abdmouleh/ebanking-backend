package org.sid.ebankingbackend.repositories;

import org.sid.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositories extends JpaRepository<Customer,Long>{}