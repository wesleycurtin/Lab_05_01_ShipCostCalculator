public class Main
{
    public static void main(String[] args)
    {
        int cost = 274;
        double shipping = 0.00;
        double totalPrice = 0.00;



        if (cost >= 100) {
            System.out.println("You qualify for free shipping");
        }   else {
                shipping = cost * 0.02;
                }

        totalPrice = cost + shipping;

        System.out.println(("Your cost for shipping is ") + shipping);
        System.out.println(("Therefore your total price is ") + totalPrice);






    }
}