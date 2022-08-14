package com.atyyx.Module;

import java.util.Comparator;

/**
 * java9中的特性升级：匿名类与钻石操作符<>
 *
 * @author yyx
 * @version 1.0
 * @date 2022/8/11 13:51
 */
public class JAVATest {
    // 钻石操作符与匿名类在java8中是不能共存的，但是在java9中是可以的
    Comparator<Object> com=new Comparator<>() {
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };
}
