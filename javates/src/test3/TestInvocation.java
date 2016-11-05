package test3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestInvocation implements InvocationHandler{

    @Override
    public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("object invoke " + arg0.getClass());
        return arg1.invoke(arg0, arg2);
    }

}
