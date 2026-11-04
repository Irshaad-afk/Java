import java.util.Scanner;
public class a1{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of Array 1:");
        int r1 = s.nextInt();

        System.out.println("Enter the size of Array 2:");
        int r2 = s.nextInt();

        int r3 = 0;

        int a[] = new int [r1];
        int b[] = new int [r2];
        int c[] = new int [r1+r2];


        System.out.println("Enter the elements Array 1:");
        for(int i=0;i<a.length;i++){
           a[i] = s.nextInt();
           
         }
         
        System.out.println("Enter the elements Array 2:");
        for(int i=0;i<b.length;i++){
         b[i] = s.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0){
                if ( r3 == 0)
                c[r3]= a[i];
                r3+=1;
            }
            else
            {
            int x = 0;
            for(int j=0;j<r3;j++)
            if( c[r3] == a[i])
            x+=1;
            }
        }
        for(int i=0;i<b.length;i++)
        {
            if(a[i]%2==0){
                if ( r3 == 0)
                c[r3]= b[i];
                r3+=1;
            }
            else
            {int d = 0;
            for(int j=0;j<r3;j++)
            if ( c[r3] == b[i])
            d+=1;
            }
            
        }

        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.println("Array 1:"+a[i]);
            
        }

        System.out.println();
          for(int i=0;i<b.length;i++){
            System.out.println("Array 2:"+b[i]);
            
        }

        System.out.println();
          for(int i=0;i<r3;i++){
            System.out.println("Array 3:"+c[r3]);
           

        }
      System.out.println();







    }


}
