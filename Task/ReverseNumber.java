class ReverseNumber{

  public static void main(String c[]){
  int num = 1234, rev =0;
  System.out.println("Original Number : " +num);
 while(num != 0){

 int digit = num % 10;
 rev = rev * 10 + digit;
 num = num/10;
 }

 System.out.println("Rev Number : " +rev);
 }
}