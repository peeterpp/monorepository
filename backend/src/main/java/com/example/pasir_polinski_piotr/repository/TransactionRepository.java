package com.example.pasir_polinski_piotr.repository;

import com.example.pasir_polinski_piotr.model.Transaction;
import com.example.pasir_polinski_piotr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUser(User user);
}
