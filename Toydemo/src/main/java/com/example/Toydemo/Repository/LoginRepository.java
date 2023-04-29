package com.example.Toydemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Toydemo.Model.LoginModel;

@Repository
	public interface LoginRepository extends JpaRepository<LoginModel,Integer>{

	}

