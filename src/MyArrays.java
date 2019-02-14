public class MyArrays {



    public static int insert (int[] values, int currentSize, int pos, int newElement){
        if(currentSize<values.length){
            for(int i= currentSize-1; i >= pos; i--){
                values[i+1] = values[i];
            }
            values[pos] = newElement;
            currentSize+=1;

        }
        return currentSize;
    }

    public static int pop(int[] values, int currentSize, int pos){
        for(int i=pos; i <=currentSize+1; i++){
            values[i] = values[i +1];
            currentSize--;
        }
        return currentSize;
    }

    public static void insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            int val = a[i];
            int j = i -1;
            while(j>=0 && a[j] > val){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = val;
        }
    }
}
