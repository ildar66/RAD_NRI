/*
 * Created on 30.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.tests.junit.ejb;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class AllEJBTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for com.nri.tests.junit.ejb");
		//$JUnit-BEGIN$
		suite.addTest(new TestSuite(NriActionProcessorTests.class));
		//$JUnit-END$
		return suite;
	}
}
