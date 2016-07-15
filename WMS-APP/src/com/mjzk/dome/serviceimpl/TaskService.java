/**
 * 
 */
package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.Task;
import com.mjzk.dome.daoimpl.TaskDao;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Service
public class TaskService {

	@Resource
	TaskDao taskDao;
	
	@Transactional
	public void saveTask(Task task){
		taskDao.save(task);
	}
	
	@Transactional
	public void updateTask(Task task){
		taskDao.update(task);
	}
	
	@Transactional
	public Task findTask(String taskid){
		return taskDao.findById(taskid);
	}
	
	@Transactional
	public List<Task> findAllTask(){
		return taskDao.findAll();
	}
}
