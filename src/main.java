class Main
{
    void main() // public static void main (String[] args)
    {
        double purchasePrice = 0;
        double total = 0;
        double salesTax = 0;
        final double RATE = .05;

        salesTax = RATE * purchasePrice;
        total = salesTax + purchasePrice;
        IO.println( "The total is " + total + " and the tax is " + salesTax );
    }

}
