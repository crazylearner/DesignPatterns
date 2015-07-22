package com.demo.visitor.visitable;

import com.demo.visitor.visitors.IVisitor;

public interface IVisitable {
	public void accept(IVisitor v);
}
