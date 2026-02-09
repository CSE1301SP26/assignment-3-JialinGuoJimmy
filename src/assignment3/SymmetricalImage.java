import java.util.Scanner;

public class SymmetricalImage {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many rows? ");
    int n = scan.nextInt();
    System.out.print("How many columns? ");
    int m = scan.nextInt();
    String[][] Image = new String[n][m]; 

    for (int a = 0; a < n; a++){
        for (int b = 0; b < m; b++){
            Image[a][b] = " ";
        }
    }

    for (int i = 0; i < (int)((n * m)/4); i++){
        int rnd1 = (int)(Math.random() * n);
        int rnd2 = (int)(Math.random() * (int)(m/2 + 0.5));
        Image[rnd1][rnd2] = "*";
        Image[rnd1][m-1-rnd2] = "*";
    }

    for (int a = 0; a < n; a++){
        for (int b = 0; b < m; b++){
            System.out.print(Image[a][b]);
        }
        //Switch a row after each row is done
        System.out.println();
    }
}
}
