package com.atguigu.maven;

import org.junit.Test;

/**
 * @author Tbresdow
 * @create 2022-05-23-15:43
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println("maven = " + maven);

    }
}
