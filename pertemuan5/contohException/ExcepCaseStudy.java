package pertemuan5.contohException;

public class ExcepCaseStudy {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            a[5]=100;
            //System.out.println("Access the variable: "+a[4]);
        } catch (Exception e) {
            System.out.println("Caught an exception --> "+e);
        }
    }
}
