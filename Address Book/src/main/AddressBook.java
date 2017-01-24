package main;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	/**
	 * List of entries
	 */
	private List<Address> addressBook = new ArrayList<>();
	
	/**
	 * Adds new addressee in list
	 * @param address 
	 */
	public void addNewAddress(Address address){
		this.addressBook.add(address);
	}
	
	/**
	 * Finds and returns addressee by name
	 * @param name Name of addressee
	 * @return Address instance or null if entry not found
	 */
	public Address getAddress(String name){
		for(Address a : addressBook){
			if(a.getName().equals(name)){
				return a;
			}
		}
		return null;
	}
}
