package pertemuan5.contohException;

public class uncheckedDemo {
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        
        try{
            System.out.println(num[5]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("There is an error"+ex.getMessage());
        }finally{System.out.println("Process is end.");}
    }
}
