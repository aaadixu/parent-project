package com.atguigu.design.structure.flyweight;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 19:43
 */
public class LibraryFactory {
    // 用集合来充当缓存池，暂存书籍
    private HashMap<String, LibraryImpl> pool = new HashMap<String, LibraryImpl>();
    // 如果有书籍就放入缓存
    public Library getLibraryImpl(String name) {
        if (!pool.containsKey(name)) {
            // 创建一个放入
            pool.put(name, new LibraryImpl(name));
        }
        return pool.get(name);
    }
    // 获取书籍个数
    public int bookCount() {
        return pool.size();
    }
}
