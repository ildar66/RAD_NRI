/*
 * Created on 05.09.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.value;

import java.io.Serializable;
import java.util.ArrayList;

import com.nri.domain.Company;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Companys implements Serializable {
	private ArrayList companys = null;

	public Companys() {
	}

	public Companys(ArrayList companys) {
		this.companys = companys;
	}

	public Company[] getCompany() {
		if (companys == null)
			return null;
		int numToCopy = companys.size();
		Company[] comps = new Company[numToCopy];
		for (int i = 0; i < numToCopy; i++) {
			comps[i] = (Company) companys.get(i);
		}
		return comps;
	}

	public Company getCompany(int index) {
		if (companys == null)
			return null;
		return (Company) companys.get(index);
	}

}
