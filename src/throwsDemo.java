import java.util.Scanner;

public class throwsDemo {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++){
            try{
                System.out.println(i);
                Thread.sleep(20);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
