public class Task3 {
    public static void main(String[] args) {

        int n = 5;
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = i + 1;
        }

        int[] b = new int[n + 1];

        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }

        b[b.length - 1] = 100;

        System.out.println("Новий масив:");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}