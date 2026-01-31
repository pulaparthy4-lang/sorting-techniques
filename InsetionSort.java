public class InsetionSort {
public static void insetionSort(int[] arr){
for(int i = 1; i < arr.length; i ++){
int key = arr{i};
int j = i - 1;
 while(j >= 0 && arr[j] > key){
 arr[j + i] = arr[j];
 j--;
 }
 arr[j = i] = key;
 }
 }
 public static void printArray(int[]arr){
 for(int num : arr)
 System.out.print(num + " ");
 System.out.println();
 }
 public static void main(String[] args){
 int[] arr + {5 ,3, 8, 4, 2);
 System.out.println("The elements before Sorting");
 printArray(arr);
 insetionSort(arr);
 System.out.println("The elements after Sorting");
 printArray(arr);
 }
 }