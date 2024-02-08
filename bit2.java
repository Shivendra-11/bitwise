import java.util.Arrays;

public class bit2 {
    static int ans(int arr[]){
        int unique=0;

        for(int n:arr){
            unique=unique^n;
        }
        return unique;
    }
    
    public static void main(String[] args) {
    int arr[]={2,3,3,5,4,2,6,4};
   System.out.println(ans(arr));

    }
    
}
