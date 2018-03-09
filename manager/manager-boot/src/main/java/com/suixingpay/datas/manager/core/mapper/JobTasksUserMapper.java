package com.suixingpay.datas.manager.core.mapper;

import com.suixingpay.datas.manager.core.entity.JobTasksUser;
import com.suixingpay.datas.manager.web.page.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * job_tasks_user Mapper接口
 * 
 * @author: FairyHood
 * @date: 2018-03-07 13:40:30
 * @version: V1.0-auto
 * @review: FairyHood/2018-03-07 13:40:30
 */
public interface JobTasksUserMapper {

    /**
     * 新增
     * @param jobTasksUser
     */
    Integer insert(JobTasksUser jobTasksUser);

    /**
     * 修改
     * @param jobTasksUser
     */
    Integer update(@Param("id") Long id, @Param("jobTasksUser") JobTasksUser jobTasksUser);

    /**
     * 刪除
     * @param id
     * @return
     */
    Integer delete(Long id);

    /**
     * 根據主鍵id查找數據
     * @param id
     * @return
     */
    JobTasksUser selectById(Long id);

    /**
     * 分頁
     * @return
     */
    List<JobTasksUser> page(@Param("page") Page<JobTasksUser> page, @Param("state") Integer state);

    /**
     * 分頁All
     * @return
     */
    Integer pageAll(@Param("state") Integer state);

}