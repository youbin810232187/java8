package com.learn.lambda;


import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Detail1_1Impl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LearnLambdaTest{

    private List<Student> lists = Arrays.asList(new Student(1,"AA",13),
            new Student(1,"BB",12),
            new Student(2,"EE",9),
            new Student(3,"CC",14),
            new Student(4,"DD",13));


    @org.junit.Test
    public void test5(){
        lists.sort((e1,e2)->{
            if (e1.getAge() == e2.getAge()){
                return e1.getId()-e2.getId();
            }
            else {
                return e1.getAge() - e2.getAge();
            }
        });
        for (Student student :lists){
            System.out.println(student);
        }
    }

    @org.junit.Test
    public void test4(){

        lists.sort((e1,e2)->{return e1.getAge() - e2.getAge();});
        for(Student student:lists){
            System.out.println(student);
        }

    }

    @org.junit.Test
    public void test3(){
        Caculate<Integer> caculate = (num1,num2)-> num1+num2;
       Integer result =  method(new Integer(100),new Integer(999),caculate);
        System.out.println(result);
    }

    public Integer method(Integer num1, Integer num2, Caculate<Integer> caculate){
        return caculate.add(num1,num2);
    }

    @Test
    public void test2(){
        MyIntface2<String> myIntface2 = (s)-> System.out.println(s);
        print("bbb",myIntface2);
        myIntface2.method("aaa");
    }

    public void print(String s, MyIntface2<String> myIntface2){
        myIntface2.method(s);
    }

    @Test
    public void test1(){
        System.out.println("...............");
        MyInterface mi = ()->{
            System.out.println("测试Lambda表达式");
        };
        mi.print();
    }

}
