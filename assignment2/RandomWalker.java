public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0, steps = 0;
         while (Math.abs(x) + Math.abs(y) < r) {
            System.out.println("("+x+", "+y+")");
            double random = Math.random();
            if (random < 0.25) x++;        
            else if (random < 0.5) x--;   
            else if (random < 0.75) y++;   
            else y--;                      
            steps++;
        }
        System.out.println("("+x+", "+y+")");
        System.out.println("steps = "+steps);

    }
}
