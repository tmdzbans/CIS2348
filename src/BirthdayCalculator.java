//Twila Marie Dzbanski PSID:1462844
import java.util.Scanner;

public class BirthdayCalculator {
    public static void main(String[] args) {
        //Declaring new scanner Object
        Scanner keyboard = new Scanner(System.in);
        //Prompt the User to enter the current date by month,day and year
        System.out.println("Enter the Current Month:");
        int CurrentMonth = keyboard.nextInt();
        System.out.println("Enter the Current day:" );
        int Day = keyboard.nextInt();
        System.out.println("enter the current year:");
        int Year = keyboard.nextInt();
        //Prints the Data given by user
        System.out.println("The Current day is : \n"+ CurrentMonth +"/"+ Day +"/"+ Year);
        //Prompt the user to enter Birthday Month, Day, and year
        System.out.println("Enter in your Birthday Month : ");
        int BirthDayMO = keyboard.nextInt();
        System.out.println("Enter the day you were born : ");
       int DAY = keyboard.nextInt();
        System.out.println("Birthday year ? ");
        int YEAR = keyboard.nextInt();
        //Declare Variables
        int cmonth=CurrentMonth;
        int cday=Day;
        int cyear=Year;
        int dobmonth= BirthDayMO;
        int dobDay= DAY;
        int dobyear=YEAR;
        int AGE= cyear - dobyear;

        if (dobmonth > cmonth) {
            AGE--;
        } else if (dobmonth==cmonth){
            if (dobDay > cday) {
                AGE--;
            }
        }
        if (dobmonth== cmonth && dobDay==cday) { System.out.println(" Your Birthday is Today! Happy Birthday!");}
       System.out.println("You're age is "+ AGE);

    }
}