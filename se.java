import java.util.Scanner;

public class se {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = s.nextInt();

        if (size < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        System.out.println("Enter the array elements: ");
        
        for (int i = 0; i < size; i++) {
            int num = s.nextInt();
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println(second == Integer.MIN_VALUE ? "No second largest element found." : "The second largest element is: " + second);
        s.close();
    }
}