package com.example.pasir_polinski_piotr.repository;

import com.example.pasir_polinski_piotr.model.Group;
import com.example.pasir_polinski_piotr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findByMemberships_User(User user);
}
