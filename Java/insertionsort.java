public class insertionsort
{
    public static void main(String args[])
    {
        int arr[] = {5, 3, 8, 2};
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }
        for(int x : arr)
            System.out.print(x + " ");
    }
}
