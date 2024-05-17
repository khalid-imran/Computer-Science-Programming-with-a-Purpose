public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isRightTriangle = Math.abs(a)*a + Math.abs(b)*b == Math.abs(c*c) || Math.abs(a)*a + Math.abs(c)*c == Math.abs(b*b) || Math.abs(b*b) + Math.abs(c*c) == Math.abs(a*a);
        System.out.println(isRightTriangle);
    }
}
