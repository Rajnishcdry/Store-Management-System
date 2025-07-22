/*
 * Represents a store with attributes such as Storename, location, storeId and total sales.
 * This class provides methods to set and get back store details,
 * as well as methods to update total sales and total discount.
 * In addition, it includes a method to display store information.
 */     

class Store{ 
    // Attributes for the Store
    private String storeName;
    private String location;
    private String openingHour;
    private int storeId;
    private double totalSales;
    private double totalDiscount;
    
    //Constructor
    public Store(String storeName, String location, String openingHour, int storeId){
        //Initialize attributes with parameter values
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        this.storeId = storeId;
        this.totalSales = 0.00; // Initialize to 0;
        this.totalDiscount = 0.00; // Initialize to 0;
    }
    
    /*Accessor Methods
     *Get method for store name*/
    public String getStoreName(){
        return this.storeName;
    }
    
    // Get method for location
    public String getLocation(){
        return this.location;
    }
    
    //Get method for openingHour
    public String getOpeningHour(){
        return this.openingHour;
    }
    
    //Get method for storeId
    public int getStoreId(){
        return this.storeId;
    }
    
    //Get method for totalSales
    public double getTotalSales(){
        return this.totalSales;
    }
    
    //Get method for totalDiscount
    public double getTotalDiscount(){
        return this.totalDiscount;
    }
    
    /*Method to set total Discount
     *Method to add new discount to total discount*/
    public void setTotalDiscount(double totalDiscount){
        this.totalDiscount += totalDiscount; // Add new discount to previous total discount
    }
    
    /* Method to set total sales
     *Method to add new sales to total sales*/
    public void setTotalSales(double totalSales) {
        this.totalSales += totalSales; // Add new sales to previous total sales
    }

    //Display Method
    public void Display(){
        //System.out.println("Store_ID: " + getStoreId());
        //System.out.println("Store_Name: " + getStoreName());
        //System.out.println("Location: " + getLocation());
        //System.out.println("Opening_Hour: " + getOpeningHour());
        //System.out.println("Total Sales: " + getTotalSales());
        if(totalSales == 0.0 && totalDiscount == 0.0){
            System.out.println("There is no any Sales or Discounts"); 
        }
    }
}