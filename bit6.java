public class bit6 {
    
    public static void main(String[] args) {
        int n=16;
        int c=0;
        while(n>0)
        {
            int last=n&1;
            n=n>>1;
            if(last==1){
                c++;
            }
            
           
        }
        if(c>1)
        {
            System.out.println("power");
        }
        else
        {
            System.out.println("not a power");
        }
    }
}
