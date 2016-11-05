package javates;

public class replace {

    public static void main(String[] args){
        String s = "http://17_0.110.8/product/wanliu";
        String temp = s.replaceFirst("(\\w+\\.)+\\w+", "hello");
        System.out.println(temp);
    }
}
