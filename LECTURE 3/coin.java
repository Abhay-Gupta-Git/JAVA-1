public class coin {
    public static void main(String[] args) {
        int n=4;
        coins(n,"");
        
    }
    public static void coins(int n,String ans){
        if(n==0){
           System.out.println(ans);
           return;
        }
        coins(n-1, ans+"H");
        coins(n-1, ans+"T");
    }
}
