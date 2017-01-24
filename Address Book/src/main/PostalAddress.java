package main;

public class PostalAddress {
	/**
	 * Postal code of this address
	 */
	private String postalCode;
	/**
	 * Country of this address
	 */
	private Country country;
	/**
	 * City name of this address
	 */
	private String city;
	/**
	 * Street name of this address
	 */
	private String street;
	/**
	 * House number of this address
	 */
	private String house;
	
	private String[] aFormat = {"postalCode country city street house","street house, city, country, postalCode", "postalCode house street city country"};
	
	/**
	 * Class constructor specifying postal code, Country instance, name of city, name of street, number of house
	 * @param postalCode postal code of city
	 * @param country country of addressee
	 * @param city city name of addressee
	 * @param street street name of addressee
	 * @param house house number of addressee
	 */
	public PostalAddress(String postalCode, Country country, String city, String street, String house){
		this.postalCode = postalCode;
		this.country = new Country(country.getCountryName(), country.getCountryGroup());
		this.city = city;
		this.street = street;
		this.house = house;
	}
	
	/**
	 * Return postal code of this address 
	 * @return postal code of address
	 */
	public String getPostalCode(){
		return postalCode;
	}
	/**
	 * Returns city name of this address
	 * @return citi name of address
	 */
	public String getCity(){
		return city;
	}
	/**
	 * Returns street name of this address
	 * @return street name of address
	 */
	public String getStreet(){
		return street;
	}
	/**
	 * Returns house number of this address
	 * @return
	 */
	public String getHouse(){
		return house;
	}
	/**
	 * Return country of this address
	 * @return new Country instance of address
	 */
	public Country getCountry(){
		return new Country(country.getCountryName(), country.getCountryGroup());
	}
	
	/**
	 * Sets postal code for this address
	 * @param postalCode postal code of address
	 */
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	/**
	 * Sets city name for this address
	 * @param city city name of address
	 */
	public void setCity(String city){
		this.city = city;
	}
	/**
	 * Sets street name for this address
	 * @param street street name of address
	 */
	public void setStreet(String street){
		this.street = street;
	}
	
	/**
	 * Sets house number for this address
	 * @param house
	 */
	public void setHouse(String house){
		this.house = house;
	}

	/**
	 * Sets country for this address
	 * @param country Country instance of address
	 */
	public void setCountry(Country country){
		this.country.setCountryName(country.getCountryName());
		this.country.setCountryGroup(country.getCountryGroup());
	}
	
	/**
	 * Formats address according to provided format
	 * Next keyWord should be used for create own format:
	 * city, postalCode, country, street, house
	 * e.g. "postalcode country, city, street house"
	 * @param format template for output address
	 * @return address in specified format
	 */
	private String formatAddress(String format){
		String pCode = "postalCode";
		String country = "country";
		String city = "city";
		String street = "street";
		String house = "house";
		if (!format.contains(pCode) || !format.contains(country) || !format.contains(city) || !format.contains(street) || !format.contains(house)){
			throw new IllegalArgumentException("Missing part of address in format string");
		}
		else{
			StringBuilder result = new StringBuilder(format);
			String[] addressFormat = format.split(" ");
			if(addressFormat.length != 5){
				throw new IllegalArgumentException("Incorerct splitter in format string");
			}			
			else{
				result.replace(result.indexOf(pCode), result.indexOf(pCode) + pCode.length(), this.postalCode);
				result.replace(result.indexOf(country), result.indexOf(country) + country.length(), this.country.getCountryName());
				result.replace(result.indexOf(city), result.indexOf(city) + city.length(), this.city);
				result.replace(result.indexOf(street), result.indexOf(street) + street.length(), this.street);
				result.replace(result.indexOf(house), result.indexOf(house) + house.length(), this.house);
			}
			return result.toString();
		}
	}
	
	/**
	 * Returns PostalAddress instance as string
	 */
	@Override
	public String toString(){
		return formatAddress(aFormat[country.getCountryGroup()]);
	}

}
