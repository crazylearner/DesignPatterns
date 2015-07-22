package com.demo.visitor.visitable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.demo.visitor.visitors.IVisitor;

public class GroceryBill implements IVisitable {
	Map<String, Float> bill = new HashMap<String, Float>();
	
	public GroceryBill(Map<String, Float> bill) {
		this.bill = bill;
	}
	
	@Override
	public void accept(IVisitor v) {
		Iterator<String> iterator = this.bill.keySet().iterator();
		while(iterator.hasNext()){
			Float amt = this.bill.get(iterator.next());
			v.visit(amt);
		}
	}
}
