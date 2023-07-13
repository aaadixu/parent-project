package com.atguigu.design.structure.flyweight;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 19:42
 */
public class LibraryImpl extends Library{
    private String bookName;

    public LibraryImpl(String bookName){
        this.bookName = bookName;
    }

    @Override
    public void borrow(User user) {
        System.out.println("图书馆的书《" + this.bookName + "》已被[" + user.getName() + "]借出");
    }
}
