class Factorial{

  public static void main(String a[])
  {
  int num = 5;
    int factorial = 1;


    for(int i = 1; i<=num; ++i)
    {
    factorial =factorial * i;
    }

    System.out.printf("Factorial of" +num+ "is:" +factorial);
  }
}