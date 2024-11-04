public class Main {
    public static void main(String[] args)
    {
        double itemPrice = 15;
        double TAX_RATE = .05;
        double salesTax = itemPrice * TAX_RATE;

        System.out.println("The sales tax on an item costing $" + itemPrice + " is $" + salesTax);
    }
}