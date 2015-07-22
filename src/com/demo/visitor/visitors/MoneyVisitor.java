package com.demo.visitor.visitors;

public class MoneyVisitor implements IVisitor {
	private float discount = 0.2F;
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
