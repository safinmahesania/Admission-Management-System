import java.util.Scanner;

public class Interview{
    Scanner sc= new Scanner(System.in);

    public void details(){
        System.out.println("INSTRUCTIONS : ");
        System.out.println("1. Your interview will be conducting in few minutes.");
        System.out.println("2. The passing criteria will depend on judges to decide.");
        sc.nextLine();
    }

    public void show(){
        System.out.println("\n       **********   INTERVIEW GOING ON   **********       ");
        sc.nextLine();
        System.out.println("       **********   INTERVIEW COMPLETED   **********       \n");
        System.out.println("Interview result list can be viewed once all the interviews and tests are finished.\n");
    }

    public String interviewResult(){
        int random = (int) (Math.random()*3);
        if(random == 0 || random == 1){
            return "Passed";
        }
        else if(random == 2) {
            return "Failed";
        }
        return null;
    }
}