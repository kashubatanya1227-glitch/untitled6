public class Task5 {
    public static void main(String[] args) {

        int[] a = {9, 7, 5, 3, 1};

        boolean up = true;
        boolean down = true;

        for(int i = 1; i < a.length; i++){
            if(a[i] > a[i-1]) down = false;
            if(a[i] < a[i-1]) up = false;
        }

        if(up) System.out.println("Зростає");
        else if(down) System.out.println("Спадає");
        else System.out.println("Ні так, ні так");
    }
}