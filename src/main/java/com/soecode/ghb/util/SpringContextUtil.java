package com.soecode.ghb.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;  
/**
 * 获取spring上下文ApplicationContext的工具类
 * @author 甘海彬
 *
 */
public class SpringContextUtil implements ApplicationContextAware {  
    private static ApplicationContext context = null;  
   
    public void setApplicationContext(ApplicationContext applicationContext)  
            throws BeansException {  
        SpringContextUtil.context = applicationContext;  
    }  
      
    public static Object getBean(String name){  
        return context.getBean(name);  
    }  
    
    public static boolean containsBean(String name) {
        return context.containsBean(name);
    }
 
    public static boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
        return context.isSingleton(name);
    }
 
    public static Class getType(String name)    throws NoSuchBeanDefinitionException {
        return context.getType(name);
    }
 
    public static String[] getAliases(String name) throws NoSuchBeanDefinitionException {
        return context.getAliases(name);
    }
      
}  