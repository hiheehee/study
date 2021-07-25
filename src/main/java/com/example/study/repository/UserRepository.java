package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstByPhoneNumberOrderByIdDesc(String phoneNumber);
}