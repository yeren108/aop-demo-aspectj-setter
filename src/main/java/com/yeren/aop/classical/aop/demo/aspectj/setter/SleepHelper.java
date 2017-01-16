package com.yeren.aop.classical.aop.demo.aspectj.setter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class SleepHelper{  
	
	//在调用方法之前执行 执行拦截包com.spring.aop.*下所有的方法
    public void doBefore(JoinPoint point) throws Throwable{
    	System.out.println("起床后要穿衣服！"); 
    }
    
    //在调用方法前后执行
    public Object doAround(ProceedingJoinPoint point) throws Throwable{
        if(point.getArgs().length>0){
            return point.proceed(point.getArgs());
        }else{
            return point.proceed();
        }
    }
    
    //在调用方法之后执行
    public void doAfter(JoinPoint point) throws Throwable{
    	System.out.println("睡觉前要脱衣服！"); 
    }
    
    //当抛出异常时被调用
    public void doThrowing(JoinPoint point, Throwable ex){
        System.out.println("doThrowing::method "+ point.getTarget().getClass().getName() + "."+ point.getSignature().getName() + " throw exception");
        System.out.println(ex.getMessage());
    }
	
    
}  