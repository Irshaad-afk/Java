import  java.util.*;
public class a2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int q = s.nextInt();
        int p = s.nextInt();
        

        String quiz[] = new String[q];
        String paper[] = new String[p];
        String Similar[] = new String[q+p];

        System.out.println("Enter the names for Quiz:");
        for(int i=0;i<quiz.length;i++){
           quiz[i] = s.nextLine();
           
         }
         
        System.out.println("Enter the names for Paper presentation:");
        for(int j=0;j<paper.length;j++){
         paper[j] = s.nextLine();

        }

            System.out.println();
        for(int i=0;i<quiz.length;i++){
            System.out.println("Quiz:"+quiz[i]);
            
        }

        System.out.println();
          for(int i=0;i<paper.length;i++){
            System.out.println("Paper Presentation:"+paper[i]);
            
        }

        for(int i=0;i<quiz.length;i++){
            for(int j=0;j<paper.length;j++){
                if(quiz.[i]equals(paper.[j])){
                    
                }





            }

        }

    }
    
}
