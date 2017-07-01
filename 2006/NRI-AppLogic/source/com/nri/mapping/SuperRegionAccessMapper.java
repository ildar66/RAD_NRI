/*
 * Created on 19.09.2007
 *
 * Mapper ����� ������� �� ��������.
 */
package com.nri.mapping;

import java.util.ArrayList;
import java.util.Collection;

import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * Mapper ����� ������� �� ��������.
 */
public interface SuperRegionAccessMapper extends Mapper {
	public ArrayList findOperatorToSuperRegionList(Integer operatorKey, String orderBy) throws MappingException;
	public ArrayList findOperatorToSuperRegionAccessList(Integer operatorKey, String orderBy) throws MappingException;
	public void saveSuperRegionAccessForOperator(Integer operatorKey, Collection accessList) throws MappingException;
}
