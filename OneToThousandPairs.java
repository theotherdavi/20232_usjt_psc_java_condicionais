public class OneToThousandPairs {
    public static void main (String... args)    {
        for(int start = 1; start <= 1000; start += 1)    {
            if (start % 2 == 0) {
                System.out.print("\n" + start);
            }
        }
    }
}
