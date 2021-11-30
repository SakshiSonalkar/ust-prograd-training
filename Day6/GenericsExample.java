import java.util.Scanner;
class ReverseArray<T> {
    T arr[];
    T n;
    public void printArray(T arr[]){
        for(int i =arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

}

public class GenericsExample {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Integer array:");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the size of String array:");
        int size1 = Integer.parseInt(scanner.nextLine());
        Integer[] intArr = new Integer[size];
        String[] strArr = new String[size1];
        System.out.println("Enter elements of Integer array:");
        for(int i=0;i<size;i++){
            intArr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter elements of String array:");
        for(int j=0;j<size1;j++){
            strArr[j]=scanner.nextLine();
        }
        ReverseArray r1 = new ReverseArray();
        r1.printArray(intArr);
        r1.printArray(strArr);
    } 

}
