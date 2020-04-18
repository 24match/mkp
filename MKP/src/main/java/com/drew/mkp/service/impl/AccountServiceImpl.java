package com.drew.mkp.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.drew.mkp.mapper.AccountMapper;
import com.drew.mkp.model.Account;
import com.drew.mkp.service.AccountService;
import com.drew.mkp.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author Liang
 * @Date 2020/2/23 16:31
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Result selectAccout() {
        JSONObject jsonObject = new JSONObject();

        List list = accountMapper.selectList(null);
        jsonObject.put("account", list);

        return Result.success(jsonObject);
    }

    @Override
    public int addAccount(Account account) {
        return accountMapper.insert(Account.builder()
                .username(account.getUsername())
                .password(account.getPassword())
                .isadmin(account.getIsadmin())
                .createDate(new Date())
                .build());
    }

    @Override
    public int updateAccount(Account account) {
        return accountMapper.updateById(Account.builder()
                .username(account.getUsername())
                .password(account.getPassword())
                .isadmin(account.getIsadmin())
                .updateDate(account.getUpdateDate())
                .build());
    }

    @Override
    public int removeAccount(Integer id) {
        return accountMapper.deleteById(id);
    }

    @Override
    public Integer removeAccount(List idList) {
        return accountMapper.deleteBatchIds(idList);
    }

}
