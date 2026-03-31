public class replace_character {
    public static void main(String[] args) {
        String s="cat";
        replace(s,"");
    }
    public static void replace(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        if(ch =='a'){
            replace(ques.substring(1), ans+"o");
        }
        else{
            replace(ques.substring(1), ans+ch);
        }
    }
        
    }
