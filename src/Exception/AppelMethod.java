package Exception;

public class AppelMethod {
    private int counter = 0;

    public void method1() {
        this.method2();
    }

    public void method2() {
        if (counter < 10) {
            counter++;
            this.method1();
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        AppelMethod appel = new AppelMethod();
        appel.method1();
    }
}