package pertemuan5.contohException;
import java.util.Scanner;
public class ExcepTest4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        System.out.println();
        System.out.println("Function --> a-b");
        System.out.print("Enter value a: ");
        a=scanner.nextInt();
        int b;
        System.out.print("Enter value b: ");
        b=scanner.nextInt();
        
        try {
            int result=a-b;
            if (result<0) {
                throw new IllegalArgumentException("the result may be negative");
            }
            System.out.println("Hasil: "+result);
        } catch(IllegalArgumentException e){
            System.out.println("Exception: "+e.getMessage());
        }catch (Exception e) {
            System.out.println("The result cannot  be processed");
        }finally{
            System.out.println();
            System.out.println("Process is end");
        }
    }
}
