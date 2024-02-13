package com.vw.LibraryManangementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vw.LibraryManangementSystem.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	public List<User> findByUserId(int userId);
}
