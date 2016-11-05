package javates;

public class single {

    private single(){
        
    }
    public static class newSingle{
        private static single msingle = new single();
    }
    public static single getInstance(){
        return newSingle.msingle;
    }
    
    public static class singleN{
        
        public singleN(){
            
        }
    }
}
