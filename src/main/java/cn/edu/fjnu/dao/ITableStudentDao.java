package cn.edu.fjnu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.edu.fjnu.entity.TableStudent;
@Repository
public interface ITableStudentDao {
	List<TableStudent> getAll();
}
