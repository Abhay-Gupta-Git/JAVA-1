public class r0 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        //base case 
        if(n==0){
            return 1;
        }
        int f=fact(n-1);   //smaller problem
        return f*n;
    }
}
