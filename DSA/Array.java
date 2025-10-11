import java.util.*;
public class Array {
    public static void main(String[] args) {
        int n;
        int a[];
        try (Scanner scn = new Scanner(System.in)) {
            n = scn.nextInt();
            a = new int[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = scn.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int row,col;
        int [][]mat;
        try(Scanner scn = new Scanner(System.in)){
            row = scn.nextInt();
            col = scn.nextInt();
            mat = new int[row][col];
            for(int i = 0 ; i < row ; i++){
                for(int j = 0 ; j < col ; j++){
                    mat[i][j] = scn.nextInt();
                }
            }
        }
        for(int i = 0 ; i < row ; i++){
                for(int j = 0 ; j < col ; j++){
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
    }
}