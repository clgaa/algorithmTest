package javates;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CommonUtil {
    
    public static void readFile() throws Exception{
        InputStream is = new FileInputStream("D://abc.txt");
        BufferedInputStream br = new BufferedInputStream(is);
        byte b[] = new byte[26];
        br.read(b);
        System.out.println(new String(b));
        br.close();
        is.close();
    }
    
    public static void writeFile(String s) throws Exception{
//        File f = new F
        OutputStream is = new FileOutputStream(new File("/Users/chenlong/Documents/abc.txt"), true);
        BufferedOutputStream bo = new BufferedOutputStream(is);
//        String s = "abcdefghijklmnopqrstuvwxyz";
        bo.write(s.getBytes());
        bo.close();
        is.close();
    }
    
    /*public static void main(String[] args) throws Exception{
        writeFile();
        readFile();
    }*/
    
}
