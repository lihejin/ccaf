package com.ccaf.util;

import org.springframework.context.ApplicationContext;

/**
 * Created by steven on 2018/10/26.
 */

public class SpringContextUtils {

  public static ApplicationContext appCxt;

  public static void setApplicationContext(ApplicationContext applicationContext){

    appCxt=applicationContext;

  }

  public static <T> T getBean(Class clz)
  {
    return (T) appCxt.getBean(clz);
  }


}
