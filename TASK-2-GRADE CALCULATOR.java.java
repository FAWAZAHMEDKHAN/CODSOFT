import java.util.Scanner;  

public class GradeCalculator{  

    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        int numSubjects;  

        System.out.print("Enter the number of subjects: ");  
        numSubjects = input.nextInt();  

        int[] marks = new int[numSubjects];  
        String[] subjectNames = new String[numSubjects];  

        for (int i = 0; i < numSubjects; i++) {  
            System.out.print("Enter the name of subject " + (i + 1) + ": ");  
            subjectNames[i] = input.next();  
            System.out.print("Enter marks obtained in " + subjectNames[i] + " (out of 100): ");  
            marks[i] = input.nextInt();  
        }  

        int totalMarks = 0;  
        for (int mark : marks) {  
            totalMarks += mark;  
        }  

        double averagePercentage = (double) totalMarks / numSubjects;  

        char grade;  
        if (averagePercentage >= 85) {  
            grade = 'A';  
        } else if (averagePercentage >= 75) {  
            grade = 'B';  
        } else if (averagePercentage >= 65) {  
            grade = 'C';  
        } else if (averagePercentage >= 50) {  
            grade = 'D';  
        } else {  
            grade = 'F';  
        }  

        System.out.println("\nResults:");  
        System.out.println("Total Marks: " + totalMarks);  
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");  
        System.out.println("Grade: " + grade);  
        input.close();  
    }  
}