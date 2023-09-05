import java.util.Scanner;
public class Test{
    private int correctAnswers;
    private String[] Answer=new String[7];
    Scanner sc=new Scanner(System.in);

    public void details() {
        System.out.println("\nINSTRUCTIONS:");
        System.out.println("1. Please read the questions carefully.");
        System.out.println("2. Once you entered the answer then it cannot be undo.");
        System.out.println("3. Solve all the questions");
        System.out.println("4. Passing marks = above 4 ");
        System.out.println("5. Write the answer not an option in MCQ'S");
        System.out.println("6. Test includes tasting, english, maths and science questions.");
    }

    public void input(){
        System.out.println("\nPress 'enter' to show test.");
        sc.nextLine();

        System.out.println("Q1. 1 + 3 =");
        Answer[0]=sc.next();

        System.out.println("Q2. 6 / 2 =");
        Answer[1]=sc.next();

        System.out.println("Q3. 2 * 4 =");
        Answer[2]=sc.next();

        System.out.println("Q4. 'A' for");
        System.out.println("a. Banana       b. Orange       c. Apple");
        Answer[3]=sc.next();

        System.out.println("Q5. What sound of alphabet do you hear when you hear 'grapes'?");
        System.out.println("a. 'M'      b. 'G'      c. 'W' ");
        Answer[4]=sc.next();

        System.out.println("Q6. Whats the taste of sugar?");
        System.out.println("a. Sweet              b. Bitter ");
        Answer[5]=sc.next();

        System.out.println("Q7. Which of the following specie does not belong to animal kingdom?");
        System.out.println("a. Human           b. Panda            c. Tiger ");
        Answer[6]=sc.next();
    }

    public void show() {
        System.out.println("\nYour results are here, Press 'enter' to view results.");
        sc.nextLine();
        sc.nextLine();
        correctAnswers = 0;
        System.out.println("\nResults: ");
        if (Answer[0].equals("4")){
            System.out.println("1. CORRECT");
            correctAnswers++;
        }else{
            System.out.println("1. WRONG");
        }

        if(Answer[1].equals("3")){
            System.out.println("2. CORRECT");
            correctAnswers++;
        }else{
            System.out.println("2. WRONG");
        }

        if(Answer[2].equals("8")){
            System.out.println("3. CORRECT");
            correctAnswers++;
        }else{
            System.out.println("3. WRONG");
        }

        if(Answer[3].equalsIgnoreCase("Apple")){
            System.out.println("4. CORRECT");
            correctAnswers++;
        }else{
            System.out.println("4. WRONG");
        }

        if(Answer[4].equalsIgnoreCase("G")){
            System.out.println("5. CORRECT");
            correctAnswers++;
        }else{
            System.out.println("5. WRONG");
        }

        if(Answer[5].equalsIgnoreCase("sweet")){
            System.out.println("6. CORRECT ");
            correctAnswers++;
        }else{
            System.out.println("6. WRONG");
        }

        if(Answer[6].equalsIgnoreCase("human")){
            System.out.println("7. CORRECT ");
            correctAnswers++;
        }else{
            System.out.println("7. WRONG");
        }

        System.out.println("\nTOTAL MARKS: "+correctAnswers+"/7" );
        if(correctAnswers >= 5){
            System.out.println("CONGRATULATIONS! You are passed the test.");

        }else{
            System.out.println("\nYou are unable to pass the test.");
        }
    }

    public String testResult(){
        if(correctAnswers >=5){
            return "Pass";
        }else{
            return "Fail";
        }
    }
}