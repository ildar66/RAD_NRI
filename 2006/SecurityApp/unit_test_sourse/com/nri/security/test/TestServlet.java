package com.nri.security.test;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.htmlui.TestServletBase;

/**
 * @version 	1.0
 * @author
 */
public class TestServlet extends TestServletBase {

	/**
	 * Constructor for TestServlet
	 */
	public TestServlet() {
		super();
	}

	/**
	 * @see TestServletBase#getDynamicClassLoader()
	 */
	protected ClassLoader getDynamicClassLoader() {
		return this.getClass().getClassLoader();
	}

}
