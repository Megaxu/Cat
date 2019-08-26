
public class Loader
{
    public static void main(String[] args)
    {
        Cat yosa = new Cat();
        System.out.println("Масса Йоси: " + yosa.getWeight() + " грамм");
        yosa.feed(200.);
        System.out.println("Йося съел "  + yosa.howManyEat() + " грамм корма");
        System.out.println("И стал весить: " + yosa.getWeight() + " грамм");
        yosa.toilet();
        System.out.println("Теперь масса Йоси: " + yosa.getWeight() + " грамм");

        //=========================================================================

        Cat myrka = new Cat();
        Cat basiy = new Cat();
        System.out.println("Всего животных: " + Cat.getCount());
        myrka.feed(8000.26);
        myrka.getStatus();
        System.out.println("Животных осталось: " + Cat.getCount());

        //=========================================================================

        System.out.println("У кошки " + Cat.EYES_COUNT + " глаза.");
        System.out.println("Кошка " + Colors.WHITE + " цвета.");

        //=========================================================================

        Cat barsik = new Cat(8000);
        System.out.println("Барсик весит " + barsik.getWeight() + " грамм");

        //=========================================================================

        Cat mitya = new Cat();
        mitya.setColor("BLACK");
        System.out.println("Кот Митя имеет " + mitya.getColor() + " цвет шерсти.");

        //=========================================================================

        Cat sadCat = new Cat(250);
        for(int i = 0 ; i <= 250; i++)
        {
            sadCat.meow();
        }
        System.out.println("Промяукав много раз, статус грустной кошки стал: " + sadCat.getStatus());

        //=============================================================================

        Cat dolli = new Cat(1500 , Colors.BLACK);
        Cat clone = Cat.copy(dolli);
        clone.feed(250.0);
        dolli.feed(100.2);
        System.out.println(dolli.getWeight());
        System.out.println(clone.getWeight());

    }
}