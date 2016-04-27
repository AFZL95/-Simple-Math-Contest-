import java.util.Random;
import java.util.Scanner;

/**
 * Created by FZL on 3/19/2016.
 */
public class Math_Contest {


    //the main methode
    public static void main(String args[]){
    //Starting the Engine by calling introduction class
    introduction FirstWelcome = new introduction();
        FirstWelcome.intro();
    }


   //************** some other classes **************//

    public static class introduction{

        //make the required Objects
        Scanner SCAN = new Scanner(System.in);
        operand Operands = new operand();
        operator Operator = new operator();
        Result finalResults = new Result();


        public void intro(){

            Scanner SC = new Scanner(System.in);

            //Welcome to the Program and getting the type
            System.out.println("Welcome to the Math Contest Program! \n please select your level: \n (one for Single digits and two for Two-digit numbers:");
            int LEVEL = SC.nextInt();

            System.out.println("so,please select your type of contest:\n one : summation \n two : multiplication \n three : subtraction \n four : division \n five : finish the exam!");
            int typeOfContest = SCAN.nextInt();

            //generating the suitable numbers
            Operands.firstOperand(LEVEL);
            Operands.secoundOperand(LEVEL);

            switch (typeOfContest){
                case 1 :
                    Operator.summation(Operands.firstNumber,Operands.secoundNumber);
                    break;
                case 2 :
                    Operator.multiplication(Operands.firstNumber,Operands.secoundNumber);
                    break;
                case 3 :
                    Operator.Subtraction(Operands.firstNumber,Operands.secoundNumber);
                    break;
                case 4 :
                    Operator.Division(Operands.firstNumber,Operands.secoundNumber);
                    break;
                case 5 :
                    finalResults.showResults();

            }
        }
    }

    public static class operand{
        //declaring the variables
        int firstNumber, secoundNumber;
        Random randomNumber = new Random();

        public int firstOperand( int level){

         switch (level){
             case (1) :
                 //Generating two Random number

                 firstNumber = randomNumber.nextInt(9)+1;
                 break;
             case (2):
                 //Generating two Random number
                 firstNumber = randomNumber.nextInt(99)+1;
                 break;
         }
            return firstNumber;
        }

        public int secoundOperand( int level){

            switch (level){
                case (1) :
                    //Generating two Random number

                    secoundNumber = randomNumber.nextInt(9)+1;
                    break;
                case (2):
                    //Generating two Random number
                    secoundNumber = randomNumber.nextInt(99)+1;
                    break;
            }
            return secoundNumber;

        }
    }

    public static class operator {
        int answer;
        //number of right answers
        int NORA=0;
        //number of false answers
        int NOFA=0;

            public void summation(int firstNumber,int secoundNumber){

            //Show the Welcome message and Ask the Question
            System.out.println("Welcome to the summation Contest! ");
            System.out.print("what's the " + firstNumber + "+" + secoundNumber + "?");

            //calculating the right answer in the computer!
            int trueAnswer = firstNumber + secoundNumber;

            //waiting for the child to input his/her answer
            Scanner SCAN = new Scanner(System.in);
            answer = SCAN.nextInt();

            //validating the answer is right or not!
            randomMessages RM = new randomMessages();


            if (answer == trueAnswer) {

                //showing the true answer
                System.out.println("the answer is: "+ trueAnswer);
                NORA++;
                //run the method that generates random true messages
                System.out.println(RM.trueMessages());
                introduction Introduction = new introduction();
                Introduction.intro();

            } else {

                //run the method that generates random false messages
                System.out.println(RM.falseMessage());
                NOFA++;

                //rebuilding the operator class for recursion
                operator Operator2 = new operator();
                Operator2.summation(firstNumber,secoundNumber);

            }
        }

