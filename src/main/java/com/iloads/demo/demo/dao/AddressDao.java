/**
 * 
 */
package com.iloads.demo.demo.dao;

import java.util.HashMap;
import java.util.Map;

import com.iloads.demo.demo.domain.Address;

/**
 * @author WDSI - Arockiasamy
 *
 */
public class AddressDao {
	
	Map<Integer, Address> addressDetails = new HashMap<>();
	
	public Boolean add(Address address) {
		addressDetails.put(address.getId(), address);
		return true;
	}

}
