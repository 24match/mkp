package com.drew.mkp.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Liang
 * @Date 2020/2/25 11:40
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ResultCode {
    SUCCESS(20000, "SUCCESS"),
    FAILED(50000, "FAIL");

    private long code;
    private String message;
}
