package aamytest.init;

//测试TestA及TestB类的成员变量造代码块等初始化及调用时机
public class TestB {
    private TestA mA = new TestA("成员变量");

    public static void main(String[] args) {
        TestB b = new TestB();
        b.mA.sayMyName();

        TestA a = new TestA("main函数");
        a.sayMyName();
    }
}
