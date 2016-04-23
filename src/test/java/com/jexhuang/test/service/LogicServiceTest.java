package com.jexhuang.test.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.jexhuang.model.bean.EmpDao;
import com.jexhuang.service.LogicService;

public class LogicServiceTest {

	@InjectMocks
	private LogicService logicService;
	@Mock
	private EmpDao empDao;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	/*
	 * if we don't call db to access data,
	 * we can use mockito to mock a fake dao
	 * so we can justing test program logic.
	 * 
	 * */
	@Test
	public void testGetEmpNo() {
		Mockito.when(empDao.findEmpNoFromDbByEmpId("jexhuang")).thenReturn("123");
		Assert.assertTrue(logicService.getEmpNo("jexhuang").equals("empNo:123"));
	}

}
