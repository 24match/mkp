package com.drew.mkp.controller;

import com.drew.mkp.model.Account;
import com.drew.mkp.model.Task;
import com.drew.mkp.service.AccountService;
import com.drew.mkp.service.TaskService;
import com.drew.mkp.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    private TaskService taskService;

    /**
     * 查询所有任务
     *
     * @return
     */
    @GetMapping("/selectTask")
    @CrossOrigin
    @ResponseBody
    public Result selectTask() {
        return taskService.queryTask();
    }

    /**
     * 新增任务
     *
     * @param account
     * @return
     */
    @PostMapping("/addTask")
    @Transactional
    public Result<Integer> addTask(Task task) {
        return Result.success(taskService.addTask(task));
    }

    /**
     * 修改任务信息
     *
     * @return
     */
    @PostMapping("/updateTask")
    @Transactional
    public Result updateTask(Task task) {
        return Result.success(taskService.updateTask(task));
    }

    /**
     * 删除任务信息
     *
     * @param id
     * @return
     */
    @PostMapping("/removeTask")
    @Transactional
    public Result removeTask(Integer id) {
        return Result.success(taskService.removeTask(id));
    }
}
