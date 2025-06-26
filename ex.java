public class ex{
    void sum(int money,int a){
System.out.println(money+a);
        System.out.println("ger");
    }
    void sub(int money,int a){
System.out.println(money-a);
        System.out.println("go");
    }
    void mul(int money,int a){
System.out.println(money*a);
        System.out.println("gave");
    }

    public static void main(String[] args) {
        ex obj1=new ex();
        obj1.sum(20,2);
        obj1.sub(22,2);
        obj1.mul(22,2);
    }
}