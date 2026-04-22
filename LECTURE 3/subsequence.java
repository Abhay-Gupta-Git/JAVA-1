<<<<<<< HEAD
public class subsequence {
    public static void main(String[] args) {
        String  s="abc";
        print(s,"");
    }
    public static void print(String ques,String ans){
           if(ques.length()==0){
            System.out.println(ans);
            return;
           }
           char ch=ques.charAt(0);
           print(ques.substring(1),ans);
           print(ques.substring(1),ans+ch);
           
    }
}
=======
public class subsequence {
    public static void main(String[] args) {
        String  s="abc";
        print(s,"");
    }
    public static void print(String ques,String ans){
           if(ques.length()==0){
            System.out.println(ans);
            return;
           }
           char ch=ques.charAt(0);
           print(ques.substring(1),ans);
           print(ques.substring(1),ans+ch);
           
    }
}
>>>>>>> e59286c (done)
