package com.mybatis.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSourceExample {
    public static void main(String[] args) throws IOException {

        //系统文件路径
        String filePath = "D:\\temp\\Projects\\masterSpring-Ch4\\src\\main\\resources\\conf\\file1.txt";

        //使用系统文件路径方式加载文件
        PathResource filePathResource = new PathResource(filePath);

        //以类路径的方式加载文件
        ClassPathResource classPathResource = new ClassPathResource("conf/file1.txt");

        //写入资源文件
        OutputStream outputStream = filePathResource.getOutputStream();
        outputStream.write("欢迎光临\n小春论坛".getBytes());
        outputStream.close();

        //以filePathResource为例读取文件
        InputStream filePathResourceInputStream = filePathResource.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i;
        while((i=filePathResourceInputStream.read())!=-1){
            byteArrayOutputStream.write(i);
        }
        System.out.println("以filePathResource为例读取文件:" + filePathResource.getFilename());
        System.out.println(byteArrayOutputStream.toString());


        //以classPathResource为例读取文件
        InputStream classPathResourceInputStream = classPathResource.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
        i = 0;
        while((i=classPathResourceInputStream.read())!=-1){
            byteArrayOutputStream1.write(i);
        }
        System.out.println("以classPathResource为例读取文件:" + classPathResource.getFilename());
        System.out.println(byteArrayOutputStream.toString());

    }
}
