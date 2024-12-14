public class First_Occurance {

    public static int FirstOccurance(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,4,6,7,4,7,4,5,3,5};
        System.out.println(FirstOccurance(arr, 5, 0));
    }
}
