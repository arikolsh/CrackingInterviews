package problemsolving.hackerrank;

        import java.util.*;

public class RoundGrades {
    static int[] solve(int[] grades){
        // Complete this function
        int[] finalGrades = new int[grades.length];
        for(int i=0;i<grades.length;i++){
            if(grades[i]>35){
                int m = ((int)Math.ceil(grades[i]/5.0))*5;
                //System.out.println("getting multiple in index: "+m);
                finalGrades[i] = (m - grades[i] < 3) ? m : grades[i];
            }else{
                finalGrades[i] = grades[i];
            }
        }
        return finalGrades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
