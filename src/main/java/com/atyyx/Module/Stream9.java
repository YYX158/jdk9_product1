package com.atyyx.Module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * jdk9 流的增强
 * @author yyx
 * @version 1.0
 * @data 2022/8/11 15:27
 */
public class Stream9 {
    // java9的新特性：Stream的API增强
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,3, 8, 7, 4, 3, 0, 8, 7, 4);
//        //takeWhile 跟Filter的区别在于 takeWhile是尽可能返回从开头开始多的元素，也就是说有元一不满足就停止
//        list.stream().takeWhile(x->x<6).forEach(System.out::println);
//        System.out.println("********************************************************************************************");
//        // dropWhile就是满足这个条件就跳过这个元素
//        // 就是找到第一个不满足这个条件的元素以后，后面的元素全部都要
//        list.stream().dropWhile(x->x<6).forEach(System.out::println);

        // jdk8中的Stream流中可以包含null，但是不能只有一个null
//        Stream<Integer> stream = Stream.of(1, 2, 3,null);
//        stream.forEach(System.out::println);
//        System.out.println("********************************************************************************************");
//        // 创建一个空的流  允许创建一个只有null的
//        Stream<Object> stream1 = Stream.ofNullable(null);
//        stream1.forEach(System.out::println);
//        System.out.println("********************************************************************************************");
//        Stream<Object> stream2 = Stream.of(null,null);
//        stream2.forEach(System.out::println);
//        System.out.println("********************************************************************************************");
//        // jdk中的操作
//        Stream.iterate(0,t->t+2).limit(20).forEach(System.out::println);
//        System.out.println("********************************************************************************************");
//        //jdk9中的重载iterate
//        Stream.iterate(0,x->x<100,x->x+1).forEach(System.out::println);
//        System.out.println("********************************************************************************************");
//        //java9中的新特性十一：Optional提供了新的stream()
//
//        List<String> list = new ArrayList<>();
//        list.add("Tom");
//        list.add("Jerry");
//        list.add("Tim");
//
//        Optional<List<String>> listOptional = Optional.ofNullable(list);
//        Stream<List<String>> listStream = listOptional.stream();
//        listStream.flatMap(x->x.stream()).forEach(System.out::println);

        // 实例一
        var list1 = List.of("java", "python", "c");
        List<String> copy1 = List.copyOf(list1);
        System.out.println(list1==copy1);  // true
        // 实例二
        ArrayList<String> list2 = new ArrayList<>();
        List<String> copy2 = List.copyOf(list2);
        System.out.println(list2 == copy2);  // false
        // 结论：
        // 如果原来的集合是一个只读的集合，那就copyOf就不需要在new一个只读的集合

    }
}
