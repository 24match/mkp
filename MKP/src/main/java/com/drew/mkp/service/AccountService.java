package com.drew.mkp.service;

import com.drew.mkp.model.Account;
import com.drew.mkp.utils.Result;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author Liang
 * @Date 2020/2/23 16:31
 */
public interface AccountService {

    /**
     * 查询所有用户
     * @return
     */
    Result selectAccout();

    /**
     * 新增用户
     * @param account
     * @return
     */
    int addAccount(Account account);

    /**
     * 修改用户
     * @param account
     * @return
     */
    int updateAccount(Account account);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int removeAccount(Integer id);

    /**
     * 批量删除用户
     * @param idList
     * @return
     */
    Integer removeAccount(List idList);

}
