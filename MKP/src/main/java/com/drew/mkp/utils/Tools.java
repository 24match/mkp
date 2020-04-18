package com.drew.mkp.utils;

import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Liang
 * @Date 2020/2/25 14:54
 */
public class Tools {

    /**
     * 日期转成字符串,获取 指定格式 格式的日期
     * @param format eg:'yyyy-mm-dd','yyyy-mm-dd HH:mm:ss'
     * @return
     */
    public static String getDateTime(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        String dateString = now.format(formatter);
        return dateString;
    }
}
