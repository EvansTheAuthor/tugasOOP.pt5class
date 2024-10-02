package pertemuan5.contohException;

public class ExcepTest3 {
    public static void main(String[] args) {
        int a[]=new int[2];
        int b=0;
        try {//mencoba membagi c dengan 0 dan mengakses 
            int c=1/b;
            System.out.println("Access element three: "+a[3]);
        } catch (ArrayIndexOutOfBoundsException|ArithmeticException ex) { //emncegah kesalahan permintaan array ataupun pembagian menghentikan program
            System.out.println("Exception thrown: "+ex);
        }
        System.out.println("Out of block.");
    }
}
