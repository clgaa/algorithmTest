package javates;

public class hook {

    {
        System.out.println("good");
    }
    
    Native data = new Native("ok");
    
    public static void main(String[] args) {
        System.out.println("no");
        hook mHook = new hook();
//        data.show();
    }
    
    class Native {
        public Native(String data) {
            System.out.println(data);
        }
        public void show() {
            System.out.println("native show");
        }
    }
}
