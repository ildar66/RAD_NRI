/*
 * Created on 23.08.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.domain;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Direction extends DivisionType {

	/**
	 * 
	 */
	public Direction() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.nri.domain.DivisionType#getTypeName()
	 */
	public String getTypeName() {
		return "Дирекция";
	}

	/* (non-Javadoc)
	 * @see com.nri.domain.DivisionType#getType()
	 */
	public String getType() {
		return "D";
	}

}
