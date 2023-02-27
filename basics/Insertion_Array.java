import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Insertion_Array
{
	public static void main (String[] args) 
	{
	    int n, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n+1];
		System.out.println("Enter values:");
		for(i = 0; i<n; i++){
			a[i] = sc.nextInt();
        }
		System.out.println("Enter index of new value to be inserted:");
		int m = sc.nextInt();
		System.out.println("Enter new value to be inserted:");
		int s = sc.nextInt();
		for(i = 0; i<n+1; i++){
			if(i<m){
				b[i]=a[i];
			}else if(i==m){
				b[i]=s;
			}else{
				b[i]=a[i-1];
			}
		}
		System.out.println("The new array is");
		for(i=0; i<n+1; i++){
			System.out.println(b[i]);
		}
	    
	    
	} 
	}
