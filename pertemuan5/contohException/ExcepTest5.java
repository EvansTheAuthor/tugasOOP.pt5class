package pertemuan5.contohException;

public class ExcepTest5 {
    public static void main(String[] args) {
        try { //mencoba mengakses array a pada indeks ke-3
            int a[]=new int[2];

            try { //mencoba membagi c dengan 0 alias b
                int b=0;
                int c=1/b;
            } catch (Exception e) { //mencegah error menghentikan program dengan menampilkan spesifik masalah
                System.out.println("Exception thrown: "+e);
            }
            System.out.println("Access element three: "+a[3]);
        } catch (ArrayIndexOutOfBoundsException e) { //mencegah error menghentikan program dengan memberitahu bahwa array tidak bisa diakses dengan indeks yang diinginkan
            System.out.println("Exception thrown: "+e);
        }
        System.out.println("Out of the block");
    }
}
