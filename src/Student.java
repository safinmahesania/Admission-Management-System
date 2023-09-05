import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        main();
    }

    public static void displayMainMenu() {
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    Menu\n\nNote : Make sure you fill the basic details carefully because once you proceed to admission test, you will not be able to change your details again. So please verify you details before entering the test.");
        System.out.println("\n1.Add");
        System.out.println("2.View");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("5.Admission Test");
        System.out.println("6.Exit");
    }

    public static void main() {
        NameArray studentName = new NameArray(100);
        AgeArray studentAge = new AgeArray(100);
        IDArray studentId = new IDArray(100);
        Queue queue = new Queue(100);
        Results result;
        Test test = new Test();

        boolean ok;
        int choice = 0, num = 0, age = 0, id = 1, index = 0;
        char option;
        String updateChoice, name, deleteChoice;
        Scanner sc;

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tABC SCHOOLS ADMISSIONS");
        do {
            displayMainMenu();
            ok = false;
            while (!ok) {
                try {
                    sc = new Scanner(System.in);
                    choice = sc.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("ERROR! please choose between the slots(1-6)");
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("\nHow many candidates you want to register?");
                    ok = false;
                    while (!ok) {
                        try {
                            sc = new Scanner(System.in);
                            num = sc.nextInt();
                            ok = true;
                        } catch (InputMismatchException e) {
                            System.out.println("ERROR! Please enter numbers in numeric");
                        }
                    }
                    num = num + index;
                    if (num > 0) {
                        for (int i = index; i < num; i++, index++, id++) {
                            System.out.println("\nPlease Enter the following basic details");
                            System.out.println("1. Name: ");
                            sc = new Scanner(System.in);
                            name = sc.nextLine();
                            System.out.println("\n2. Age: ");
                            ok = false;
                            while (!ok) {
                                try {
                                    sc = new Scanner(System.in);
                                    age = sc.nextInt();
                                    ok = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("ERROR! Age must be in numeric value");
                                }
                            }
                            studentId.insert(id, index);
                            studentName.insert(name, index);
                            studentAge.insert(age, index);
                        }
                    }
                    break;

                case 2:
                    if (studentName.returnName(0) == null) {
                        System.out.println("There are no registrations yet!");
                    } else {
                        for (int i = 0; i < index; i++) {
                            System.out.println("\n");
                            studentId.print(i);
                            studentName.print(i);
                            studentAge.print(i);
                        }
                    }
                    break;

                case 3:
                    if (studentName.returnName(0) == null) {
                        System.out.println("There are no registrations yet!");
                    } else {
                        System.out.println("\nWhat do you want to update?(Name/Age)");
                        sc = new Scanner(System.in);
                        updateChoice = sc.nextLine();

                        if (updateChoice.equalsIgnoreCase("name")) {
                            System.out.println("\nEnter ID of a candidate");
                            choice = sc.nextInt();
                            System.out.println("\nPlease Enter the new name: ");
                            sc = new Scanner(System.in);
                            name = sc.nextLine();
                            studentName.update(name, choice - 1);
                        } else if (updateChoice.equalsIgnoreCase("age")) {
                            System.out.println("\nEnter ID of a candidate");
                            choice = sc.nextInt();
                            System.out.println("\nPlease Enter the new age: ");
                            age = sc.nextInt();
                            studentAge.update(age, choice - 1);
                        }
                        System.out.println("\n**Following data is Updated**");
                    }
                    break;

                case 4:
                    if (studentName.returnName(0) == null) {
                        System.out.println("There are no registrations yet!");
                    } else {
                        System.out.println("\nWhich candidate you want to remove? (Enter ID)");
                        ok = false;
                        while (!ok) {
                            try {
                                sc = new Scanner(System.in);
                                choice = sc.nextInt();
                                ok = true;
                            } catch (InputMismatchException e) {
                                System.out.println("ERROR! Please enter a correct ID number.");
                            }
                        }
                        System.out.println("\nDo you want to remove? (Yes/No)");
                        sc = new Scanner(System.in);
                        deleteChoice = sc.nextLine();
                        boolean flag = false;
                        while (!flag) {
                            if (deleteChoice.equalsIgnoreCase("yes")) {
                                studentName.removeAt(choice - 1);
                                studentAge.removeAt(choice - 1);
                                index--;
                                System.out.println("\n**Following data is Removed**");
                                flag = true;
                            } else if (deleteChoice.equalsIgnoreCase("no")) {
                                flag = true;
                            } else {
                                System.out.println("Please enter either 'yes' or 'no'");
                                sc = new Scanner(System.in);
                                deleteChoice = sc.nextLine();
                                flag = false;
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n1. Give test\n2. Show Result\n3. Back");
                    System.out.println("\nPlease enter your choice");
                    ok = false;
                    while (!ok) {
                        try {
                            sc = new Scanner(System.in);
                            choice = sc.nextInt();
                            ok = true;
                        } catch (InputMismatchException e) {
                            System.out.println("ERROR! Please enter a correct choice.");
                        }
                    }
                    switch (choice) {
                        case 1:
                            if (studentName.returnName(0) == null) {
                                System.out.println("\nThere are no registrations, Please register candidate to give test.");
                            } else {
                                for (int i = 0; i < index; i++) {
                                    System.out.println("\n\n");
                                    studentId.print(i);
                                    studentName.print(i);
                                    studentAge.print(i);

                                    System.out.println("\nNow admission test will appear in-front of you");
                                    test.details();
                                    test.input();
                                    test.show();

                                    if (test.testResult().equals("Pass")) {
                                        System.out.println("\nNow you have to give an interview\n");
                                        Interview interview = new Interview();
                                        interview.details();
                                        interview.show();
                                        String interviewResult = interview.interviewResult();
                                        result = new Results(studentId.returnID(i), studentName.returnName(i), studentAge.returnAge(i), interviewResult);
                                        queue.enQueue(result);
                                        Confirmation confirmation = new Confirmation();
                                        confirmation.details();
                                        confirmation.show();
                                    } else {
                                        System.out.println("Since you are failed, you are unable to qualify for the interview\n");
                                    }
                                }
                                for (int i = index; i > 0; i--) {
                                    studentId.removeAt(i - 1);
                                    studentName.removeAt(i - 1);
                                    studentAge.removeAt(i - 1);
                                    index--;
                                }
                            }
                            break;

                        case 2:
                            if (queue.size() == 0) {
                                System.out.println("\n     ***** EMPTY *****     \nPlease give test to view the results");
                            }else{
                                System.out.println("\nPress 'Enter' to view result list");
                                sc = new Scanner(System.in);
                                sc.nextLine();
                                queue.printQueue();
                            }
                            break;

                        default:
                            main();
                    }
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Please enter a valid choice.");
                    main();
            }
            System.out.println("\nDo you want to proceed to menu?(Y/N)");
            sc = new Scanner(System.in);
            option = sc.next().charAt(0);
        } while ((option == 'Y') || (option == 'y'));
    }
}