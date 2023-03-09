package Solution;

public class Greed{
  public static int greedy(int[] dice){
    int score = 0;
    int[] frequency = new int[7];

    for(int face : dice)
      ++frequency[face];

    for(int counter = 1; counter < frequency.length; counter++){
      if(frequency[counter] >= 3){
        switch (counter){
          case 1 -> score += 1000;
          case 6 -> score += 600;
          case 5 -> score += 500;
          case 4 -> score += 400;
          case 3 -> score += 300;
          case 2 -> score += 200;
        }
        frequency[counter] -= 3;
      }
    }

    score += (frequency[1]*100 + frequency[5]*50);

    return score;
  }
}