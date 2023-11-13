import java.util.*;

public class StudentGradeCalculator {
     static Scanner sa = new Scanner(System.in);
    public static void StudentCalC(){
        // here, we take input for total number of subjects a user have
        System.out.println("Enter the total number of subjects: ");
        int totalsub = sa.nextInt();

        // make array to store the numbers obtained out of 100 in each subject
        double submarks[] = new double[totalsub];
        for(int i = 0 ; i < totalsub; i++){
            System.out.println("Enter marks of "+ (i+1)+" subject out of 100:");
            submarks[i] = sa.nextDouble();           
        }
        // find sum of all the nunmbers in different subjects
        double sum = 0;
        for(int j = 0 ; j < submarks.length; j++){
            sum += submarks[j];
        }
        System.out.println("Total marks obtained: "+ sum);
        
        // find the average percentage
        double percentage = (sum / (totalsub * 100)) * 100;
        if(percentage > 100){
            System.out.println("There is a some error occur");
        }
        else if(percentage >= 91 && percentage <= 100){
            System.out.println("Your Percentage is: "+percentage);
            System.out.println("Your Grade: A1");
        }
        else if(percentage >=81 && percentage <=90){
            System.out.println("Your Percentage is: "+percentage);
            System.out.println("Your Grade: A2");
        }
        else if(percentage >= 71 && percentage <= 80){
            System.out.println("Your Percentage is: "+percentage);
            System.out.println("Your Grade: B1");
        }
        else if(percentage >= 61 && percentage <= 70){
            System.out.println("Your Percentage is: "+percentage);
            System.out.println("Your Grade: B2");
        }
        else if(percentage >= 51 && percentage <= 60){
            System.out.println("Your Percentage is: "+percentage);
            System.out.println("Your Grade: C1");
        }
        else if(percentage >= 41 && percentage <= 50){
            System.out.println("Your Percentage is: "+percentage);
            System.out.println("Your Grade: C2");
        }
        else if(percentage >= 33 && percentage <= 40){
            System.out.println("Your Percentage is: "+percentage);
            System.out.println("Your Grade: D");
        }
        else if(percentage >= 21 && percentage <= 32){
            System.out.println("Your Percentage is: "+percentage);
            System.out.println("Your Grade: E1");
        }
        else if(percentage >= 0 && percentage <= 20){
            System.out.println("Your Percentage is: "+percentage);
            System.out.println("Your Grade: E2");
        }
        else {
            System.out.println("There is a some error occur while calculating the percentage");
        }
}
    public static void main(String args[]){
     StudentCalC();
     System.out.println("Press 1 to Calculate the percentage again or Press 0 to exist: ");
     int user = sa.nextInt();
     if(user == 1){
        StudentCalC();
    }
    sa.close();  
    }
}
