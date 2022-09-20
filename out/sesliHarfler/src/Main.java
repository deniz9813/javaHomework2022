public class Main {

    public static void main(String[] args) {
        char harf = 'E';

        switch(harf) {
            case'A':
            case'I':
            case'O':
            case'U':
                System.out.print("kalın sesli harf");
                break;
            default:
                System.out.print("ince sesli harf");
        }

    }
}
