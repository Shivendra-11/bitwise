public class bit3 {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,34,5,5};
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique^=arr[i];
            
        }
        System.out.println(unique);
    }
    
}
