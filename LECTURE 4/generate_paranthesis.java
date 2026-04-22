
import java.util.*;

public class generate_paranthesis {
    public static void main(String[] args) {
        
        int n=3;
        List<String>ll=new ArrayList<>();
        paranthesis(n,0,0,"",ll);

    }
    public static void paranthesis(int n,int open,int closed,String ans,  List<String>ll){
        if(open==n && closed==n){
          System.out.println(ans);
          return;
        }
        if(open>n || closed>open){
            return;
        }
        paranthesis(n, open+1, closed, ans+"(",ll);
        paranthesis(n, open, closed+1, ans+")",ll);
    }
}
