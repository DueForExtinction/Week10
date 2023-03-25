/**
 * 
 */
package week10.beans;

import jakarta.persistence.Embeddable;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Mar 24, 2023
 */
@Embeddable
public class InvLocation {
	public String locationLetter;
	public String locationNum;
	
	
	public InvLocation() {
	}
	
	
	public InvLocation(String locationLetter, String locationNum) {
		this.locationLetter = locationLetter;
		this.locationNum = locationNum;
	}


	/**
	 * @return the locationLetter
	 */
	public String getLocationLetter() {
		return locationLetter;
	}
	/**
	 * @param locationLetter the locationLetter to set
	 */
	public void setLocationLetter(String locationLetter) {
		this.locationLetter = locationLetter;
	}
	/**
	 * @return the locationNum
	 */
	public String getLocationNum() {
		return locationNum;
	}
	/**
	 * @param locationNum the locationNum to set
	 */
	public void setLocationNum(String locationNum) {
		this.locationNum = locationNum;
	}


	@Override
	public String toString() {
		return "InvLocation [locationLetter=" + locationLetter + ", locationNum=" + locationNum + "]";
	}
	
	
	
}
