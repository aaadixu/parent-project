package com.atguigu.design.creation.prototype;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 21:30
 */
public class CopyDemo {
    public static void main(String[] args) {
        // 基本类型浅拷贝：
        int a = 100;
        int b = a;
        System.out.println(a); // 100
        System.out.println(b); // 100
        System.out.println(a==b); // true


        //测试
//        // 引用类型浅拷贝：
//        Student student1 = new Student("stu",18);
//        System.out.println(student1); // JavaPackage_1.Student@68b0af6
//
//        Student student2 = student1;
//        System.out.println(student2); // JavaPackage_1.Student@68b0af6
//        System.out.println(student1==student2); // true，student1和student2指向的是同一地址
//
//        student1.setName("newstu");
//        System.out.println(student2.getName()); // newstu，通过修改student1可以修改student2

    }
}


// 定义学生类
//class Student{
//    private String name;
//    int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}

