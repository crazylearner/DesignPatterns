package com.demo.visitor.visitors;

public class SodexoVisitor implements IVisitor {
	private float discount = 0.1f;
	private float totalAmount;
	
	@Override
	public void visit(float amount) {
		totalAmount+= ( amount *(1-discount));
	}

	@Override
	public float getBillAmount() {
		return totalAmount;
	}
}
