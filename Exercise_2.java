import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Fill the amount of elements: \n");
        int num = in.nextInt();
        System.out.print("Fill the elements: \n");
        int elem;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            elem = in.nextInt();
            arr[i] = elem;
        }
        int i = 0, min = 10000, max = 0, sum = 0;
        while (i < num){
            sum += arr[i];
            if (arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
            i++;
        }
        System.out.print("The sum of elements: "+sum+"\n"+"The maximum: "+max+"\n"+"The mininmum: "+min);
    }
}
