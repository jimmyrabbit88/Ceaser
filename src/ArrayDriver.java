import java.util.Random;

public class ArrayDriver {
    public static void main(String[] args) {
        //insert();
        //sort();
        //mergeSort();
        //int[] first = new int[]{3};
        //int[] second = new int[]{4,6};
        //int[] a = new int[3];
        //MyArrays.merge(first, second, a);

        //int[] nums
        times();




    }

    public static void times(){
        Random random = new Random();
        final int SIZE = 100000;
        int[] a = new int[SIZE];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(Integer.MAX_VALUE);
        }

        int[] b = a.clone();
        int[] c = a.clone();

        long start = System.currentTimeMillis();
        MyArrays.insertionSort(a);
        long end = System.currentTimeMillis();
        long insertSortTime = end-start;
        System.out.println("insert time " +insertSortTime);

        start = System.currentTimeMillis();
        MyArrays.insertionSort(b);
        end = System.currentTimeMillis();
        long mergeSortTime = end-start;
        System.out.println("merge time " +mergeSortTime);
    }



    public static void sort(){
        int[] nums = new int[]{3,7,2,5,9,1,6,10,8};
        for (int a: nums) {
            System.out.println(a);
        }
        System.out.println("not sorted");
        MyArrays.insertionSort(nums);
        for (int a: nums) {
            System.out.println(a);
        }
        System.out.println("sorted");
    }


    public static void mergeSort(){
        int[] nums = new int[]{3,7,2,5,9,1,6,10,8,4};
        for (int a: nums) {
            System.out.println(a);
        }
        System.out.println("not sorted");
        MyArrays.mergeSort(nums);
        for (int a: nums) {
            System.out.println(a);
        }
        System.out.println("sorted");
    }


    public static void insert(){
        int[] mynums = new int[20];
        //System.out.println(mynums[4]);
        MyArrays.insert(mynums, 10, 0, 8);
        for (int a:mynums) {
            System.out.println(a);
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
        MyArrays.insert(mynums, 10, 0, 7);
        for (int a:mynums) {
            System.out.println(a);
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
        MyArrays.insert(mynums, 10, 0, 6);
        for (int a:mynums) {
            System.out.println(a);
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
        MyArrays.insert(mynums, 10, 0, 5);
        for (int a:mynums) {
            System.out.println(a);
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
        MyArrays.insert(mynums, 10, 0, 4);
        for (int a:mynums) {
            System.out.println(a);
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
        MyArrays.pop(mynums, 10, 2);
        for (int a:mynums) {
            System.out.println(a);
        }
    }
}
