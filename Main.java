import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    System.out.println(totalScore);
    System.out.println();
    System.out.println(totalScore.size()+ " students took the SAT");

    // Find average score
    int total = 0;
    for (int score : totalScore){
      total += score;
    }
    double average = (double)total / totalScore.size();
    System.out.println(average);

    // Find the lowest score
    int min = Integer.MAX_VALUE;
    for (int score : totalScore){
      if (score < min){
        min = score;
      }
    }
    System.out.println("The lowest score is "+ min);

    // Find the highest score
    int max = 0;
    for (int score : totalScore){
      if (score > max){
        max = score;
      }
    }
    System.out.println("The highest score is "+ max);
  }

}
