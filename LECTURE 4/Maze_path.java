public class Maze_path {
    public static void main(String[] args) {
        int n=3;//row
        int m=2;//col
        path(0, 0,n-1,m-1,"");
        System.out.println(count);
    }
    //cr current row, cc current column , er end row , ec end column 
    static int count=0;
    public static  void path(int cr,int cc,int er,int ec,String ans){
         if(er==cr && cc==ec){
       //     System.out.println(ans);
            count++;
            return ;
         }
         if(cr>er || cc>ec){
            return;
         }
         path(cr, cc+1, er, ec, ans+"H");
         path(cr+1, cc, er, ec, ans+"V");
    }
}
