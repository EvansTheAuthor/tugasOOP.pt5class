package pertemuan5.contohException;

public class ExcepTest {
    public static void main(String[] args) {
        try {
            int a[]=new int[2];
            System.out.println("Access element three: "+a[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception thrown: "+ex);
        }
        System.out.println("Out of the block");
    }
}
