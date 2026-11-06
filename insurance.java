import java.util.Scanner;

interface Policy
{
    public abstract void calPremium();
    public abstract void claimEligiblity();

    default void displayPolicy()
    {
        System.out.println("Policy type: "+ getPolicyType);

    }
    private String getPolicyType()
    {
        return "Insurance Policy";
    }
    static void companyName()
    {
        System.out.println("Insurance Company");
    }

}

class HealthPolicy implements Policy
{
    private String name;
    protected int age;
    public double amount ;

    public HealthPolicy(String name. int age, double amount)
    {
        this.name = name;
        this.age = age;
        this.amoutn = amount;
    }
    public void calPremium()
    {
        double premium = amount *0.05;

        if(age>50)
        premium = premium + 2000;

        System.out.println("Customer Name :"+ name);
        System.out.println("premium Amount :"+ premium);

    } 

    public void claimEligiblity()
    {
        if(age >= 18)
        System.out.println("")
    }
    
}
