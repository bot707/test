package main;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OwnList<T> implements Iterable<T>{
	
	private Entry firstEntry;
	private Entry lastEntry;
	private int count;
	
	/**
	 * List constructor specifying default parameters
	 */
	public OwnList(){
		this.firstEntry = new Entry(null);
		this.lastEntry = firstEntry;
		count = 0;
	}
	
	/**
	 * Checks that list is empty
	 * @return true if list is empty
	 */
	public boolean isEmpty(){
		return this.count == 0;
	}
	
	/**
	 * Adds new entry in the end of list
	 * @param data new entry
	 */
	public void addEntry(T data){
		Entry addingEntry = new Entry(data);
		if(isEmpty()){
			firstEntry.nextEntry = addingEntry;
			lastEntry = addingEntry;
		}
		else{
			lastEntry.nextEntry = addingEntry;
			lastEntry = addingEntry;
		}
		this.count++;
	}

	/**
	 * Reverts list
	 */
	public void revertList(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		else{
			Entry previous = null;
			Entry current = firstEntry.nextEntry;
			Entry next = null;
			while(current != null){
				next = current.nextEntry;
				current.nextEntry = previous;
				previous = current;
				current = next;
			}
			firstEntry.nextEntry = previous;
		}
	}

	@Override
	public String toString(){
		StringBuilder result = new StringBuilder("{");
		Entry current = this.firstEntry;

		while(current.nextEntry.nextEntry != null){
			result.append(" " + current.nextEntry.data.toString()+ ",");
			current = current.nextEntry;
		}

		result.append(" " + current.nextEntry.data.toString() + " }");
		return result.toString();
	}
	
	/**
	 * Removes entry from list by index
	 * @param index index of entry
	 */
	public void removeEntry(int index){
		if(index > count){
			throw new IndexOutOfBoundsException();
		}
		else{
			Entry temp = this.firstEntry.nextEntry;
			Entry current = temp;
			int i = 0;
			if(index == 0){
				firstEntry.nextEntry = temp.nextEntry;
			}
			else{
				while(i != index - 1){
					current = current.nextEntry;
					i++;
				}
				if(current.nextEntry != null){
					current.nextEntry = current.nextEntry.nextEntry;
				}
				else{
					current.nextEntry = null;
				}
			}
			count--;
		}
	}
	
	/**
	 * Returns number of elements
	 * @return number of elements
	 */
	public int count(){
		return count;
	}
	

	/**
	 * Returns reference to iterator of list
	 */
	public Iterator<T> iterator(){
		return new OwnIterator(this);
	}
	
	private final class Entry{
		private T data;
		private Entry nextEntry;
		
		/**
		 * Entry constructor specifying only data of entry
		 * @param data data of entry
		 */
		public Entry(T data){
			this(data, null);
		}
		
		/**
		 * Entry constructor specifying data and reference to next entry
		 * @param data data of entry
		 * @param nextEntry reference to next entry
		 */
		public Entry(T data, Entry nextEntry){
			this.data = data;
			this.nextEntry = nextEntry;
		}
	}
	
	private class OwnIterator implements Iterator<T>{
		private OwnList<T> iterationList;
		private Entry current;
		/**
		 * Iterator constructor specifying list
		 * @param list 
		 */
		public OwnIterator(OwnList<T> list){
			this.iterationList = list;
			this.current = list.firstEntry;
		}
		
		@Override
		public boolean hasNext() {
			if(current.nextEntry != null){
				return true;
			}
			else{
				return false;
			}
		}
		

		@Override
		public T next() {
			if (iterationList.isEmpty()){
                throw new NoSuchElementException();
			}
			else{
				current = current.nextEntry;
				return current.data;
			}
		}
	}
}