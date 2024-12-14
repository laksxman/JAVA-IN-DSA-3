public class Last_Occurance {

    public static int lastOccurance(int arr[], int key, int i){
        if(i== arr.length){
            return i;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] ==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,6,8,9,8,6,5,3,2};
        System.out.println(lastOccurance(arr, 05, 0));
    }
}
