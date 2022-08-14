package com.atyyx.Module;

import java.util.*;

/**
 * jdk9中的集合新特性，快速创建只读集合
 *
 * @author yyx
 * @version 1.0
 * @date 2022/8/11 14:35
 */
public class Java9Test2 {
    // java9新特性八： 集合工厂方法，创建只读集合
    public static void main(String[] args) {
        //java8中的写法
//        List<String> nameList=new ArrayList<>();
//        nameList.add("Joe");
//        nameList.add("Bob");
//        nameList.add("Bill");
//        nameList= Collections.unmodifiableList(nameList);
//        System.out.println(nameList);

        // jdk9中的写法
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list);

        Set<Integer> set = Set.of(1,  4,  2, 3, 5);
        System.out.println(set);

        Map<String, Integer> map = Map.ofEntries(Map.entry("张三", 18), Map.entry("李雅琪", 20));
        System.out.println(map);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);

    }

}
