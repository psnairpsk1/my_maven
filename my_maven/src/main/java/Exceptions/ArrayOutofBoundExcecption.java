package Exceptions;

public class ArrayOutofBoundExcecption {
 int arr[] = new int[3];
 public ArrayOutofBoundExcecption()
 {
  arr[0] = 1;
  arr[1] = 2;
  arr[2] = 4;
 }
public void display()
{
	System.out.println(arr[3]);
	}
public static void main(String[] args) {
    ArrayOutofBoundExcecption ab = new ArrayOutofBoundExcecption();
    ab.display();
}
}
