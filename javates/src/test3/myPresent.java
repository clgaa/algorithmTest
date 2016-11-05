package test3;

public class myPresent extends basePresent{

    @Override
    public Class getVuClass() {
        // TODO Auto-generated method stub
        return MyView.class;
    }
    
    public static void main(String[] args){
        myPresent m = new myPresent();
        m.init();
    }

}
