
import java.util.Scanner;

public class garden{

    Scanner scan=new Scanner(System.in);
    int apple_count=scan.nextInt();
    int apple_price=scan.nextInt();
    void total_money(){
        System.out.println(apple_price*apple_count);
    }
    public static void main(String[] args) {
    
        garden obj1=new garden();

        obj1.total_money();

    }
}