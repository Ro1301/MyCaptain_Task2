package MyCaptain_Task2;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    System.out.println("Enter 5 numbers:");
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }

  Sortingarr.bubblesort(arr);

  System.out.println("Sorted array:");
  for(int j=0;j<5;j++){
    System.out.println(arr[j]);
  }

  System.out.println("Second largest number:"+ Manipulation.findsecondlargest(arr));
  System.out.println("Second smallest number:"+ Manipulation.findsecondsmallest(arr));
  }
}
