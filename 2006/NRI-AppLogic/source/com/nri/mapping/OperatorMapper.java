/*
 * Created on 12.09.2007
 *
 * Mapper операторов NRI.
 */
package com.nri.mapping;

import java.util.ArrayList;

import com.nri.domain.Operator;
import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * Mapper операторов NRI.
 */
public interface OperatorMapper extends Mapper {
	public Operator findById(Integer id) throws MappingException;
	public ArrayList findOperators(Integer peopleKey, String orderBy) throws MappingException; 
}
