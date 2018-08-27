public class Main {
    public static void main(String[] args) {

        System.out.println(decToBin(2018));
    }

    public static String decToBin(int number) {

        String result = "";

        do {
            int remainder = number % 2;
            result = remainder + result; // ha result + remainder lenne, akkor rendes sorrendben lenne, de nekunk visszafele sorrendben kell
            number /= 2;

        } while (number >= 1);

        return result;
    }

}
