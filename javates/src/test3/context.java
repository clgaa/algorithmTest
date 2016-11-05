package test3;

public class context {
    
    public static void main(String args[]){
        stateManager mManager = new stateManager();
        state A = new stateA();
        
        mManager.setState(A);
        mManager.showView("good");
        
        state B = new stateB();
        
        mManager.setState(B);
        mManager.showView("good");
        
        long a = -1;
        System.out.println(String.valueOf(a));
    }

}
