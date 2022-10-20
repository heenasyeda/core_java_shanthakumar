package com.example.txservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.txservice.entity.Tx;
import com.example.txservice.repository.TxRepository;

@Service
public class TxServiceImpl implements TxService {

	@Autowired
	private TxRepository txRepository;

	@Override
	public void delete(Tx entity) {
		txRepository.delete(entity);
	}

	@Override
	public void deleteAll() {
		txRepository.deleteAll();
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		txRepository.deleteAllById(ids);
	}

	@Override
	public void deleteById(Long id) {
		txRepository.deleteById(id);
	}

	@Override
	public List<Tx> findAll() {
		return txRepository.findAll();
	}

	@Override
	public List<Tx> findAllById(Iterable<Long> ids) {
		return txRepository.findAllById(ids);
	}

	@Override
	public Optional<Tx> findById(Long id) {
		return txRepository.findById(id);
	}

	@Override
	public Tx getById(Long id) {
		return txRepository.getById(id);
	}


	@Override
    public List<Tx> getTxByAll() {
        
        return txRepository.findAll();
    }
	 @Override
	    public Tx createTx(Tx tx) {
	        return txRepository.save(tx) ;
	    }



	   @Override
	    public Tx getTxById(Long id) {
	        return txRepository.findById(id).get();
	    }

	@Override
	public List<Tx> getAllBy() {
		// TODO Auto-generated method stub
		return null;
	}

	  

}
