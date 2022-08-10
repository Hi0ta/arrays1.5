public class Main {
    public static void main(String[] args) {

        // Задача 1.1
        //    int[] arr1 = new int[3] ;
        //    arr1[0] = 1;
        //    arr1[1] = 2;
        //    arr1[2] = 3;
        //    int arrSize = arr.length;
        //    System.out.println(arrSize);

        // Задача 1.2
        //   double[] arr2 = {1.57, 7.654, 9.986};

        // Задача 1.3
        //    char [] arr3 = {66, 81, 82};

        // Задача 2.1
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("");

        // Задача 2.2
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println("");

        // Задача 2.3
        char[] arr3 = {66, 81, 82};
        for (int i = 0; i < 3; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println("");

        // Задача 3.1
        int[] arrays1 = new int[3];
        arrays1[0] = 1;
        arrays1[1] = 2;
        arrays1[2] = 3;

        for (int i = 2; i >= 0; i--) {
            System.out.print(arrays1[i] + ", ");
        }
        System.out.println("");

        // Задача 1.2
        double[] arrays2 = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrays2[i] + ", ");
        }
        System.out.println("");
        // Задача 1.3
        char[] arrays3 = {66, 81, 82};
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrays3[i] + ", ");
        }
        System.out.println("");

        // Задача 4
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
       for (int i = 0; i < 3; )
            if (i % 2 == 0) {
            arr[i]++;
            i++;
            } else {
            i++;}
       for (int i = 0; i < 3; i++)
           System.out.print(arr[i] + ", ");

    }
}