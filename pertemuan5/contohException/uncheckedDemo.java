package pertemuan5.contohException;

public class uncheckedDemo {
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        
        try{ //mencoba menjalankan num pada indeks ke-5
            System.out.println(num[5]);
        }catch(ArrayIndexOutOfBoundsException ex){ //mencegah program berhenti dengan menunjukkan masalah yang terjadi
            System.out.println("There is an error"+ex.getMessage());
        }finally{System.out.println("Process is end.");}
    }
}
