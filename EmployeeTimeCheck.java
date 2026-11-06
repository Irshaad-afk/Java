import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Scanner;

class Employee{

    int ID;
    LocalTime timeIn;
    LocalTime timeout;

    

    void getDetail()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter ID:");
        ID = s.nextInt();

        System.out.println("Enter Login Year Month Day Hour(O-23) Minute(0-59): ");
        int y1 = s.nextInt();
        int m1 = s.nextInt();
        int d1 = s.nextInt();
        int h1 = s.nextInt();
        int min1 = s.nextInt();
       
        timeIn = LocalTime.of(y1,m1,d1,h1,min1);

        System.out.println("Enter Logout Year Month Day Hour(O-23) Minute(0-59): ");
        int y2 = s.nextInt();
        int m2 = s.nextInt();
        int d2 = s.nextInt();
        int h2 = s.nextInt();
        int min2 = s.nextInt();
       
        timeOut = LocalTime.of(y2,m2,d2,h2,min2);
    }

    void checkTime()
{
    Duration duration = Duration.between(timeIn , timeOut);
    long hours = duration.toHours();
    long minutes = duration.toMinutes() % 60;

    System.out.println();
    System.out.println("Employee Id   :  " + ID);
    System.out.println("Login Time    :  " + timeIn);
    System.out.println("Logout Time   :  " + timeOut);
    System.out.println("Total Duration:  " + hours + " hrs " + minutes + " mins ");

    if(hours >= 8)
    {
        System.out.println("Good ,Keep it up");

    }
    else
    {
        System.out.println("Not Good ,Not Satisfied");
    }

}

}

public class EmployeeTimeCheck {
    public static void main(String[] args){

        Employee emp = new Employee();
        emp.getDetail();
        emp.checkTime();
    }
}

