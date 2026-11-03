import java.util.Scanner;
public class git8 {
    public static void main(String[] args){

    
    int[] num=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Numbers:");
    for(int i=0;i<5;i++)
    {
            num[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<5;i++)
    {
        sum=sum+num[i];
    }
    System.out.println("The sum:"+sum);
    sc.close();
}
}