package com.jexhuang.service;

import com.jexhuang.model.bean.EmpDao;

public class LogicService {

	private EmpDao empDao;

	public Object getEmpNo(String empId) {
		String empNo = empDao.findEmpNoFromDbByEmpId(empId);
		return "empNo:"+empNo;
	}

}
