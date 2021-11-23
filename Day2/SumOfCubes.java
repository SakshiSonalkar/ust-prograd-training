public class Solution{
  public static long sumCubes(long n)
  {
    //put your code here :D
    long i=0;
    long sum=0;
    long c=0;
    for(i=1;i<=n;i++)
      {
       c=i*i*i;
       sum=sum+c;
    }
    return sum;
  }
}