
package EDUTRAION1;
import java.util.Scanner;

public class Student_management_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[100];
        int[] rollNumbers = new int[100];
        String[] grades = new String[100];
        int studentCount = 0;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine(); // consume newline
                System.out.print("Enter student name: ");
                names[studentCount] = scanner.nextLine();

                System.out.print("Enter roll number: ");
                rollNumbers[studentCount] = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Enter grade: ");
                grades[studentCount] = scanner.nextLine();

                studentCount++;
                System.out.println("Student added.");
            }

            else if (choice == 2) {
                System.out.print("Enter roll number of student to remove: ");
                int roll = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < studentCount; i++) {
                    if (rollNumbers[i] == roll) {
                        for (int j = i; j < studentCount - 1; j++) {
                            names[j] = names[j + 1];
                            rollNumbers[j] = rollNumbers[j + 1];
                            grades[j] = grades[j + 1];
                        }
                        studentCount--;
                        found = true;
                        System.out.println("Student removed.");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found.");
                }
            }

            else if (choice == 3) {
                System.out.print("Enter roll number of student to search: ");
                int roll = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < studentCount; i++) {
                    if (rollNumbers[i] == roll) {
                        System.out.println("Student found:");
                        System.out.println("Name: " + names[i] + ", Roll Number: " + rollNumbers[i] + ", Grade: " + grades[i]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found.");
                }
            }

            else if (choice == 4) {
                if (studentCount == 0) {
                    System.out.println("No students to display.");
                } else {
                    System.out.println("All Students:");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println("Name: " + names[i] + ", Roll Number: " + rollNumbers[i] + ", Grade: " + grades[i]);
                    }
                }
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }
        scanner.close();
    }
}
