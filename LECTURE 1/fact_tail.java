public class fact_tail {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n,1));
    }
    public static int fact(int n,int ans){
        //base case 
        if(n==0){
            return ans ;
        }
      //  int f=fact(n-1);   //smaller problem
        return fact(n-1,ans*n);
    }
}
