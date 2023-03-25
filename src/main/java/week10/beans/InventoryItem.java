/**
 * 
 */
package week10.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Mar 15, 2023
 */
@Entity
public class InventoryItem {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String price;
	private String quant;
	@Autowired
	private InvLocation invLocation; 
	
	public InventoryItem() {
		
	}
	
	public InventoryItem(String name, String price, String quant) {
		this.name=name;
		this.price=price;
		this.quant=quant;
	}
	
	public InventoryItem(String name) {
		this.name=name;
	}

	public InventoryItem(long id, String name, String price, String quant, InvLocation invLocation) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quant = quant;
		this.setInvLocation(invLocation);
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the quant
	 */
	public String getQuant() {
		return quant;
	}

	/**
	 * @param quant the quant to set
	 */
	public void setQuant(String quant) {
		this.quant = quant;
	}

	/**
	 * @return the invLocation
	 */
	public InvLocation getInvLocation() {
		return invLocation;
	}

	/**
	 * @param invLocation the invLocation to set
	 */
	public void setInvLocation(InvLocation invLocation) {
		this.invLocation = invLocation;
	}

	@Override
	public String toString() {
		return "InventoryItem [id=" + id + ", name=" + name + ", price=" + price + ", quant=" + quant + ", invLocation="
				+ invLocation + "]";
	}
	
	
	
}
