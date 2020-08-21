package aamytest.init;

public class TestA {


    private String comefrom;

    public TestA(String comefrom) {
        this.comefrom = comefrom;
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "--init TestA()--来自：" + comefrom);
        } catch (Exception e) {

        }

    }

    {
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "--init block--来自：" + comefrom);
        } catch (Exception e) {

        }


    }

    public void sayMyName() {
        try {
            Thread.sleep(10);
            System.out.println(System.currentTimeMillis() + "--MyNameisTestA--来自：" + comefrom);
        } catch (Exception e) {

        }

    }


}
