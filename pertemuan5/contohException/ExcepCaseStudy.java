package pertemuan5.contohException;

public class ExcepCaseStudy {
    public static void main(String[] args) {
        try { //mencoba mengisi indeks ke-5 dengan 100 padahal indeks maksimal adalah 4
            int a[]=new int[5];
            a[5]=100;
            //System.out.println("Access the variable: "+a[4]);
        } catch (Exception e) { //menampilkan error yang terjadi dan mencegah program berhenti
            System.out.println("Caught an exception --> "+e);
        }
    }
}
