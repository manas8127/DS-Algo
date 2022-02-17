import java.util.*;

public class BubbleSort {
    
    static int[] bubble(int a[])
    {
        int temp;
        boolean swap=false;

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {

                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }

                
            }
            if(!swap)
                break;
        }

        return a;

    }
    public static void main(String sd[])
    {


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        b=bubble(a);

        
        System.out.println(Arrays.toString(b));

        sc.close();


    }


}
