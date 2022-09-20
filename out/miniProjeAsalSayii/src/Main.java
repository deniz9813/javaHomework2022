public class Main {

    public static void main(String[] args) {

        int number = 25;
        int remainder = number % 2;
        //System.out.print(remainder);
        boolean İsPrime = true;


        if(number==1) {
            System.out.print("sayı asal değildir");
            return;
        }

        if(number<1) {
            System.out.print("geçersiz sayı");
        }

        for(int i=2; i<number;i++) {
            if(number % i==0);
            İsPrime = false;
        }

        if(İsPrime) {
            System.out.print("sayı asaldır");
        } else {
            System.out.print("sayı asal değildir");
        }

    }
}