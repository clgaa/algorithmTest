package test3;

public class stateManager {

    state A;
    public void setState(state mState){
        A = mState;
    }
    
    public void showView(String data){
        A.handle(data);
    }
}
