package com.ccms.service;

import java.util.List;

import com.ccms.persistence.dto.Pager;
import com.ccms.persistence.dto.StudentDto;
import com.ccms.persistence.dto.StudentQueryDto;
import com.ccms.persistence.pojo.Student;

public interface StudentService {

	/**
	 * 学生注册
	 * @param student
	 * @return
	 */
	public String register(Student student);
	
	/**
	 * 学生登录
	 * @param num
	 * @param pwd
	 * @return
	 */
	public Student login(String num, String pwd);
	
	/**
	 * 根据学生学号获得学生个人信息
	 * @param num
	 * @param year 年份
	 * @return
	 */
	public Student getInfo(String num, String year);
	
	/**
	 * 更新学生信息
	 * @param student
	 * @return
	 */
	public boolean updateInfo(Student student);
	
	/**
	 * 更新部分信息
	 * @param student
	 * @return
	 */
	public String updatePartInfo(Student student);
	
	/**
	 * 根据活动id查看报名学生
	 * @param actId
	 * @return
	 */
	public Pager<StudentDto> findStudentByActivityId(Pager<StudentDto> pager, Integer actId);
	
	/**
	 * 根据学院id查看学生
	 * @param pager
	 * @param colId
	 * @return
	 */
	public Pager<Student> findStudents(Pager<Student> pager, StudentQueryDto dto);

	/**
	 * 根据学号和学年判断学生是否已存在
	 * @param num
	 * @param year
	 * @return
	 */
	public String isExist(String num, String year);

	/**
	 * 根据学生id获取报名列表
	 * @param actId
	 * @return
	 */
	public List<StudentDto> getAllStudentByActivityId(Integer actId);

	/**
	 * 下载学生名单
	 * @param year
	 */
	public List<Student> downloadStudents(StudentQueryDto dto);
	
}





















