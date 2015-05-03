package com.ccms.service;


import com.ccms.persistence.dto.Pager;
import com.ccms.persistence.pojo.Activity;
import com.ccms.persistence.pojo.College;

public interface ActivityService {
	
	/**
	 * 分页查询所有通过审核的Activity
	 * @param pageOffset
	 * @param pageSize
	 * @return
	 */
	public Pager<Activity> findAllStatusByPage(Pager<Activity> pager);
	
	/**
	 * 查询所有的活动列表
	 * @param pager
	 * @return
	 */
	public Pager<Activity> findAllByPage(Pager<Activity> pager);
	
	/**
	 * 根据id查看Activity
	 * @param id
	 * @return
	 */
	public Activity detail(Integer id);
	
	/**
	 * 添加活动
	 * @param activity
	 * @return
	 */
	public int add(Activity activity);
	
	/**
	 * 判断活动报名是否截止
	 * @param actId
	 * @return "isPastDue" 过期了, "notPastDue" 未过期
	 */
	public String isPastDut(Integer actId);
	
	/**
	 * 管理员审核活动
	 * @param actId
	 * @return
	 */
	public String aduitActivity(Integer actId, Integer status);

	/**
	 * 用工单位查询所有的活动
	 * @param pager
	 * @param college
	 * @return
	 */
	public Pager<Activity> findAllByPage(Pager<Activity> pager, College college);
	
	/**
	 * 更新活动
	 * @param activity
	 * @return
	 */
	public String updateActivity(Activity activity);
}