        public void multiplication(int firstNumber,int secoundNumber) {

            //Show the Welcome message and Ask the Question
            System.out.println("Welcome to the Multiply Contest! ");
            System.out.print("what's the " + firstNumber + "*" + secoundNumber + "?");

            //calculating the right answer in the computer!
            int trueAnswer = firstNumber * secoundNumber;

            //waiting for the child to input his/her answer
            Scanner SCAN = new Scanner(System.in);
            answer = SCAN.nextInt();

            //validating the answer is right or not!
            randomMessages RM = new randomMessages();

            if (answer == trueAnswer) {

                //showing the true answer
                System.out.println("the answer is: "+ trueAnswer);
                NORA++;
                //run the method that generates random true messages
                System.out.println(RM.trueMessages());
                introduction Introduction = new introduction();
                Introduction.intro();

            } else {

                //run the method that generates random false messages
                System.out.println(RM.falseMessage());
                NOFA++;

                //rebuilding the operator class for recursion
                operator Operator2 = new operator();
                Operator2.multiplication(firstNumber,secoundNumber);

            }

        }

        public void Subtraction(int firstNumber,int secoundNumber) {

            //Show the Welcome message and Ask the Question
            System.out.println("Welcome to the Subtraction Contest! ");
            System.out.print("what's the " + firstNumber + "-" + secoundNumber + "?");

            //calculating the right answer in the computer!
            int trueAnswer = Math.abs(firstNumber - secoundNumber);

            //waiting for the child to input his/her answer
            Scanner SCAN = new Scanner(System.in);
            answer = SCAN.nextInt();

            //validating the answer is right or not!
            randomMessages RM = new randomMessages();

            if (answer == trueAnswer) {

                //showing the true answer
                System.out.println("the answer is: "+ trueAnswer);
                NORA++;
                //run the method that generates random true messages
                System.out.println(RM.trueMessages());
                introduction Introduction = new introduction();
                Introduction.intro();

            } else {

                //run the method that generates random false messages
                System.out.println(RM.falseMessage());
                NOFA++;

                //rebuilding the operator class for recursion
                operator Operator2 = new operator();
                Operator2.Subtraction(firstNumber,secoundNumber);

            }
        }

        public void Division(int firstNumber,int secoundNumber) {

            //Show the Welcome message and Ask the Question
            System.out.println("Welcome to the Division Contest! ");
            System.out.print("what's the " + firstNumber + "/" + secoundNumber + "?");

            //calculating the right answer in the computer!
            int trueAnswer = firstNumber / secoundNumber;

            //waiting for the child to input his/her answer
            Scanner SCAN = new Scanner(System.in);
            answer = SCAN.nextInt();

            //validating the answer is right or not!
            randomMessages RM = new randomMessages();

            if (answer == trueAnswer) {

                //showing the true answer
                System.out.println("the answer is: "+ trueAnswer);
                NORA++;
                //run the method that generates random true messages
                System.out.println(RM.trueMessages());
                introduction Introduction = new introduction();
                Introduction.intro();

            } else {

                //run the method that generates random false messages
                System.out.println(RM.falseMessage());
                NOFA++;

                //rebuilding the operator class for recursion
                operator Operator2 = new operator();
                Operator2.Division(firstNumber,secoundNumber);

            }
        }

    }

    public static class randomMessages {

        String output;
        Random randomMessageNumber = new Random();
        int RMN = 2 + randomMessageNumber.nextInt(2);

        public String trueMessages() {
            String one = "Good Job!";
            String two = "It's Correct!";
            String three = "Yess,that's the right answer!";
            switch (RMN) {
                case 1:
                    output = one;
                    break;
                case 2:
                    output = two;
                    break;
                case 3:
                    output = three;
                    break;
            }
        return output;
        }

        public String falseMessage(){
            String one = "No,It's not right!";
            String two = " consider your answer,Try again!";
            String three = "Let's think more!";
            switch (RMN) {
                case 1:
                    output = one;
                    break;
                case 2:
                    output = two;
                    break;
                case 3:
                    output = three;
                    break;
            }
            return output;
        }

    }

    public  static class Result{
        operator Operator3 = new operator();
        int Total = Operator3.NOFA + Operator3.NOFA;
        public void showResults(){
            System.out.print(Operator3.NORA);
            System.out.printf("the number of correct answers is:\n %d from total %d questions  " , Operator3.NORA,Total);
            if( (double)Operator3.NORA/Total<0.75) {
                System.out.print("Your Results is Under 75 percent! Please contact your teacher");
            }


        }
    }
}
