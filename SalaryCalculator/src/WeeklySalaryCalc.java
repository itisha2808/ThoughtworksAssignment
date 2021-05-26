import java.util.Scanner;

public class WeeklySalaryCalc {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] weeklyHours = new int[7];
        System.out.println("Enter the hours per day in a week starting from Sunday:");

        for (int i = 0; i < weeklyHours.length; i++) {
                weeklyHours[i] = sc.nextInt();
        }

        System.out.println("Weekly salary of Jeevitha is:" + salaryCalc(weeklyHours));
    }

    static int salaryCalc(int[] weeklyHours) {
        int salary = 0;
        int hoursPerWeek = 0;
        for (int i = 0; i < weeklyHours.length; i++) {
            salary = salary + (weeklyHours[i] * 100);
            hoursPerWeek += weeklyHours[i];
            if (weeklyHours[i] > 8) {
                salary = salary + 15 * (weeklyHours[i] - 8);
            }
        }
        //an extra Rs.25 an hour for hours beyond 40 in a week
        if (hoursPerWeek > 40)
            salary = salary + (hoursPerWeek - 40) * 25;

        //bonus for working on saturday and sunday

        if (weeklyHours[0] > 0)
            salary += (25 * (weeklyHours[5]));
        if (weeklyHours[6] > 0)
            salary += (50 * (weeklyHours[6]));

        return salary;
    }

}
