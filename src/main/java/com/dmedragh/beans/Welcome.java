/**
 * 
 */
package com.dmedragh.beans;

/**
 * @author yacine
 *
 */
public class Welcome {
	
	/**
	 * Message attribute
	 */
	public String messaage;
	
	/**
	 * 
	 */
	public Welcome() {
	}

	
	
	/**
	 * @param messaage
	 */
	public Welcome(String messaage) {
		super();
		this.messaage = messaage;
	}



	/**
	 * @return the messaage
	 */
	public String getMessaage() {
		return messaage;
	}

	/**
	 * @param messaage the messaage to set
	 */
	public void setMessaage(String messaage) {
		this.messaage = messaage;
	}
	
	

}
