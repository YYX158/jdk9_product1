package com.atyyx.Module;

import org.junit.Test;

import java.util.*;

/**
 * 测试treeMap，因为会排序，所以需要比较大小
 * 如果是java.lang.*中定义的包的基本数据类型，或者是包装类，那么就可以不需要书写比较方法
 * 否则
 *     ①需要在类中去继承比较类Comparator接口
 *     ②写一个Comparator的匿名类，将匿名类对应的实体类对象放到treemap的构造函数当中
 *
 * @author yyx
 * @version 1.0
 * @date 2022/8/15 10:52
 */
public class CollectionNew {
    @Test
    public void test1() {
        Collection coll = new ArrayList<>();
        coll.add(123);
        coll.add(456);
        coll.add(13);
        coll.add(45);
        coll.add("张三");
        coll.add("王赛");
        coll.add(new User("Tom", 18));
        // contains调用的是equals方法，而在String中已经重写了equals方法
        boolean b1 = coll.contains(new String("张三"));
        System.out.println(b1);  // true
        //Collection中去调用contains方法，contains去调用equals方法，但是Person中没有重写equals方法，
        //相当于就是去调用了==
        //== 比较的是对象是否指向同一块相同的内存区域，只是两个都是new的，指向的是堆空间中的两个不同的地址区域，故而返回false
        boolean b2 = coll.contains(new User("Tom", 18)); // false
        System.out.println(b2);
        System.out.println(coll);

        Collection coll1 = Arrays.asList(123, 456);
        boolean b3 = coll.containsAll(coll1);
        System.out.println(b3);

        Collection coll2 = Arrays.asList(123, 456, 9, 8, 73);
        // 取一下交集
        coll.retainAll(coll2);
        System.out.println(coll);
        System.out.println(coll.hashCode());
    }

    /**
     * TreeSet  可以进行排序、保存不可以重复的元素
     */
    @Test
    public void test2() {
        // 创建一个比较器对象
        Comparator<User> com = (u, v) -> Integer.compare(u.getAge(), v.getAge());
        Comparator<User> com2 = (u, v) -> {
            return Integer.compare(u.getAge(), v.getAge()) != 0 ? Integer.compare(u.getAge(), v.getAge()) : u.getName().compareTo(v.getName());
        };

        TreeSet treeSet = new TreeSet(com2);

        treeSet.add(new User("Tom", 19));
        treeSet.add(new User("Jack", 22));
        treeSet.add(new User("lyq", 20));
        treeSet.add(new User("yyx", 22));
        //treeSet.add(8);

        System.out.println(treeSet);

        for (Object t : treeSet) {
            User user = (User) t;
            System.out.println(user);
        }

    }

    @Test
    public void test3()
    {
        Map map=new HashMap();
        map.put("张三",18);
        map.put("李四",21);
        map.put("王五",20);
        map.put("赵柳",17);

        System.out.println(map);

        Set set = map.keySet();
        System.out.println(set);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        Collection values = map.values();
        System.out.println(values);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+"------------>"+entry.getValue());
        }
    }
}
