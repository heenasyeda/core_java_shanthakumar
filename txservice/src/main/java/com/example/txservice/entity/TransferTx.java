package com.example.txservice.entity;

import java.time.LocalDateTime;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("transfer")
public class TransferTx  extends Tx{
    
    private int fromAccount;
    private int toAccount;
    private int traxId;
    private int transferAmount;
    
    
    public TransferTx() {
        super();
    }
    public TransferTx(float amount, boolean debit, LocalDateTime txTime, long accountId) {
        super(amount, debit, txTime, accountId);
    }
    public TransferTx(long id, float amount, boolean debit, LocalDateTime txTime, long accountId) {
        super(id, amount, debit, txTime, accountId);
    }
    public TransferTx(int fromAccount, int toAccount, int traxId, int transferAmount) {
        super();
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.traxId = traxId;
        this.transferAmount = transferAmount;
    }
    @Override
    public String toString() {
        return "TransferTx [fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", traxId=" + traxId
                + ", transferAmount=" + transferAmount + "]";
    }
    public int getFromAccount() {
        return fromAccount;
    }
    public void setFromAccount(int fromAccount) {
        this.fromAccount = fromAccount;
    }
    public int getToAccount() {
        return toAccount;
    }
    public void setToAccount(int toAccount) {
        this.toAccount = toAccount;
    }
    public int getTraxId() {
        return traxId;
    }
    public void setTraxId(int traxId) {
        this.traxId = traxId;
    }
    public int getTransferAmount() {
        return transferAmount;
    }
    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }
    
    
    



}
