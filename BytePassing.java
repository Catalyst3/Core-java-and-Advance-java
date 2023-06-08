package ParameterPassing;

public class BytePassing 
{ 
	 void show (byte a)
	 {
		 System.out.println(a);
	 }
	 public static void main(String args[])
	 {
		 BytePassing s = new BytePassing();
		 s.show((byte) 1);
	 }
}
