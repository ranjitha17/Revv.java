import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class Rott
{   
    public static void main(String arg[])
    { int i,j,l=0;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int a[]=new int[n+1];
    int c[]=new int[10];
    for(i=0;i<n;i++)
    {
        a[i]=s.nextInt();
        
    }
        
        for(j=k+1;j<n;j++)
        {
           c[l]=a[j];
           l++;
        }
        for(i=0;i<=k;i++)
        {
            c[l]=a[i];
            l++;
        }
        for(i=0;i<n;i++)
        {
    System.out.println(c[i]);
}
}
}



