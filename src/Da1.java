import java.util.Arrays;

/**
 * Created by Yuriy on 12.02.2016.
 */
public class Da1 {
    public static void main(String[] args){
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14,34,85,12,46};
        Arrays.sort(m);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(m));
        int searchVall = 25;
        int retVal= Arrays.binarySearch(m,searchVall);
        System.out.println("Index 25 is:"+retVal);
    }
}
