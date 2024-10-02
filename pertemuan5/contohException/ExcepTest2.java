package pertemuan5.contohException;

public class ExcepTest2 {
    public static void main(String[] args) {
        int a[]=new int[2];
        int b=0;

        try { //mencoba membagi c dengan 0 dan mengakses array a pada indeks ke-3
            int c=1/b;
            System.out.println("access element three: "+a[3]);
        } catch(ArrayIndexOutOfBoundsException ex){ //mencegah kesalahan permintaan array menghentikan program
            System.out.println("ArrayIndexOutOfBondsException thrown: "+ex);
        }catch (Exception ex) { //mencegah kesalahan secara umum terjadi, artinya dalam kasus ini mencegah kesalahan pembagian angka
            System.out.println("Exception thrown: "+ex);
        }
        System.out.println("Out of block.");
    }
}
