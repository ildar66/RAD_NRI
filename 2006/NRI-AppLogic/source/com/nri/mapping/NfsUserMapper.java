/*
 * Created on 17.07.2007
 *
 * Mapper Пользователь системы NFS.
 */
package com.nri.mapping;

import java.util.ArrayList;

import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * Mapper Пользователь системы NFS.
 */
public interface NfsUserMapper extends Mapper {
	//public NfsUser findById(Integer id) throws MappingException;
	public ArrayList findByName(String name, Boolean isActive, String orderBy) throws MappingException;
}
