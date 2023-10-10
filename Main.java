import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlusOne p1 = new PlusOne();

        int[] test01 = {1,2,3,4,5}; // [1,2,3,4,6]
        int[] test02 = {1,9,9}; // [2,0,0]
        int[] test03 = {9}; // [1,0]
        int[] test04 = {9,9,9}; // [1,0,0,0]
        int[] test05 = {0}; // [0]
        int[] test06 = {9,8,9}; // [9,9,0]

        System.out.println(Arrays.toString(p1.plusOne(test01)));
        System.out.println(Arrays.toString(p1.plusOne(test02)));
        System.out.println(Arrays.toString(p1.plusOne(test03)));
        System.out.println(Arrays.toString(p1.plusOne(test04)));
        System.out.println(Arrays.toString(p1.plusOne(test05)));
        System.out.println(Arrays.toString(p1.plusOne(test06)));
    }
}
