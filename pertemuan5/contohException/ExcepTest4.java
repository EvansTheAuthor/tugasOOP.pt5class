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
        
        try { //mencoba mengurangi a dengan nilai b berdasar nilai yang diinput user
            int result=a-b;
            if (result<0) {
                throw new IllegalArgumentException("the result may be negative");
            }
            System.out.println("Hasil: "+result);
        } catch(IllegalArgumentException e){ //mencegah hasil bilangan negatif keluar
            System.out.println("Exception: "+e.getMessage());
        }catch (Exception e) {// ada sebab masalah lain
            System.out.println("The result cannot  be processed");
        }finally{//menjalankan proses tanpa pengaruh try-catch
            System.out.println();
            System.out.println("Process is end");
        }
    }
}
