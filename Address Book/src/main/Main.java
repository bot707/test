package main;

public class Main {
	public static void main(String[] args){
			AddressBook tempAddressBook = new AddressBook();
			Address testAddress1 = new Address();
			Address testAddress2 = new Address("Serg Bir", new PostalAddress("404002", new Country("Russia", 1), "Volgograd", "Barrikadnaya", "1b"), "9996663322");
			Address testAddress3 = new Address("Rose D Marker", new PostalAddress("43537", new Country("USA", 2), "Maumee", "Carriage Lane", "545"), "5674548020");
			tempAddressBook.addNewAddress(testAddress1);
			tempAddressBook.addNewAddress(testAddress2);
			tempAddressBook.addNewAddress(testAddress3);
			Address tempAddress = tempAddressBook.getAddress("Serg Bir");
			if(tempAddress != null){
				tempAddress.printName();
				tempAddress.printPhoneNumber();
				tempAddress.printAddress();
				System.out.println(tempAddress.toString());
			}
			else{
				System.out.println("Addressee not found");
			}
	}
}