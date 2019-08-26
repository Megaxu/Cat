
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double food = 0;
    private static int count = 0;
    public static final int EYES_COUNT = 2;
    public static final double  MIN_WEIGHT = 1000;
    public static  final double MAX_WEIGHT = 9000;
    private boolean isAlive;
    private Colors color;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        isAlive = true;
        count++;
    }

    public Cat(double weight)
    {
        this();
        this.weight = weight;
    }

    public Cat(double weight, Colors color)
    {
        this(weight);
        this.color = color;
    }

    public static Cat copy(Cat cat)
    {
        Cat clone = new Cat();
        clone.weight = cat.weight;
        clone.color = cat.color;
        return clone;
    }



    public void setColor(String color)
    {
        this.color = Colors.valueOf(color);
    }

    public Colors getColor()
    {
        return color;
    }

    public void toilet()
    {
        weight = weight - 100;
        System.out.println("Пора убрать лоток");
    }

    public double howManyEat()
    {
        return food;
    }

    public static int getCount()
    {
        return count;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        food = food + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            if(isAlive == true)
            {
                count--;
                isAlive = false;
            }
            return "Dead";
        }
        else if(weight > maxWeight) {
            if(isAlive == true)
            {
                count--;
                isAlive = false;
            }
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}