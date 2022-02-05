import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Arraylisting {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of array elements");

        Map<Integer, Integer> ob=new HashMap<>();

        int  n=sc.nextInt();
        int k[]=new int[n];
        for(int i=0;i<n;i++){
            k[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int j=1;
            int a = k[i];
            if(ob.containsKey(a))
            {
                ob.put(a,++j);
            }
            else
            {
                ob.put(a,j);
            }
        }

        System.out.println(ob.toString());
        int target=sc.nextInt();
        int count=0;

        for(int i=0;i<n;i++){

            int result=target-k[i];
            if(ob.containsKey(result))
            count++;
        }
        System.out.println(count/2);
        
        



    }
}
