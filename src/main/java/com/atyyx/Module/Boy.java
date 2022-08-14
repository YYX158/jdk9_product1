package com.atyyx.Module;

/**
 * 实现Person接口
 * 在此实现类中必须重写接口的抽象方法，
 * 实现类可以实现接口中的默认方法。
 * @author yyx
 * @version 1.0
 * @date 2022/8/11 11:56
 */
public class Boy implements Person{
    Boy(){}
    @Override
    public void fun() {
        System.out.println("子类重写接口中的抽象方法");
    }

    @Override
    public void fun1() {
        System.out.println("子类中重写接口中的默认方法");
    }
}
