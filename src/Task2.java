public class Task2 {
    public static void main(String[] args) {

        int[] k = {60, 70, 50};
        int s = 0;

        for(int i = 0; i < k.length; i++){
            s = s + k[i];
        }

        int n = k.length;
        int potr = 180 * (n - 2);

        if(s == potr)
            System.out.println("Може існувати");
        else
            System.out.println("Не може");
    }
}
