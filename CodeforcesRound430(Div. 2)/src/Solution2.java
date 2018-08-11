import java.util.Scanner;
class Pizza{
    private int radius;
    private int x;
    private int y;
    private int d;
    private int width;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double pizzaArea(){
        return  Math.PI * getRadius() * getRadius();
    }
    public int getRadiusOfMainPart(){
        return getRadius() - getWidth();
    }
    public double pizzaMainPartArea(){
        return Math.PI * getRadiusOfMainPart() * getRadiusOfMainPart();
    }

    public double pizzaRemainingArea(){
        return  pizzaArea() - pizzaMainPartArea();
    }
}
class Sausage{
    private  int radius;
    private int x;
    private int y;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double SausageArea(){
        return  Math.PI * getRadius() * getRadius();
    }
}
public class Solution2 {


    public static void main(String[] args) {
        int numberOfPizza;
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = new Pizza();
        Sausage sausage = new Sausage();
        // get the inputs
        pizza.setRadius(scanner.nextInt());
        pizza.setWidth(scanner.nextInt());
        numberOfPizza = scanner.nextInt();
        for (int i =0; i < numberOfPizza; i++){
            sausage.setX(scanner.nextInt());
            sausage.setY(scanner.nextInt());
            sausage.setRadius(scanner.nextInt());
        }
    }
}

//class Pizza{
//    int x;
//    int y;
//    int r;
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public int getR() {
//        return r;
//    }
//
//    public void setR(int r) {
//        this.r = r;
//    }
//
//
//}
//public class Solution2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int r,d;
//        int n;
//        Pizza pizza = new Pizza();
//
//        r = scanner.nextInt();
//        d = scanner.nextInt();
//        n = scanner.nextInt();
//        for (int i =0; i<n;i++){
//            pizza.setX(scanner.nextInt());
//            pizza.setY(scanner.nextInt());
//            pizza.setR(scanner.nextInt());
//        }
//        scanner.close();
//
//        //System.out.println(r +" "+  d+ " "+  + n+" "+pizza.getX()+" "+pizza.getY()+" "+pizza.getR() );
//    }
//}
