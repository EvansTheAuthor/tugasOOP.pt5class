package pertemuan5.contohException;

public class ExcepTest {
    public static void main(String[] args) {
        try { //mencoba mengakses array a pada indeks ke-3
            int a[]=new int[2];
            System.out.println("Access element three: "+a[3]);
        } catch (ArrayIndexOutOfBoundsException ex) { //mencegah permintaan akses array yang salah menghentikan program
            System.out.println("Exception thrown: "+ex);
        }
        System.out.println("Out of the block");
    }
}
