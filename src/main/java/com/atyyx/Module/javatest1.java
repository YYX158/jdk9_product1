package com.atyyx.Module;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * java9 特性六： try操作的升级————声明资源，让jvm自动关闭资源。
 * @author yyx
 * @version 1.0
 * @data 2022/8/11 13:56
 */
public class javatest1 {
    public static void main(String[] args)
    {
        //jdk8之前资源的关闭操作
//        InputStreamReader isr= null;
//        try {
//            // 定义一个转换流
//            isr = new InputStreamReader(System.in);
//
//            char[] ch=new char[1024];
//            int len=0;
//            while((len=isr.read(ch))!=-1)
//            {
//                String str=new String(ch,0,len);
//                System.out.println(str);
//            }
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        } finally {
//            try {
//                isr.close();
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//        }


        //jdk8关闭资源的新特性
        // 在小括号里面中声明资源，而且赋值也必须在小括号中，不然就不会自动关闭
//        try(InputStreamReader isr=new InputStreamReader(System.in))
//        {
//            char[] ch=new char[1024];
//            int len=0;
//            if((len=isr.read(ch))!=-1)
//            {
//                String str=new String(ch,0,len);
//                System.out.println(str);
//            }
//        }
//        catch (IOException ioException)
//        {
//            ioException.printStackTrace();
//        }


        //jdk9关闭资源的新特性,可以在外面声明资源对象，但是放在try的小括号中只能是常量，放进去以后就不能再改变这个变量的值了。
        InputStreamReader isr=new InputStreamReader(System.in);
        try(isr)// final
        {
            char[] ch=new char[1024];
            int len=0;
            if((len=isr.read(ch))!=-1)
            {
                String str=new String(ch,0,len);
                System.out.println(str);
            }
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
    }
}
