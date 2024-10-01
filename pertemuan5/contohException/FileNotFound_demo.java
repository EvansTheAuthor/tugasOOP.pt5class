package pertemuan5.contohException;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFound_demo {
    public static void main(String[] args) {
        File file=new File("E://file.txt");
        try {
            FileReader fr=new FileReader(file);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: "+ex.getMessage());
        }finally{System.out.println("PRocess is end.");}
        
    }
}
