public class DiscreteDistribution {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] a = new int[n];
        int[] cumValue = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i+1]);
            cumValue[i+1] = cumValue[i] + a[i];
        }
        int maxCumValue = cumValue[cumValue.length - 1];
        for(int i = 0; i < m; i++) {
            int r = (int) (Math.random() * maxCumValue);
            for (int j = 1; j <= cumValue.length; j++) {
                if (cumValue[j-1] <= r && r < cumValue[j]) {
                    System.out.print(j + " ");
                    break;
                }
            }
        }
    }
}