package com.example.txservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.txservice.entity.Tx;

@Repository
public interface TxRepository extends JpaRepository<Tx,Long> {

}
