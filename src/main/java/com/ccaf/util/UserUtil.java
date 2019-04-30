package com.ccaf.util;

/**
 * Created by steven on 2018/10/26.
 */
public class UserUtil {

  public static ThreadLocal<String> mapThreadLocal = new ThreadLocal<>();

  public static ThreadLocal<String> loginRoleThreadLocal = new ThreadLocal<>();

  public static ThreadLocal<String> roleThreadLocal = new ThreadLocal<>();

  public static ThreadLocal<String> auditStateThreadLocal = new ThreadLocal<>();

  public static void setMapThreadLocal(String userId){
    mapThreadLocal.set(userId);
  }

  public static void setRoleThreadLocal(String role){
    roleThreadLocal.set(role);
  }

  public static void setLoginRoleThreadLocal(String role){
    loginRoleThreadLocal.set(role);
  }

  public static void setAuditStateThreadLocal(String auditstate){
    auditStateThreadLocal.set(auditstate);
  }

  public static String getLoginRole(){
    return loginRoleThreadLocal.get();
  }

  public static String getAuditState(){
    return auditStateThreadLocal.get();
  }

  public static String getUserName(){ return mapThreadLocal.get(); }

  public static boolean isDesigner(){
    return "1".equals(roleThreadLocal.get());
  }



}
