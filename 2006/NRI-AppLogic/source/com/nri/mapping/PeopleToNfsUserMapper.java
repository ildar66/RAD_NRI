/*
 * Created on 14.09.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.nri.mapping;

import java.util.ArrayList;

import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface PeopleToNfsUserMapper extends Mapper {
	public ArrayList findPeopleToNfsUsers(Integer peopleKey, String orderBy) throws MappingException;
	public void deleteLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException;
	public void setMainLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException;
	public void addLinkPeopleToNfsUser(Integer peopleKey, Integer nfsUserKey) throws MappingException;
}
