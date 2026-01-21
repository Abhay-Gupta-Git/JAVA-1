
public class r4 {
    public static void main(String[] args) {
        int n=5;
        sum(n);
    }
    public static void sum(int n){
       if(n==0){
        return ;
       }
       sum(n-1);
       System.out.println(n);
    }
}
