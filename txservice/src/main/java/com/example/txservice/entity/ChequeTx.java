package com.example.txservice.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cheque")
public class ChequeTx extends Tx {

	private int chequeNo;
	private boolean outstation;
	private float collectionCharges;

	public ChequeTx() {
	}

	public ChequeTx(int chequeNo, boolean outstation, float collectionCharges) {
		super();
		this.chequeNo = chequeNo;
		this.outstation = outstation;
		this.collectionCharges = collectionCharges;
	}

	@Override
	public String toString() {
		return "ChequeTx [chequeNo=" + chequeNo + ", outstation=" + outstation + ", collectionCharges="
				+ collectionCharges + "]";
	}

	public int getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}

	public boolean isOutstation() {
		return outstation;
	}

	public void setOutstation(boolean outstation) {
		this.outstation = outstation;
	}

	public float getCollectionCharges() {
		return collectionCharges;
	}

	public void setCollectionCharges(float collectionCharges) {
		this.collectionCharges = collectionCharges;
	}

}