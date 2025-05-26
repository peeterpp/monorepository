package com.example.pasir_polinski_piotr.repository;

import com.example.pasir_polinski_piotr.model.Debt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DebtRepository extends JpaRepository<Debt, Long> {
    List<Debt> findByGroupId(Long groupId);
}
