/**
 * Author xiaozhi
 * on 3/18/16.
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        staticFunction();
    }

    static ClassLoaderDemo st = new ClassLoaderDemo();
    int a = 110;
    static int b = 112;

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    ClassLoaderDemo() {
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void staticFunction() {
        System.out.println("4");
    }
}
