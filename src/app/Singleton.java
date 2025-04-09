package app;

public class Singleton {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Main is working");

        Logger logger2 = Logger.getInstance();
        logger2.log("Main is working");

        System.out.println(logger1 == logger2);

        Factory factory = new Factory();
        factory.isWork();

        Farm farm = new Farm();
        farm.isWork();
    }
}