package com.demo.iterator.aggregates;

import com.demo.iterator.iterators.IteratorInterface;

public interface CollectionInterface<T> {
	public boolean add(T value);
	public int count();
	public T remove(int index);
	public T get(int index);
	public IteratorInterface<T> iterator();
}
