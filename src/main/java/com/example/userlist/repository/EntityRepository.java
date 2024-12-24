package com.example.userlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userlist.model.Usermodel;

public interface EntityRepository extends JpaRepository<Usermodel, Long> {
}
