import java.util.Scanner;

public class GraduationPT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int year = 1;
        double grade = 0;
        double allGrades = 0;

        while (year <= 12) {
            grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4.00) {
                allGrades += grade;
                year++;
            }
            if (grade < 4.00) {
                System.out.printf("%s has been excluded at %d grade", name, year);
                break;
            }
        }


        if (grade >= 4.00) {
            double average = allGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}