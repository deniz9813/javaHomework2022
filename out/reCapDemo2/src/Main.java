public class Main {

    public static void main(String[] args) {
        double[] myLİst = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myLİst[3];
        for (double number : myLİst) {
            total= total + number;
            System.out.println(number);
            if(max<number) {
                max = number;
            }

        }
        System.out.println("total=" + total);
        System.out.println("en büyük =" + max);


    }
}