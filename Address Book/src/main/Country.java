package main;

public class Country {
	
	/**
	 * Country name of this country
	 */
	private String countryName;
	/**
	 * Country group of this country. 
	 * Format of address is chosen according to value in this field
	 */
	private int countryGroup;
	
	/**
	 * Class constructor specifying country name and country group
	 * @param countryName Name of country
	 * @param countryGroup Group of country
	 */
	public Country(String countryName, int countryGroup){
		if(countryGroup>2){
			throw new IllegalArgumentException("Incorrect group for country");
		}
		else{
			this.countryName = countryName;
			this.countryGroup = countryGroup;
		}
	}
	/**
	 * Returns country name of this country
	 * @return country name
	 */
	public String getCountryName(){
		return countryName;
	}
	
	/**
	 * Returns country group of this country
	 * @return countryGroup
	 */
	public int getCountryGroup(){
		return countryGroup;
	}
	
	/**
	 * Sets country name for this country
	 * @param countryName Name of country
	 */
	public void setCountryName(String countryName){
		this.countryName = countryName;
	}
	/**
	 * Sets country group for this country
	 * @param countryGroup Group of country
	 */
	public void setCountryGroup(int countryGroup){
		this.countryGroup = countryGroup;
	}
}
