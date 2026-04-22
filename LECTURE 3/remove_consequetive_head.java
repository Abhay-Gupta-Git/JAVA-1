<<<<<<< HEAD


public class remove_consequetive_head {
    public static void main(String[] args) {
        int n=4;
        coins(n,"");
        
    }
    public static void coins(int n,String ans){
        if(n==0){
           System.out.println(ans);
           return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H'){
            coins(n-1, ans+"H");
        }
        coins(n-1, ans+"T");
    }
}
=======


public class remove_consequetive_head {
    public static void main(String[] args) {
        int n=4;
        coins(n,"");
        
    }
    public static void coins(int n,String ans){
        if(n==0){
           System.out.println(ans);
           return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H'){
            coins(n-1, ans+"H");
        }
        coins(n-1, ans+"T");
    }
}
>>>>>>> e59286c (done)
