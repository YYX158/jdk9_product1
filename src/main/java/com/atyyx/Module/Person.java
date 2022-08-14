package com.atyyx.Module;

/**
 * jdk8以后，接口中可以存在私有方法，但是私有接口中的私有方法只能内中自己可以调用
 * 接口中的默认方法可以进行调用，接口中的默认方法可以被实现类重写
 * 接口中的抽象方法可以被实现类所重写（而且是一定要重写的）
 * 接口中的静态方法只有接口自己可以调用
 * 接口中只能定义静态变量
 *
 * @author yyx
 * @version 1.0
 * @date 2022/8/11 11:56
 */
public interface Person {
    public static String gender = "张三";

    public void fun();

    default void fun1()
    {
        System.out.println("这是一个测试方法");

        test3();

    }

    public static void  fun2()
    {
        System.out.println("接口中定义的静态方法");
        System.out.println("接口中定义的静态方法去调用接口中的私有方法");

    }

    private void test3()
    {
        System.out.println("接口中的私有方法");
    }
}
