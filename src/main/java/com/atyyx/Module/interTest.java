package com.atyyx.Module;

/**
 * 接口的测试
 *
 * @author yyx
 * @version 1.0
 * @date 2022/8/11 11:49
 */
public class interTest {
    public static void main(String[] args) {
        Person boy = new Boy();
        // 调用接口中定义的抽象方法
        boy.fun();
        boy.fun1();
        System.out.println(boy.gender);
        Person.fun2();// 接口中的静态方法只能这么调用

    }
}
