package com.drew.mkp.service;

import com.drew.mkp.mapper.TaskMapper;
import com.drew.mkp.model.Task;
import com.drew.mkp.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 任务service
 */
public interface TaskService {

    /**
     * 获取任务列表
     *
     * @return
     */
    Result queryTask();

    /**
     * 新增任务列表
     *
     * @param task
     * @return
     */
    int addTask(Task task);

    /**
     * 修改任务列表
     *
     * @param task
     * @return
     */
    int updateTask(Task task);

    /**
     * 删除任务列表
     *
     * @param id
     * @return
     */
    int removeTask(Integer id);


}
