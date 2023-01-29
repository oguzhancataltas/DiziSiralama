import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin Boyutu : ");
        int boyut = scanner.nextInt();

        int[] arr = new int[boyut];
        int[] duplicate = new int[boyut];

        System.out.println("Dizi Elemanlarını Giriniz : ");

        for (int i = 0; i < boyut; i++) {

            System.out.print((i + 1) + ". Eleman : ");
            int eleman = scanner.nextInt();
            arr[i] = eleman;

        }

        for (int j = 0; j < arr.length; j++) {

            for (int k = j + 1; k < arr.length; k++) {
                int temp = arr[j];

                if (arr[j] > arr[k]) {
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        //Arrays.sort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
