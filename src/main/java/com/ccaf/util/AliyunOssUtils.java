package com.ccaf.util;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.UUID;

public class AliyunOssUtils {

  private static Logger logger= LoggerFactory.getLogger(AliyunOssUtils.class);

  static String accessKeyId = "LTAIn4pYVN2KwX64";
  static String accessKeySecret = "sTjL6la7elC5oJenAV0pdbqhzG2e7e";
  static String bucketName = "mingzhu-test";
  public static String uploadFile(File file){
    String endpoint = "http://oss-cn-beijing.aliyuncs.com";
// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
    String fileName=UUID.randomUUID().toString().replaceAll("-","")+"_"+file.getName();
// 创建OSSClient实例。
    OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

// 上传文件流。
    try(InputStream inputStream = new FileInputStream(file)){
      PutObjectResult putObjectResult=ossClient.putObject(bucketName,fileName , inputStream);
      putObjectResult.getResponse();
      //System.out.println(object.getStatusCode()+":"+EntityUtils.toString(object.getHttpResponse().getEntity()));
    }catch (Exception e){
      logger.error("oss error",e);
      return null;
    }finally{
      // 关闭OSSClient。
      ossClient.shutdown();

    }
    if(file.exists()){
      file.delete();
    }
    return fileName;
  }

  public static String getUrl(String objectName){
    String endpoint = "http://oss-cn-beijing.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。



// 创建OSSClient实例。
    OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
    try {
// 设置URL过期时间为1小时。
      Date expiration = new Date(new Date().getTime() + 3600 * 1000);
// 生成以GET方法访问的签名URL，访客可以直接通过浏览器访问相关内容。
      URL url = ossClient.generatePresignedUrl(bucketName, objectName, expiration);
      return url.toString();
    }finally{
// 关闭OSSClient。
      ossClient.shutdown();
    }
  }




}
