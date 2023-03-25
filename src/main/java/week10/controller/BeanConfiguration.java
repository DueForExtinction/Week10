/**
 * 
 */
package week10.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import week10.beans.InvLocation;
import week10.beans.InventoryItem;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Mar 15, 2023
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public InventoryItem item() {
		InventoryItem bean = new InventoryItem();
		return bean;
	}
	
	@Bean
	public InvLocation invLocation() {
		InvLocation bean = new InvLocation();
		return bean;
	}
	
}
