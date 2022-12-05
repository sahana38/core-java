class FibonacciSeries{

  public static void main(String d[])
   {
   int n= 20 , firstTerm=0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for(int i=1; i<=n; i++)
    {
    System.out.println(firstTerm + " ,");
    int nextTerm = firstTerm + secondTerm;
    firstTerm = secondTerm;
    secondTerm = nextTerm;
   }
  }
}