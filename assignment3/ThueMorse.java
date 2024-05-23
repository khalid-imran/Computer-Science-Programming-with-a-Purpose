public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //bit count --> count the 1 of the interger
                int bitI = Integer.bitCount(i) % 2;
                int bitJ = Integer.bitCount(j) % 2;
                if (bitI == bitJ) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
