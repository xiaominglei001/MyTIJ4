package aamytest.staticinitialization;

class Parent {
    static {
        System.out.println("=============Parent================");
    }
}

class Bowl extends Parent {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    static {
        System.out.println("=============Bowl================");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }


    static Table table = new Table();

    static {
        System.out.println("=============我是分割线1================");
    }

    static Cupboard cupboard = new Cupboard();

    static {
        System.out.println("=============我是分割线2================");
    }
}

/*
有助于理解静态为甚这样执行的一些原因可参考"码农每日一题"公众号文章：《再谈 Java 类加载、链接、初始化流程细节问题》
https://gitee.com/xiaominglei001/forMarkdown/raw/master/20200820170521.png

*/