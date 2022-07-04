public class PartB {
    public static void main(String[] args)
    {
        for (int star = 1; star<=5; star++)
        {
            for (int row = 1; row<=star; row++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int star = 5; star >=1; star--)
        {
            for (int row = 1; row <= star; row++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int star = 1; star <= 5; star++)
        {
            for (int row = 1; row<=5; row++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
