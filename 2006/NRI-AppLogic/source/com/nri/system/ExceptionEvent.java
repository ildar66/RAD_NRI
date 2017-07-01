package com.nri.system;

import java.io.*;
/**
 * Intances of this type will be generated by exception handling Dispatcher and
 * forwarded to isntalled exception handlers, 
 */
public class ExceptionEvent {
	String fieldStack = "";
	protected transient java.beans.PropertyChangeSupport propertyChange = new java.beans.PropertyChangeSupport(this);
	String fieldName = "";
	java.util.Date fieldDate = null;
	public Throwable exception = null;
/**
 * This method was created in VisualAge.
 * @param e java.lang.Throwable
 */
public ExceptionEvent(Throwable e) {


	exception = e;
	StringWriter s = new StringWriter();
	PrintWriter p = new PrintWriter(s);
	e.printStackTrace(p);
	
	setDate( new java.util.Date() );
	setName( e.toString());
	setStack( s.toString() );
	

	
}
/**
 * The addPropertyChangeListener method was generated to support the propertyChange field.
 */
public synchronized void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
	propertyChange.addPropertyChangeListener(listener);
}
/**
 * The firePropertyChange method was generated to support the propertyChange field.
 */
public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
	propertyChange.firePropertyChange(propertyName, oldValue, newValue);
}
/**
 * Gets the date property (java.util.Date) value.
 * @return The date property value.
 * @see #setDate
 */
public java.util.Date getDate() {
	/* Returns the date property value. */
	if (fieldDate == null) {
		try {
			fieldDate = new java.util.Date();
		} catch (Throwable exception) {
			System.err.println("Exception creating date property.");
		}
	};
	return fieldDate;
}
/**
 * Gets the name property (java.lang.String) value.
 * @return The name property value.
 * @see #setName
 */
public String getName() {
	/* Returns the name property value. */
	if (fieldName == null) {
		try {
			fieldName = new String();
		} catch (Throwable exception) {
			System.err.println("Exception creating name property.");
		}
	};
	return fieldName;
}
/**
 * Gets the stack property (java.lang.String) value.
 * @return The stack property value.
 * @see #setStack
 */
public String getStack() {
	/* Returns the stack property value. */
	if (fieldStack == null) {
		try {
			fieldStack = new String();
		} catch (Throwable exception) {
			System.err.println("Exception creating stack property.");
		}
	};
	return fieldStack;
}
/**
 * Output meaningful exception event string to console....
 */
public String info() {


	String result = "* * * Exception occur * * * \n";
	result += "Date: "+getDate()+"\n";
	result += "Exception: "+getName()+"\n Stack: "+getStack();
	result += "\n* * * end";

	return result;

		


	
}
/**
 * This method was created in VisualAge.
 */
void newMethod() {
}
/**
 * The removePropertyChangeListener method was generated to support the propertyChange field.
 */
public synchronized void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
	propertyChange.removePropertyChangeListener(listener);
}
/**
 * Sets the date property (java.util.Date) value.
 * @param date The new value for the property.
 * @see #getDate
 */
public void setDate(java.util.Date date) {
	/* Get the old property value for fire property change event. */
	java.util.Date oldValue = fieldDate;
	/* Set the date property (attribute) to the new value. */
	fieldDate = date;
	/* Fire (signal/notify) the date property change event. */
	firePropertyChange("date", oldValue, date);
	return;
}
/**
 * Sets the name property (java.lang.String) value.
 * @param name The new value for the property.
 * @see #getName
 */
public void setName(String name) {
	/* Get the old property value for fire property change event. */
	String oldValue = fieldName;
	/* Set the name property (attribute) to the new value. */
	fieldName = name;
	/* Fire (signal/notify) the name property change event. */
	firePropertyChange("name", oldValue, name);
	return;
}
/**
 * Sets the stack property (java.lang.String) value.
 * @param stack The new value for the property.
 * @see #getStack
 */
public void setStack(String stack) {
	/* Get the old property value for fire property change event. */
	String oldValue = fieldStack;
	/* Set the stack property (attribute) to the new value. */
	fieldStack = stack;
	/* Fire (signal/notify) the stack property change event. */
	firePropertyChange("stack", oldValue, stack);
	return;
}
}
