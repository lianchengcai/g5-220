package cn.edu.fjnu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.fjnu.dao.ITableStudentDao;
import cn.edu.fjnu.entity.TableStudent;

@Service
public class TableStudentService {
	@Resource
	ITableStudentDao dao;
	public List<TableStudent> getAll() {
		return dao.getAll();
	}
}
