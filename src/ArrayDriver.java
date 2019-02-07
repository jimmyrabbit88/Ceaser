public class ArrayDriver {
    public static void main(String[] args) {
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
