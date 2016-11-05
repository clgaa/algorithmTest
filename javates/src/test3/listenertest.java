package test3;

public class listenertest {

    private interface l {
        void onRec();
    }
    
    public void register(l m) {
        
    }
    
    public static void main(String[] args) {
        @listener(MsgType = 1, PushType = 2)
        int a;
        listenertest mlisterner = new listenertest();
        mlisterner.register(new l(){
            @Override
            @listener(MsgType=10, PushType = 2)
            public void onRec() {
                // TODO Auto-generated method stub
                
            }
        });
    }
}
