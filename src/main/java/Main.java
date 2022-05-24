
public class Main {
    public static void main(String[] args) {

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

            e.printStackTrace();
        } finally {
            System.out.println("Tarea terminada");
        }

    }

    public static int convertToInt(String number) {

    }

}
