package com.atyyx.Module;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * jdk9中提出来的try-catch-finally新的写法，可以在try后面的小括号中声明资源变量，
 * 资源变量本来需要在finally中进行关闭的，而且在finally中又需要套try-catch进行捕获异常。
 * 写在try中的小括号，就可以自动关闭，只需要进行声明资源即可。
 * 但是写在小括号中的资源，就不能在进行修改了，否则会抛出异常。
 *
 * @author yyx
 * @version 1.0
 * @date 2022/8/11 15:11
 */
public class IO {
    public static void main(String[] args) {
        ClassLoader c1 = IO.class.getClassLoader();
        InputStream is = c1.getResourceAsStream("hello.txt");
        try (is; FileOutputStream fos = new FileOutputStream("hello1.txt");)
        {
            is.transferTo(fos);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
