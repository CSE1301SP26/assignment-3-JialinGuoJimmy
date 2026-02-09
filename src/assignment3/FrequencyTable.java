import java.util.Scanner;

public class FrequencyTable {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many dice? ");
    int diceNum = scan.nextInt();
    int arraySize = diceNum*6 - diceNum*1 + 1;
    int diceNumNew = diceNum;

    int[] diceSum = new int[arraySize];
    for (int a = 0; a < arraySize; a++){
        diceSum[a] = diceNumNew;
        diceNumNew++;
    }

    int[] diceFreq = new int[arraySize];
    for (int i = 0; i < 10000; i++){
        int diceRolled = 0;
        for (int j = 0; j < diceNum; j++){
            int rnd = (int)(Math.random()*6) + 1;
            diceRolled = diceRolled + rnd;
        }
        diceFreq[diceRolled - diceNum] += 1;
    }

    System.out.println("Times each value was rolled with 4 dice over 10000 rolls");
    for (int b = 0; b < arraySize; b++){
        System.out.print(diceSum[b] + ": " + diceFreq[b] + " ");
    }
}
}
