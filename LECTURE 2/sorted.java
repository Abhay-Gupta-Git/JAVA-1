<<<<<<< HEAD
public class sorted {
    public static void main(String[] args) {
        int [] arr={2,3,5,8,9};
        System.out.println(sort(arr, 0));
    }
    public static boolean sort(int []arr ,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(arr, i+1);
    }
}
=======
public class sorted {
    public static void main(String[] args) {
        int [] arr={2,3,5,8,9};
        System.out.println(sort(arr, 0));
    }
    public static boolean sort(int []arr ,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(arr, i+1);
    }
}
>>>>>>> e59286c (done)
