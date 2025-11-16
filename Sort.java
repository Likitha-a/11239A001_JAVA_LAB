import java.util.*;

class Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = s.nextInt();            
        int a[] = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)                
	 a[i] = s.nextInt();

        Arrays.sort(a);                 
        System.out.print("Sorted array: ");
        for (int x : a)                 
            System.out.print(x + " ");
    }
}
