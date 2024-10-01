package pertemuan5.contohException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        try {
            File file=new File("D://test//testFile1.txt");

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File is already exists");
            }
            
            FileWriter writer=new FileWriter(file);
            writer.write("Test data");
            writer.close();
        } catch (IOException ex) {
            System.out.println("Exception");
        }
    }
}
