package com.example.logbackExt.utils;

/**
 * 实现日志追踪上下文
 * Created by zd.yao on 2020/6/16.
 */
public class LogTraceContext {

    /**
     * 初始化
     */
    public static void init(){
        ThreadUUIDContext.remove();
        IncrementIdContext.remove();
    }
}
