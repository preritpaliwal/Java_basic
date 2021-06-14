import java.util.Scanner;
class Car {
    float speed;
    double regularPrice;
    String color;
    public Car(float Speed,double RegularPrice, String Color)
    {
        this.speed = Speed;
        this.regularPrice = RegularPrice;
        this.color = Color;
    }
    public double getSalePrice()
    {
        return regularPrice;
    }
}

public class Truck extends Car
{
    float weight;
    public Truck(float Speed,double RegularPrice, String Color,float Weight)
    {
        super(Speed,RegularPrice,Color);
        this.weight = Weight;
    }
    public double getSalePrice()
    {
        if(this.weight>2300)
        {
            return (this.regularPrice)*0.9;
        }
        return (this.regularPrice)*0.8;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed, regularprice, color and weight of truck");
        float speed = sc.nextFloat();
        double regularPrice = sc.nextDouble();
        String color = sc.next();
        float weight = sc.nextFloat();

        Truck t1 = new Truck(speed,regularPrice,color,weight);
        System.out.println(t1.getSalePrice());
    }
}