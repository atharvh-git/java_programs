import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Deletion_Array {
    public static void main(String[] args) {
        int n, i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements");
        n = sc.nextInt();
        int[] a = new  int[n];
        int[] b = new int[n-1];
        System.out.println("Enter elementss:");
        for(i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter index of new value to be deleted");
        int m = sc.nextInt();
        for(i=0; i<a.length; i++){ //0  1  2  3  4
            if(i<m){              //10 20 30 40 50
                b[i]=a[i];
            }else if(i==m){
                continue;         // 10 20
            }else{
                b[i-1]=a[i];
            }

        }
            System.out.println("The new array is");
            for(i=0; i<n-1; i++){
               System.out.println(b[i]);
            }
    }
}
    

