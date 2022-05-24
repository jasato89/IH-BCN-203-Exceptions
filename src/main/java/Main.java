import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*

        //Checked Exceptions - Unchecked Exceptions

        //Checked Exception

        int number;
        String name = "Jaume";

        //Cuando antes de compilar el código, Java sabe que ese código no puede funcionar
        // number = name;

        //Unchecked exceptions


        int[] numbers = {2, 5, 7, 8, 10};

        //Crash


        for(int i = 0; i < 14; i++) {

            System.out.println(numbers[i]);

        }


        System.out.println("Hola qué tal");


        //int[] numbers2 = {2, 5, 7, 8, 10};

        // printArray(numbers);

        int[] numbers2 = null;

        //printArray(numbers2);

        //printArrayManagingExceptions(numbers);

        System.out.println("==========");

        printArrayManagingExceptions(numbers2);

        System.out.println(convertToInt("16"));
        System.out.println(convertToInt("Hola"));

        int i;

        i = convertToIntWithThrows("Hola");


        try {
            System.out.println(concat(" ", " "));
        } catch (IllegalArgumentException e) {
            System.err.println("Alguna de las cadenas está vacía o son nulas");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Alguna de las cadenas está vacía o son nulas");
            e.printStackTrace();
        }

        System.out.println(Integer.MAX_VALUE);

        int i2;
        int x = 2000000000;
        int y = 2000000000;

        try {
            i2 = multiply(x, y);
            System.out.println(i2);
        } catch (Exception e) {
            System.err.println("Números demasiado grandes para int, se muestra la multiplicación en Long");
            System.out.println((long) x * (long) y);
        } finally {
            i2 = 0;
        }

        System.out.println(i2);
 */

        Account account = new Account();
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        account.setName(input.nextLine());
        System.out.println("Introduce tu balance");

        double b = input.nextDouble();

        while (b < 0) {

            try {
                account.setBalance(b);
            } catch (Exception e) {
                System.out.println("Introduce un número válido");
                e.printStackTrace();
            } finally {
                b = input.nextDouble();
            }
        }

        Account account2 = account.clone();

        System.out.println(account.hashCode() == account2.hashCode());


    }

    public static int multiply(int x, int y) throws Exception {
        int result = x * y;
        if (result / x != y) {
            throw new IllegalArgumentException();
        } else {
            return result;
        }


    }

    public static void printArray(int[] numArray) {
        if (numArray == null) {
            System.out.println("numArray no puede estar vacío");
        } else {

            for (int i = 0; i < numArray.length; i++) {
                System.out.println(numArray[i]);
            }
        }

    }

    public static void printArrayManagingExceptions(int[] numArray) {

        try {
            for (int i = 0; i < numArray.length; i++) {
                System.out.println(numArray[i]);
            }

        } catch (NullPointerException e) {

        } finally {
            System.out.println("Tarea terminada");
        }

    }

    public static int convertToInt(String number) {
        int result = 0;
        try {
            result = Integer.parseInt(number);
        } catch (NumberFormatException numberFormatException) {
            System.err.println("Formato del string de entrada no válido");
        } catch (NullPointerException e) {
            System.out.println("Objeto no existe");
        }

        return result;
    }

    public static int convertToIntWithThrows(String number) throws NullPointerException {
        return Integer.parseInt(number);
    }

    public static String concat(String str1, String str2) throws IllegalArgumentException, Exception {

        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty() || str1.equals(" ") || str2.equals(" ")) {
            throw new IllegalArgumentException();
        } else {
            return str1.concat(str2);
        }

    }
}
