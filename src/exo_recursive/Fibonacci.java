package exo_recursive;

 /* La liste de Fibonacci est une suite d'entier
  * dans laquelle chaque entier cumulé est la somme des deux entiers précédents
  * 
  * F3 = (F(pos-1) + F(pos-2))
  *
  *   |----| |x---| |x---| |x----| |x-----| |x-----| |x-------| |x-------| = x
  *    0  1   1  2   3  5   8  13   21  34   55  89   144  233   377  610  = 987
  *    x |-----||x----||x----||x------||x------||x-------||x--------||x--|
  *             
  *		 x		= entier de la suite de Fibonacci
  *  	|--|	= entiers précédents 
  */
public class Fibonacci 
{
    static int	n1 = 0,
    			n2 = 1,
    			n3 = 0;
    
    static void suiteFibonacci(int count)
    {      
       if (count > 0)
       {
    	   System.out.print("\n");
    	   System.out.print("(" + count + ")");
    	   n3 = n1 + n2;      
    	   n1 = n2;      
    	   n2 = n3;      
    	   System.out.print(" " + n3);
    	   
    	   suiteFibonacci(count-1);
        }      
    } 
	public static void main(String[] args) 
	{
		int count = 17;
		
		System.out.print(n1 + " " + n2);			// printing 0 and 1      
		suiteFibonacci(count-2);					// n-2 because 2 numbers are already printed   
	}
}