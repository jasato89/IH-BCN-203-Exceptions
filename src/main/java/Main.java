import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {

         /*
        //Checked Exceptions - Unchecked Exceptions

        //Checked Exception

        int number;
        String name = "Jaume";

        //Cuando antes de compilar el código, Java sabe que ese código no puede funcionar
        // number = name;

        //Unchecked exceptions

        /*

        int[] numbers = {2, 5, 7, 8, 10};

        for(int i = 0; i < 14; i++) {

            System.out.println(numbers[i]);

        }

        System.out.println("Hola qué tal");

         */

        int[] numbers = {2, 5, 7, 8, 10};

        // printArray(numbers);

        int[] numbers2 = null;

        //printArray(numbers2);

        printArrayManagingExceptions(numbers);

        System.out.println("==========");

        printArrayManagingExceptions(numbers2);

        System.out.println(convertToInt("16"));
        System.out.println(convertToInt("Hola"));

       int i;

        try {
            i = convertToIntWithThrows("Hola");

        } catch (Exception e) {
            System.out.println("Error");
            i = 12;
        }

        try {
            FileWriter writer = new FileWriter("hola.json");
        } catch (IOException e) {
            e.printStackTrace();
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

    public static int convertToIntWithThrows(String number) throws Exception {
        return Integer.parseInt(number);
    }

}
