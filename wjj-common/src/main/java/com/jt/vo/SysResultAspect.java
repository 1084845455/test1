package com.jt.vo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice//只对controller层生效
public class SysResultAspect {
     @ExceptionHandler(RuntimeException.class)//遇到这种异常调用下面方法
	 public  SysResult sysResultFail(Exception e) {
    	 e.printStackTrace();
    	 log.error("异常信息:"+e.getMessage());
    	 return SysResult.fail();
     }
}
