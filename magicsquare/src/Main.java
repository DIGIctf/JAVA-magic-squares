import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        File diskIn = new File("src/Lab8Data.txt");
        Scanner input = new Scanner(diskIn);





        int[][] matrix = new int [4][4];
        int i = 0;


        while (input.hasNextLine()) {
            int[] x = new int[5];
            int total = 0;

            for(int row = 0; row < 4; row++){

                for(int column = 0; column < 4; column++){

                    matrix[row][column] = input.nextInt();
                }
                //System.out.println(Arrays.toString(matrix[row]));



                for(int rowM = 0; rowM < matrix.length; rowM++){
                    for(int columnM = 0; columnM < matrix[rowM].length; columnM++){
                        total += matrix[rowM][columnM];
                    }
                    // System.out.println(total);
                    //newArr[0] = total;
                    //list.add(total);

                }
                x[row] = total;
//System.out.println("TOTAL: " +total);
//System.out.println("Sum: " +x[row]);

            } //part1










            int diagnol = 0;
            boolean check = false;

//check diagnol
            diagnol = matrix[0][0] + matrix[1][1] + matrix[2][2] + matrix[3][3];
//System.out.println("checking: " +matrix[2][2]);
//System.out.println(Arrays.toString(x));
//checking rows, columns, diagnol for mismatches
            if(x[0] != x[1] || x[2] != x[3]){
                check = false;
                System.out.println("OUTPUTS: " + x[0] + " " + x[1] + " " + x[2] + " " + x[3] + " " + diagnol);
            }else if(x[0] != diagnol || x[1] != diagnol || x[2] != diagnol || x[3] != diagnol){
                System.out.println("OUTPUTS: " + x[0] + " " + x[1] + " " + x[2] + " " + x[3] + " " + diagnol);
                check = false;
            }else check = true;

            for(int y = 0; y < 4; y++){
                for(int z = 0; z < 4; z++){
                    System.out.print(matrix[y][z]);
                    //output can't have an extra space at the end of the last number in row
                    if(z != 3) System.out.print(" "); else System.out.println();
                }
            }





//magic square output
            if(check == false) System.out.println("NOT a magic square");
            else System.out.println("IS a magic square");

            System.out.println();

        }
    }
}