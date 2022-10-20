package com.example.txservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.txservice.entity.Tx;
import com.example.txservice.service.TxService;



@RestController
public class TxRestController {
	
	@Autowired
	private TxService  txService;
	
	@PostMapping("/api/tx")
    public Tx createTx( Tx tx){
        return txService.createTx(tx);
    }
    @GetMapping("/api/tx/{id}")
    public Tx getTxById(long id){
        return txService.getById(id);
    }
    @GetMapping("/api/tx")
    public List<Tx> getTxByAll(){
        return txService.getAllBy();
    }
}
