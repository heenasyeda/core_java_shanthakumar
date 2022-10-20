package com.example.txservice.service;

import java.util.List;
import java.util.Optional;

import com.example.txservice.entity.Tx;

public interface TxService {

	void delete(Tx entity);

	void deleteAll();

	void deleteAllById(Iterable<? extends Long> ids);

	void deleteById(Long id);

	List<Tx> findAll();

	List<Tx> findAllById(Iterable<Long> ids);

	Optional<Tx> findById(Long id);

	Tx getById(Long id);

	List<Tx> getTxByAll();

	Tx createTx(Tx tx);

	Tx getTxById(Long id);

	List<Tx> getAllBy();



}