package com.ccms.service;

import java.util.List;

import com.ccms.pojo.ActItem;
import com.ccms.pojo.Activity;
import com.ccms.pojo.Student;

public interface ActItemService {
	
	/**
	 * 判断学生是否已经报名了该活动
	 * @param activity
	 * @param student
	 * @return
	 */
	public boolean isApplyed(Activity activity, Student student);
	
	/**
	 * 学生报名活动
	 * @param activityId
	 * @param studentId
	 * @return
	 */
	public boolean apply(Activity activity, Student student);
	
	
	/**
	 * 根据学生id查询学生报名的活动
	 * @param studentId
	 * @return
	 */
	public List<ActItem> queryAllActivityItem(Integer studentId);

}