import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập độ dài mảng :");
        int size = sc.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Nhập phần tử "+(i+1)+" :");
            list[i] = sc.nextInt();
        }
        System.out.println("Mảng ban đầu :");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
        insertionSort(list);
        System.out.println("mảng sau khi sắp xếp :");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }

    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i-1; k >= 0 && list[k] > currentElement ; k--) {
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }
}
