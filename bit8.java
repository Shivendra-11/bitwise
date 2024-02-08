public class bit8 {
    static int bit(int a){

        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
           if(a%4==2){
            return (a+1);
        }
           if(a%4==3){
            return 0;
        }
       return -1;
    }
    public static void main(String[] args) {
        int b=9;
        int a=3;
        System.out.println(bit(b)^bit(a-1));
    }
    
}
