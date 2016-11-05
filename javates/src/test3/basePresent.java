package test3;

public abstract class basePresent<V extends IView> {
    V Vu;
    public void init() {
        
        try {
            Vu = getVuClass().newInstance();
            ((MyView)Vu).getView();
            Vu.test();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public abstract Class<V> getVuClass();
    
}
