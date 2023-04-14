package leap;
import java.util.Scanner;

public class leapyears {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        System.out.print("Enter the month : ");
        String monthInput = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter the year : ");
        int year = scanner.nextInt();

        int month = -1;
        if (monthInput.matches("[0-9]+")) {
            int monthNumber = Integer.parseInt(monthInput);
            if (monthNumber >= 1 && monthNumber <= 12) {
                month = monthNumber - 1;
            }
        } else {
            for (int i = 0; i < months.length; i++) {
                if (monthInput.equalsIgnoreCase(months[i]) || monthInput.equalsIgnoreCase(months[i].substring(0, 3))) {
                    month = i;
                    break;
                }
            }
        }

        if (month != -1 && year >= 0) {
            int daysInMonth = getDaysInMonth(month, year);
            System.out.println("Number of days in " + months[month] + " " + year + ": " + daysInMonth);
        } else {
            System.out.println("Invalid month or year. Please enter again.");
        }

        scanner.close();
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth;
        switch (month) {
            case 1:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;  
                }
                break;
            case 3: 
            case 5: 
            case 8: 
            case 10: 
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }
        return daysInMonth;
    }
}
