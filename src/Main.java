public class Main {

    public static void main(String[] args) {

        System.out.println(area(58));
    }

    public static double area(double radius){
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if (x < 0){
            return -1.0;
        }
        if (y < 0){
            return -1.0;
        }

        return x * y;
    }

}
