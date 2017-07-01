/*
 * Created on 17.07.2007
 *
 * Mapper Должность.
 */
package com.nri.mapping;

import java.util.ArrayList;

import com.nri.domain.Worker;
import com.nri.exception.MappingException;

/**
 * @author IShaffigulin
 *
 * Mapper Должность.
 */
public interface WorkerMapper extends Mapper {
	public Worker findById(Integer id) throws MappingException;
	public ArrayList findWorkers(Worker query, String orderBy) throws MappingException;
	public ArrayList findWorkers(String name, Worker query, String orderBy) throws MappingException;
}
