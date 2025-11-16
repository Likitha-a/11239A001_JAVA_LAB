import java.util.*;

class Binary {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Enter size: ");
    int n = s.nextInt();

    int a[] = new int[n];
    System.out.println("Enter " + n + " sorted numbers:");
    for(int i=0;i<n;i++)
      a[i] = s.nextInt();

    System.out.print("Enter number to search: ");
    int key = s.nextInt();

    int low = 0, high = n-1;

    while(low <= high){
      int mid = (low + high) / 2;

      if(a[mid] == key){
        System.out.println("Found at index " + mid);
        return;
      }

      if(key < a[mid])
        high = mid - 1;
      else
        low = mid + 1;
    }

    System.out.println("Not Found");
  }
}
