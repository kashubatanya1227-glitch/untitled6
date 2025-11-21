public class Task1 {
    public static void main(String[] args) {

        int[] a = {5, 8, 3, 10, 7, 12};
        int par = 0;
        int nepar = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0) par++;
            else nepar++;
        }

        System.out.println("Парних: " + par);
        System.out.println("Непарних: " + nepar);
    }
}