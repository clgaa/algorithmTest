package test3;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        TestInvocation m = new TestInvocation();
        
        GetHttp proxy = (GetHttp) Proxy.newProxyInstance(GetHttp.class.getClassLoader(), 
               new Class[]{ GetHttp.class }, m);
        proxy.getHttp();
    }
}
