package com.atyyx.Module;

/**
 * @author yyx
 * @version 1.0
 * @date 2022/8/15 10:43
 */
public class NewString {

    /**
     * java11中的新特性一： String中的新增方法
     * @param args
     */
    public static void main(String[] args) {
        //isBlank();   用来判断字符串是否为空白串
        System.out.println("  \t  ".isBlank());
        // strip()    取除收尾的空格
        System.out.println("----------"+"  \t   \t   abc \n".strip()+"---------------");
        // stripTrailing()  从后往前取除空白
        System.out.println("----------"+"  \t   \t   abc \n".stripTrailing()+"---------------");
        // stripLeading()
        System.out.println("----------"+"  \t   \t  abc  \n".stripLeading()+"---------------");
        //repeat()   用来重复连接字符串
        String str1="abc";
        String str2=str1.repeat(5);
        System.out.println(str2);
        // 行数的统计
        String str3="abcd\nefg";
        System.out.println(str3.lines().count());

    }
}
