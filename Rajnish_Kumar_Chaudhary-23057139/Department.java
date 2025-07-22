/*
 * Represents a department within a store, extending the functionality of the Store class.
 * This class includes attributes for a productName, markedPrices, and sales status, as well as
 * methods to calculate discounts, update prices, and display department details.
 */

public class Department extends Store {
    // Additional attributes
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;

    // Constructor
    public Department(int storeId, String storeName, String location, String openingHour,
                      double totalSales, double totalDiscount, String productName, double markedPrice) {
        super(storeName, location, openingHour, storeId); // Call superclass constructor
        super.setTotalSales(totalSales); // Set total sales using superclass method
        super.setTotalDiscount(totalDiscount); // Set total discount using superclass method
        this.productName = productName;
        this.markedPrice = markedPrice;
        this.sellingPrice = 0.0; // Initialize selling price to zero
        this.isInSales = true; // Default isInSales to true
        
        }
    
    // Accessor methods
    public String getProductName() {
        return this.productName;
    }

    public double getMarkedPrice() {
        return this.markedPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public boolean getIsInSales() {
        return this.isInSales;
    }

    // Mutator method for marked price
    public void setMarkedPrice(double MarkedPrice) {
        this.markedPrice = markedPrice;
    }

    // Method to calculate selling price
    public double calculateDiscountPrice(boolean isInSales, double markedPrice) {
        // Calculate discount based on marked price
        double discountpercent = 0.0;
        if (markedPrice >= 5000) {
            discountpercent = 0.20;
        } else if (markedPrice >= 3000) {
            discountpercent = 0.10;
        } else if (markedPrice >= 1000) {
            discountpercent = 0.05;
        }sellingPrice = markedPrice - (markedPrice * discountpercent);
       // System.out.println("Selling price after discount: " +sellingPrice);
        //System.out.println("Discount amount: " +(markedPrice * discountpercent));
        this.isInSales = false;
        return (markedPrice-sellingPrice);
    }
    

    // Method to display department details
    public void Display() {
        super.Display();// Call superclass display method
        //System.out.println("Product_Name" + getProductName());
        //System.out.println("Marked_Price" + getMarkedPrice());
        //System.out.println("Selling_1Price" + getSellingPrice());
        //System.out.println("IsIn_Sales" + getIsInSales());
        
        
        
        if (isInSales) {
            //System.out.println("Product Name: " + productName);
            //System.out.println("Marked Price: " + markedPrice);
        } else {
            //System.out.println("Product Name: " + productName);
            //System.out.println("Selling Price: " + sellingPrice);
        }
    }
}