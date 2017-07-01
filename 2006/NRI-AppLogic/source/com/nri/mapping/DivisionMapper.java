/*
 * Created on 17.07.2007
 *
 * Mapper подразделений предприятия.
 */
package com.nri.mapping;

import java.util.ArrayList;
import java.util.List;

import com.nri.domain.Division;
import com.nri.domain.DivisionType;
import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * Mapper подразделений предприятия.
 */
public interface DivisionMapper extends Mapper {
	public Division findById(Integer id) throws MappingException;
	public ArrayList findByName(String name, Integer company, Boolean isActive, String orderBy) throws MappingException;
	public ArrayList findDivisionsHierarchy(Integer encloserKey, Boolean isActive, String orderBy) throws MappingException;
	public ArrayList findByName(String name, Integer company, Boolean isActive, DivisionType type, String orderBy) throws MappingException;
	public List findDivisionHierarchyForEncloser(Integer encloserKey, int depth) throws MappingException;
}
