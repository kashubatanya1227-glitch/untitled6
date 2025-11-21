public class Task4 {
    public static void main(String[] args) {

        int k = 0;

        for(int x = 0; x <= 90; x++){
            double r = Math.sin(Math.toRadians(x));
            System.out.print(x + ":" + r + "  ");
            k++;

            if(k == 10){
                System.out.println();
                k = 0;
            }
        }
    }
}