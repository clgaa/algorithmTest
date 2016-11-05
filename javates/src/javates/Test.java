package javates;

    import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
    public class Test {
        public static double round(double value, int scale) {
            if (scale < 0) {
                scale = 0;
            }
            BigDecimal bd = new BigDecimal(value);
            return bd.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
    public static void main(String[] args) throws InterruptedException {
        
        try {
            System.out.println(A.class.getSimpleName());
            A a1 = (A)Class.forName("A", true, Test.class.getClassLoader()).newInstance();
            a1.showA();
        } catch (InstantiationException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        } catch (IllegalAccessException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        } catch (ClassNotFoundException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }
        
        
        
        
        
        String s2 = "总价:12元";
        System.out.println(s2.length());
        
        
        
        String s1 = "$1$2\n\r234\r\n";
        System.out.println(s1);
        byte[] a1 = s1.getBytes();
//        System.out.println(a);
        
        String[] sList =  s1.split("\n\r");
//        s1.s`
////        s1.indexOf('$');
        System.out.println(sList.length);
        System.out.println(sList[0]);
        System.out.println(sList[1]);
//        System.out.println(sList[2]);
//        for (String string : sList) {
//            System.out.println(string);
//        }
        
        
        Thread m1 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                while(true){  
                    try {  
                        CommonUtil.writeFile("1");  
                    } catch (Exception e) {  
                        System.out.println("1 Exception");
                        e.printStackTrace();  
                    }  
                }  
            }
        });
        
        Thread m2 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                while(true){  
                    try {  
                        CommonUtil.writeFile("2");  
                    } catch (Exception e) {  
                        System.out.println("2 Exception");
                        e.printStackTrace();  
                    }  
                }  
            }
        });
        m2.start();
        m1.start();
        
        BigInteger m = new BigInteger("0");
        System.out.println("m = " + m.intValue());
        
        String test1 = "AC6B89033A0812690DFF39A466F640CED71CD921D782306BC3D4975DE9B4A74D8FC31E7AA0DF814E647341F85AA53AD1C96CEC9B2E7688722B3B7A72711436E669A48A0B9651A05B2305617B5055484619C37538A261460F433E1CC6B3B3467D30630D99B8188D9CFB66DCAC1836C914F9323B9681A1EA30AA806B1347393EBD91B8D3FBF12E4FB2A342879880EE4A24FD6944460D5642D909C74C01AB2E0EEC44FD5B71810526E0E2A061AB51F7AF7512F5FF69570127935016EC467B3F516ABAC13FE969DEF2BA622041A4BCA530C1192A123221ED96E97C2047C3B052A90E3B6CBAC9E1E36480F713AEF9129D875EE5223694FC5B26740AC1E340DA239321";
        System.out.println(test1.length());
        
        Double d2 = Double.valueOf("10") + Double.valueOf("20.8");
        Double d1 = Double.valueOf("40");
        Double d4 = Double.valueOf("20.8");
        Double d3 = round(Double.valueOf("31.2"),1);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        try {
           Class<?> c1 = Class.forName("javates.A");
//           c1.
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try{
            String host = InetAddress.getByName("www.sina.com.cn").toString();
            System.out.println("host is " + host);
        }catch(Exception e){
            e.printStackTrace();
        }
        A a = new A("a", "b");
        B b = new B();
        b.getA();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        try{
            
            Future<?> runnable1 = executor.submit(new Runnable() {
                
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    System.out.println("Sleep start.");  
                    try {  
                        Thread.sleep(1000 * 10);  
                    } catch (InterruptedException e) {  
                        // TODO Auto-generated catch block  
                        e.printStackTrace();  
                    }  
                    System.out.println("Sleep end.");  
                    System.out.println("runnable1 running");
                }
            });
            if(null == runnable1){
                System.out.println("runnable1 end");
            }
//            System.out.println("runnable1: " + runnable1.get());
            Future<?> runnable2 = executor.submit(new Runnable() {
                
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    System.out.println("runnable2 running");
                }
            });
            Future<?> runnable3 = executor.submit(new Runnable() {
                
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    System.out.println("runnable3 running");
                }
            });
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        single.singleN testSingle = new single.singleN();
}
    
    @testtry("adf")
    public void testtry(){
        int a = 0;
    }
    }
