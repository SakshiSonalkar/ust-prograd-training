public class DRoot {
  public static int digital_root(int n) {
    int rem=0;
    int sum=0;
    while(n>0 || sum>9){
      
      if(n==0){
        n=sum;
        sum=0;
      }
       rem=n%10;
       sum=sum+rem;
       n=n/10;
    }
    return sum;
  }
}