
public class first_occurence {
    public static void main(String[] args) {
        int arr[]={3,2,4,2,4};
        int item=4;
        System.out.println(rec(arr, item,0));
    }
    public static int rec(int arr[],int item,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }
        return  rec(arr, item, i+1);
        
    }
}
