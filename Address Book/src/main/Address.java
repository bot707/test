package main;

public class Address {
	/**
	 * Name of addressee
	 */
	private String name;
	/**
	 * Postal address of addressee
	 */
	private PostalAddress postalAddress;
	/**
	 * Phone number of addressee
	 */
	private String phoneNumber;
	/**
	 * Templates of phone number format
	 */
	private String[] pFormat = {"x-xxx-xx-xx-xx","xxx-xxx-xx-xx","xxx-xxx-xxxx"};
	
	/**
	 * Address constructor specifying default address
	 */
	public Address(){
		name = "Test user";
		postalAddress = new PostalAddress("92121", new Country("testCountry", 0), "testCity", "testCountry", "999");
		phoneNumber = "0000000000";
	}
	
	/**
	 * Address constructor specifying name, postal address and phone number
	 * @param name Name of addressee
	 * @param postalAddress Postal address of addressee
	 * @param phoneNumber Phone number of addressee
	 */
	public Address(String name, PostalAddress postalAddress, String phoneNumber){
		this.name = name;
		this.postalAddress = new PostalAddress(postalAddress.getPostalCode(), postalAddress.getCountry(), postalAddress.getCity(), postalAddress.getStreet(), postalAddress.getHouse());
		this.phoneNumber = phoneNumber;
	}
	/**
	 * Sets name for this addressee
	 * @param name name of addressee
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Sets postal for this addressee 
	 * @param postalAddress postal address of addressee
	 */
	public void setPostalAddress(PostalAddress postalAddress){
		this.postalAddress.setPostalCode(postalAddress.getPostalCode());
		this.postalAddress.setCountry(postalAddress.getCountry());
		this.postalAddress.setCity(postalAddress.getCity());
		this.postalAddress.setStreet(postalAddress.getStreet());
		this.postalAddress.setHouse(postalAddress.getHouse());
	}
	/**
	 * Sets phoneNumber for this addressee 
	 * @param phoneNumber phone number of addressee
	 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Returns name of this addressee
	 * @return name of addressee
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Returns postal address of this addressee
	 * @return postal address of addressee
	 */
	public PostalAddress getPostalAddress(){
		return new PostalAddress(postalAddress.getPostalCode(), postalAddress.getCountry(), postalAddress.getCity(), postalAddress.getStreet(), postalAddress.getHouse());
	}
	
	/**
	 * Returns phone number of addressee
	 * @return phone number of addressee
	 */
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	/**
	 * Formats phone number according to provided format
	 * Format phone number can be presented as "xxx-xxx-xx-xx"
	 * Any symbols can be used as splitter
	 * @param format template for output phone number
	 * @return phone number in specified format
	 */
	private String formatPhoneNumber(String format){
		int countX = 0;
		for(char s : format.toCharArray()){
			if(s == 'x'){
				countX++;
			}
		}
		if(countX != 10){
			throw new IllegalArgumentException("Incorrect phone number format string");
		}
		else{
			StringBuilder result = new StringBuilder("");
			char[] phone = this.phoneNumber.toCharArray();
			int i=0;
			for(char s : format.toCharArray()){
				if(s == 'x'){
					result.append(phone[i]);
					i++;
				}
				else{
					result.append(s);
				}
			}
			return result.toString();
		}
	}
	
	/**
	 * Prints in console name of addressee
	 */
	public void printName(){
		System.out.println(name);
	}
	/**
	 * Prints in console postal address of addressee
	 */
	public void printAddress(){
		System.out.println(postalAddress.toString());
	}
	/**
	 * Prints in console phone number of addressee
	 */
	public void printPhoneNumber(){
		System.out.println(formatPhoneNumber(pFormat[postalAddress.getCountry().getCountryGroup()]));
	}
	
	/**
	 * Returns Address instance as string
	 */
	@Override
	public String toString(){
		return this.name + " " + formatPhoneNumber(pFormat[postalAddress.getCountry().getCountryGroup()]) + " " + postalAddress.toString();
	}
}
