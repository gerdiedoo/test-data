public class Sorts {

    public static void swap(int[] arr,int a,int b){
        // Swap two elements in an array
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int partition(int[] arr,int l, int r){
        // used in quick sort
        int pivot = arr[r];
        int i = l - 1;
        for(int j=l;j<r;j++){
            if(arr[j] < pivot){
                i+=1;
                // I found that using swap() here causes a stack overflow error. (bad recursion)
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Move pivot in between i and j, this is why we use i+1.
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;

        // return new index of the pivot, this position will not change after sorting the array
        return i + 1;   
    }

    public static void quickSort(int[] arr){
        // allows us to call method in main without providing L and R
        qs(arr, 0, arr.length - 1);
    }

    public static void qs(int[] arr, int l, int r){
        if (l >= r){ 
            // already sorted so we do nothing
            return;
        }
        int p = partition(arr, l, r);
        qs(arr, l, p - 1);
        qs(arr, p + 1, r);
    }

    public static void selectionSort(int[] arr){
        int indexMin=0;
        for(int i=0;i<arr.length;i++){
            //Find index of smallest entry in arr[i...n-1]
            indexMin = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j] < arr[indexMin]){
                    indexMin = j;
                }
            }
            swap(arr,i,indexMin);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int j=0;j<arr.length;j++){ //Repeat until no swaps needed
            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1] < arr[i]){ //If neighbouring elements out of order, swap them
                    swap(arr, i+1, i);
                }
            }
        }
    }

    public static void countingSort(int[] arr){
        int max = arr[0];
        int j=1;
        for(int x:arr) if(x>max) max = x;

        // count array stores no. of occurrences of each 
        // element in 'arr'
        int[] count = new int[max+1];
        for(int x:arr) count[x] += 1;

        // for each element in count, sum up its value with the value
        // of all previous elements
        for(int i=0;i<count.length;i++){
            count[j] += count[i];
            j++;
            if(j==count.length) break; // prevent out of bounds
        }

        // sorted sequence stored in output array
        int[] output = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int temp = count[arr[i]];
            output[temp - 1] = arr[i];
            count[arr[i]] = count[arr[i]] - 1; // subtract 1 from the value at count[arr[i]]
        }
        
        //copy sorted array to input array
        for(int i=0;i<arr.length;i++){
            arr[i] = output[i];
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){ // as i increases, we add more values to our sort
                    swap(arr,j,j-1);
                    System.out.println("Swapped: " + arr[j] + " and " + arr[j-1] + " i = " + i);
                } 
            }
        }
    }

}
