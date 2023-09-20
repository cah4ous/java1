public class Exercise_1 {
    public static void main(String[] args)
    {
        int[] arr = {7, 32, 5, 100, 382, -10, 3, 56, 48};
        float sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.print("The sum of elements: "+sum+"\n");
        System.out.print("The arithmetic mean: "+sum/arr.length);
    }
}
