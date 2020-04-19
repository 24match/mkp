package com.drew.mkp.controller;

import com.drew.mkp.model.Account;
import com.drew.mkp.service.AccountService;
import com.drew.mkp.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理
 *
 * @author Liang
 * @Date 2020/2/23 19:09
 */
@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping("/selectAccount")
    @CrossOrigin
    @ResponseBody
    public Result selectAccount() {
        return accountService.selectAccout();
    }

    /**
     * 新增用户
     *
     * @param account
     * @return
     */
    @PostMapping("/addAccount")
    @Transactional
    public Result<Integer> addAccount(Account account) {
        return Result.success(accountService.addAccount(account));
    }

    /**
     * 修改用户信息
     *
     * @return
     */
    @PostMapping("/updateAccount")
    @Transactional
    public Result updateAccount(Account account) {
        return Result.success(accountService.updateAccount(account));
    }

    /**
     * 删除用户信息
     *
     * @param id
     * @return
     */
    @PostMapping("/removeAccount")
    @Transactional
    public Result removeAccount(Integer id) {
        return Result.success(accountService.removeAccount(id));
    }
}
