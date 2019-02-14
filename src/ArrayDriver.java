public class ArrayDriver {
    public static void main(String[] args) {
        //insert();
        sort();
    }
    public static void sort(){
        int[] nums = new int[]{3,7,2,5,9,1,6,10,8,4};
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
