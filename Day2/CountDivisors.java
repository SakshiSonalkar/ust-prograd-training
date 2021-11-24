public class FindDivisor {

  public long numberOfDivisors(int n) {
    int i,j;
    j=n;
    int count=0;
    for(i=1;i<=j;i++){
      if(n%i==0){
        count=count + 1;
      }
    }
    return count;
  }

}