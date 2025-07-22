/*
 *Symbolizes a Retailer inside a store.
 *Inherits the Store class's properties and methods.
 *Includes extra features including price with VAT included, loyalty points, and the status of online payments.
 offers ways to remove products, figure out loyalty points, and see retailer information.
*/

public class Retailer extends Store {
    // Additional attributes
    private int VATInclusivePrice;
    private int loyaltyPoint;
    private boolean IsPaymentOnline;
    private String purchasedYear;

    // Constructor
    public Retailer(int StoreId, String StoreName, String Location, String OpeningHour,
                    double TotalSales, double TotalDiscount, int VATInclusivePrice,
                    boolean IsPaymentOnline, String purchasedYear) {
        super(StoreName, Location, OpeningHour, StoreId); // Call superclass constructor
        super.setTotalSales(TotalSales); // Set total sales using superclass method
        super.setTotalDiscount(TotalDiscount); // Set total discount using superclass method
        this.VATInclusivePrice = VATInclusivePrice;
        this.IsPaymentOnline = IsPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.loyaltyPoint = 0; // Initialize loyalty point to zero
    }

    // Accessor methods
    public int getVATInclusivePrice() {
        return this.VATInclusivePrice;
    }

    public int getLoyaltyPoint() {
        return this.loyaltyPoint;
    }

    public boolean getisPaymentOnline() {
        return this.IsPaymentOnline;
    }

    public String getPurchasedYear() {
        return this.purchasedYear;
    }

    // Mutator method for isPaymentOnline
    public void setIsPaymentOnline(boolean isPaymentOnline) {
        this.IsPaymentOnline = isPaymentOnline;
    }

    // Method to set loyalty point based on VAT payment
    public void setLoyaltyPoint(boolean isPaymentOnline, int VATInclusivePrice) {
        if (isPaymentOnline == true) {
            loyaltyPoint = (int) (VATInclusivePrice * 0.01); // 1% of VAT inclusive price
            
            //System.out.println("You have gained loyalty point" + loyaltyPoint);
        }
        else{
            loyaltyPoint = 0;
            //System.out.println("You have not gained Loyalty point");
        }
    }

    // Method to remove product
    public void removeProduct() {
        if (loyaltyPoint == 0 && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))) {
            // Remove product if it meets the conditions
            this.VATInclusivePrice = 0;
            this.loyaltyPoint = 0;
            this.IsPaymentOnline = false;
        }
    }

    // Method to display retailer details
    public void Display() {
        if (loyaltyPoint == 0 && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))) {
            super.Display(); // Call superclass display method
            //System.out.println("Product has been removed.");
        } else {
            super.Display(); // Call superclass display method
            //System.out.println("VAT Inclusive Price: " + VATInclusivePrice);
            //System.out.println("Loyalty Point: " + loyaltyPoint);
            //System.out.println("Purchased Year: " + purchasedYear);
        }
    }
}
