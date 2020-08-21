package aamytest;

public class TestA {
    {
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "init block");
        } catch (Exception e) {

        }


    }

    public TestA() {
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "init TestA()");
        } catch (Exception e) {

        }

    }


}
