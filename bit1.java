public class bit1 {
    static boolean evenodd(int n){
        return (n&1)==1;
    }
    public static void main(String[] args) {
        boolean s=evenodd(299);
        if(s){
            System.out.println("odd");

        }
        else{
            System.out.println("even");
        }
    }
    
}
