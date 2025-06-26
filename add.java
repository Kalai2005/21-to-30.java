public class add{
    int sum(int a,int b){
        int c=a+b;
        return c;

    }
    public static void main(String[] args) {
        add obj1=new add();
        int sum=obj1.sum(20, 8);
System.out.println(sum);
    }
}