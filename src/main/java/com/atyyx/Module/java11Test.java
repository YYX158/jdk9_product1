package com.atyyx.Module;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 * Optional类的增强，新增isPresent()
 * @author yyx
 * @version 1.0
 * @date 2022/8/15 10:47
 */
public class java11Test {

    @Test
    public void test1()
    {
        // 创建一个空的Optional对象
        Optional<Object> op = Optional.empty();
        System.out.println(op);
        // 判断内部的value是否存在
        System.out.println(op.isPresent());
        // 判断内部的value是否为空
        System.out.println(op.isEmpty());

        op=Optional.of("abc");
        // orElseThrow():value非空，返回value；否则，则抛出异常NoSuchElementException
        Object obj = op.orElseThrow();
        System.out.println(obj);

        // or
        Optional<String> op1 = Optional.of("hello");
        // 接口中需要提供一个Supplier供应者
        Optional<Object> op2 = op.or(() -> op1);
        System.out.println(op2);
    }

    /**
     * java11的新特性三: 局部变量类型推荐的升级
     */
    @Test
    public void test2()
    {
        // 错误的形式，必须要有类型，可以加上var
        // Consumer<String> con1=(@Deprecated t)->System.out.println(t.toUpperCase());
        // 正确的形式

        Consumer<String> con2=(@Deprecated var t)-> System.out.println(t.toUpperCase());
    }

    /**
     * java11新特性四：HttpClient替换原有的HttpURLConnection
     */
    public void test3() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8080/test/")).build();
        HttpResponse.BodyHandler<String> responseBodyHanlder = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = client.send(request, responseBodyHanlder);
        String body = response.body();
        System.out.println(body);
    }

    /**
     * java11新特性五：
     */
    @Test
    public void test4() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8080/test/")).build();
        HttpResponse.BodyHandler<String> responseBodyHanlder = HttpResponse.BodyHandlers.ofString();
        CompletableFuture<HttpResponse<String>> sendAsync = client.sendAsync(request, responseBodyHanlder);
        sendAsync.thenApply(t->t.body()).thenAccept(System.out::println);
    }

    @Test
    public void test5()
    {
//        //据货币代码来获取货币单位
//        CurrencyUnit currencyUnit = Monetary.getCurrency("USD");
    }
}
