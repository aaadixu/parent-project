package com.atguigu.design.structure.flyweight;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 19:44
 */
public class MainTest {
    public static void main(String[] args) {
        // 创建工厂
        LibraryFactory libraryFactory = new LibraryFactory();
        Library book = libraryFactory.getLibraryImpl("Java设计模式");
        book.borrow(new User("怒放吧德德"));

        // 假设书已经归还

        Library book2 = libraryFactory.getLibraryImpl("Java设计模式");
        book2.borrow(new User("愤怒吧德德"));

        Library book3 = libraryFactory.getLibraryImpl("Go语言编程");
        book3.borrow(new User("怒放吧德德"));

        System.out.println("现在有书：" + libraryFactory.bookCount() + " 本");
    }
}
