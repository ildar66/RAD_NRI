/*
 * Created on 19.09.2007
 *
 * Mapper Права доступа по филиалам региона.
 */
package com.nri.mapping;

import java.util.ArrayList;
import java.util.Collection;

import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * Mapper Права доступа по филиалам региона.
 */
public interface RegionAccessMapper extends Mapper {
	public ArrayList findOperatorToRegionList(Integer operatorKey, String orderBy) throws MappingException;
	public ArrayList findOperatorToRegionAccessList(Integer operatorKey, String orderBy) throws MappingException;
	public void saveRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException;
}
