package com.example.Toydemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Toydemo.Model.ToyDemo;

@Repository
public interface ToyRepository extends JpaRepository<ToyDemo,Integer> {

}
