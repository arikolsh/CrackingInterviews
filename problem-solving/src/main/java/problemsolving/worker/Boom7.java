package problemsolving.worker;

public class Boom7 {
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) {
                System.out.println(arr[i] + ": " + "BOOM!");
            }
            if((""+arr[i]).indexOf('7')>=0){
                System.out.println(arr[i] + ": " + "BOOM!");
            }
        }

    }
}
