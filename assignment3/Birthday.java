public class Birthday {
    public static void main(String[] args) {
        int n = Math.abs(Integer.parseInt(args[0]));
        if (n == 0) n = 1;
        int trials = Math.abs(Integer.parseInt(args[1]));

        int[] count = new int[n + 1];

        for (int i = 0; i < trials; i++) {
            int peopleEntered = 0;
            boolean[] room = new boolean[n + 1];
            while (true) {
                int birthday = (int) (Math.random() * (double) (n - 1));
                if (room[birthday]) break;
                room[birthday] = true;
                peopleEntered++;
            }
            count[peopleEntered]++;
        }
        double previous = 0;
        for (int i = 0; ; i++) {
            double fraction = previous + ((double) count[i] / (double) trials);
            System.out.format("%-10d%-10d%f%n", i + 1, count[i], fraction);
            if (fraction >= 0.5) break;
            previous = fraction;
        }
    }
}
