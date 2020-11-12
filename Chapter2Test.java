import java.util.Scanner ;

public class Chapter2Test {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("please enter an integer ");
  double firstNum = scan.nextDouble();
  System.out.println("please enter another integer ");
  double secondNum = scan.nextDouble();
  System.out.println(firstNum);
  System.out.println(secondNum);
  double average = (firstNum + secondNum) / 2;
  System.out.println("the average of the two numbers is "+ average);
  
  
  }
}
