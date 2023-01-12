public class App {
    public static void main(String[] args) throws Exception {

        String[] array1 = new String[] { "morango", "pera", "abacaxi" };
        String[] array2 = new String[] { "melancia", "abacaxi", "maçã" };

        ArrayDefault test = new ArrayDefault(array1, array2);

        System.out.println(test.duplicateElements());

    }
}
