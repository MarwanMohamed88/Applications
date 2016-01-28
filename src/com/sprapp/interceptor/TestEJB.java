package com.sprapp.interceptor;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.persistence.EntityManager;

import com.sprapp.entity.TempTableEB;

@Remote
@Local
public interface TestEJB {
	List<TempTableEB> getName(String name, EntityManager em) throws InterruptedException;

	void consumeJMS(String message);
}
