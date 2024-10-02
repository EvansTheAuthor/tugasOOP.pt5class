package pertemuan5.contohException;

public class EXcepTest6 {
    public static void main(String[] args) {
        int a[]=new int[2];
        try { //mencoba mengakses array pada indeks ke-3
            System.out.println("Access element three: "+a[3]);
        } catch (ArithmeticException e) { //mencegah kesalahan perhitungan namun karena tidak ada jadi tidak akan ada error spesifik yang akan diberitahukan
            System.out.println("Exception thrown --> "+e);
        }finally{ //mengatur isi indeks ke-0 adalah 6
            a[0]=6;
            System.out.println("First element value: "+a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
