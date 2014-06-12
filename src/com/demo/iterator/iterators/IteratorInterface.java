package com.demo.iterator.iterators;

public interface IteratorInterface<T> {
	public T first();
	public T next();
	public boolean hasNext();
	public T last();
}
