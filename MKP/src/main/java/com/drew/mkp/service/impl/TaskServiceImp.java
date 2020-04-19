package com.drew.mkp.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.drew.mkp.mapper.TaskMapper;
import com.drew.mkp.model.Task;
import com.drew.mkp.service.TaskService;
import com.drew.mkp.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 任务 实现类
 */
@Service
public class TaskServiceImp implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public Result queryTask() {
        JSONObject jsonObject = new JSONObject();
        List list = taskMapper.selectList(null);
        jsonObject.put("taskData", list);

        return Result.success(jsonObject);
    }

    @Override
    public int addTask(Task task) {
        return taskMapper.insert(Task.builder()
                .accountId(task.getAccountId())
                .taskName(task.getTaskName())
                .taskRemarks(task.getTaskRemarks())
                .createDate(new Date())
                .build());
    }

    @Override
    public int updateTask(Task task) {
        return taskMapper.updateById(Task.builder()
                .taskId(task.getTaskId())
                .accountId(task.getAccountId())
                .taskName(task.getTaskName())
                .taskRemarks(task.getTaskRemarks())
                .updateDate(task.getUpdateDate())
                .build());
    }

    @Override
    public int removeTask(Integer id) {
        return taskMapper.deleteById(id);
    }
}
