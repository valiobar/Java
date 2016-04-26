import java.util.Scanner;

/**
 * Created by vb on 19.3.2016 г..
 */
public class TriangleArea {
    private static int[][] HandleInput() {
        Scanner scanner = new Scanner(System.in);
        int[][] points = new int[3][2];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter point coordinates separate by space:");
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < 2; j++) {
                points[i][j] = Integer.parseInt(input[j]);
            }
        }
        return points;
    }

    private static boolean ValidatePoints(int[][] points) {
        double firsSloop = (double) (points[1][1] - points[0][1]) / (double) (points[1][0] - points[0][0]);
        double secondSloop = ((double) (points[2][1] - points[0][1])) / (double) (points[2][0] - points[0][0]);
        return firsSloop != secondSloop;
    }

    private static void CalculateArea(boolean arePointValid, int[][] points) {
        if (arePointValid) {
            int area = Math.abs(points[0][0] * (points[1][1] - points[2][1]) + points[1][0] * (points[2][1] - points[0][1])
                    + points[2][0] * (points[0][1] - points[1][1]));
            System.out.print("The area is:" + area/2);
        } else System.out.print(0);

    }

    public static void main(String[] args) {
        int[][] points = HandleInput();
        boolean arePointsValid = ValidatePoints(points);
        CalculateArea(arePointsValid,points);


    }
}
