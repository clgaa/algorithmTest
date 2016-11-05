package test3;

public class MainTest {
    
    int x = 0;
    String s = "a";
    public int inc() {
        try{
            x = 1;
            return x;
        } finally {
            System.out.println("finally");
            x = 3;
        }
    }
    
    public String incS() {
        try{
            s = "b";
            return s;
        } finally {
            System.out.println("finally");
            s = "c";
        }
    }

    public static void main(String[] args) {
        MainTest test = new MainTest();
        int x = test.inc();
        String s1 = test.incS();
        System.out.println("x = " + x);
        System.out.println("s1 = " + s1);
    }
}
