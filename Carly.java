import java.text.DecimalFormat;
import java.util.Scanner;

public class Carly {
        static Scanner inputDevice;
        static String iGuests = " ";

        static double cTotCost;
        static String oPriceGuest, oTotCost;
        public static int PRICE_PER_GUEST = 35;

        public static void main(String[] args) {
            Motto.displayMotto();
            init();
            int cGuests = input();
            calcs();
            output(cGuests);
        }

        public static void init() {
            inputDevice = new Scanner(System.in);
        }

        public static int input() {
            System.out.println("Enter the number of guests attending: ");
            iGuests = inputDevice.nextLine();
            int cGuests = Integer.parseInt(iGuests);
            return cGuests;
        }

        public static void calcs() {
            final double PRICE_GUEST = 35;
            final double PRICE_LARGE_EVENT = 49;
            int cGuests = Integer.parseInt(iGuests);
            cTotCost = cGuests * PRICE_GUEST;

        }

        public static void output(int cGuests) {
            DecimalFormat dollarAmt;
            dollarAmt = new DecimalFormat ("$###,###.00");
            oTotCost = dollarAmt.format(cTotCost);
            oPriceGuest = dollarAmt.format(cGuests);
            final int PRICE_LARGE = 49;

            boolean largeParty = false;
            if (cGuests >= 50)
                largeParty = true;

            System.out.printf("%10s%11s\n", "Number of guests: ", iGuests);
            System.out.printf("%10s%12s\n", "Price per guest: ", PRICE_PER_GUEST);
            System.out.printf("%10s%17s\n", "Total Cost: ", oTotCost);

            if(largeParty)
                System.out.println("It is a large party!");
            else
                System.out.println("It is not a large party.");


        }

}
