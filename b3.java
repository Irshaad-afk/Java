import java.util.Scanner;

 class b3 {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter the Numbers a and b :");

        int a =  s.nextInt();
        int b =  s.nextInt();

        if((a^b)<(0))
        {
            System.out.println("The number is positve ");
        }
        else{
            System.out.println("The number is negative ");
        }
    }
    
}
