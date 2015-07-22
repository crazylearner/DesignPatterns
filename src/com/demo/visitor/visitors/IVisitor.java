package com.demo.visitor.visitors;

public interface IVisitor {
	public void visit(float amount);
	public float getBillAmount();
}
