package com.esprit.Dependency.tpDependencyInjection.services;

import java.util.List;

import com.esprit.Dependency.tpDependencyInjection.dao.IToDoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class ToDoService {

	@Qualifier("ToDoDao")
	@Autowired
	private IToDoDao toDoDao;

	public List<String> getCoursesList() {
		return toDoDao.getCoursesList();
	}
}
