package com.drew.mkp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.drew.mkp.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Liang
 * @Date 2020/2/23 16:29
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
