public class FibonacciSequence {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int k = i;
        while(k>=0)
        {
            k = i + j;
            j = i;
            i = k;
            System.out.println(k);
        }
    }\
}