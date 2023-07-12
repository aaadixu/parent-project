package com.atguigu.design.creation.prototype;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 21:34
 */
public class ProtoTypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        //测试
        Food food = new Food("Apple");
        Student student1 = new Student("stu", 29,food);
        Student student2 = (Student) student1.clone(); // 通过student1克隆student2，不通过new对象的形式创建

        System.out.println(student1); // Student@1b6d3586
        System.out.println(student2); // Student@4554617c
        System.out.println(student1==student2); // false，student1和student2指向的是不同地址

        System.out.println(student1.getFood()); // Food@74a14482
        System.out.println(student2.getFood()); // Food@74a14482
        System.out.println(student1.getFood()==student2.getFood()); // true，student1.food和student2.food指向同一地址

        food.setFood("orange");
        System.out.println(student1.getFood().getFood()); // orange
        System.out.println(student2.getFood().getFood()); // orange

    }
}


// 定义Food类
class Food{

    String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Food(String food) {
        this.food = food;
    }
}

// 定义Student类
class Student implements Cloneable{ // Cloneable接口

    @Override //重写clone()方法
    // 提升访问权限为public
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private Food food;
    private String name;
    int age;

    public Student() {
    }

    public Student(String name, int age, Food food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFood(Food food){
        this.food = food;
    }

    public Food getFood(){
        return food;
    }

}
