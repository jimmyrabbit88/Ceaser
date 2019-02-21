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

    public static void mergeSort (int[] a){
        if(a.length <= 1){
            return;
        }
        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];
        for(int i = 0; i < a.length; i++){
            if(i<first.length){
                first[i] = a[i];
            }
            else{
                second[i-first.length] = a[i];
            }
        }
        mergeSort(first);
        mergeSort(second);
        merge(first, second, a);
    }

    public static void merge(int[] first, int[] second, int[] a){
        int indexf = 0;
        int indexs = 0;
        int i = 0;
        while(i<first.length + second.length){
            if(indexf >= first.length){
                a[i] = second[indexs];
                indexs ++;
                i++;
            }
            else if(indexs >= second.length){
                a[i] = first[indexf];
                indexf++;
                i++;
            }
            else if(first[indexf] > second[indexs]){
                a[i] = second[indexs];
                indexs ++;
                i++;
            }
            else{
                a[i] = first[indexf];
                indexf++;
                i++;
            }
        }




    }
}
