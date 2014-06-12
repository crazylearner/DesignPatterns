package com.demo.iterator.aggregates;

import java.util.ArrayList;
import java.util.List;

import com.demo.iterator.iterators.IteratorInterface;

public class SongCollection<T> implements CollectionInterface<T> {
	
	private class SongIterator<T1> implements IteratorInterface<T1> {

		private int curPosition; 
		private CollectionInterface<T1> collectionObj;
		
		public SongIterator(CollectionInterface<T1> collectionObj){
			this.collectionObj = collectionObj;
			this.curPosition = 0;
		}
		
		@Override
		public T1 first() {
			return collectionObj.get(0);
		}

		@Override
		public T1 next() {
			return collectionObj.get(curPosition++);
		}

		@Override
		public boolean hasNext() {
			if(collectionObj.count() > curPosition)
				return true;
			else
				return false;
		}

		@Override
		public T1 last() {
			return collectionObj.get(collectionObj.count()-1);
		}

	}
	
	
	List<T> songs;
	
	public SongCollection() {
		songs = new ArrayList<>();
	}
	
	@Override
	public boolean add(T value) {
		songs.add(value);
		return true;
	}

	@Override
	public int count() {
		return songs.size();
	}

	@Override
	public T remove(int index) {
		return songs.remove(index);
	}

	@Override
	public T get(int index) {
		return songs.get(index);
	}

	@Override
	public IteratorInterface<T> iterator() {
		IteratorInterface<T> iterator = new SongIterator<T>(this);
		return iterator;
	}

}
