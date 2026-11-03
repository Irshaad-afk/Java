public class git6 {
    public static void main(String[] args){
        String a = "apple";
        String b = "apple";
        
        String c=new String("apple");
        String d=new String("apple");
//here == only check the referecne of the content that is the address and not the values are equal but equals ()checks the value of the content of the two strings
        System.out.println(a==b);
        System.out.println(c.equals(d));

    }
    
}
