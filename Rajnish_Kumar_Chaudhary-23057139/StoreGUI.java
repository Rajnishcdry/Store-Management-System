import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreGUI {
    private JFrame f1;
    private JLabel idL, nameL, locL, hourL, salesL, discL, prodL, markL, sellL, vatL, purYL, background;
    private JTextField idTF2, idTF, nameTF, locTF, hourTF, salesTF, discTF, prodTF, markTF, sellTF, vatTF;
    private JButton addDeptBtn, addRetailBtn, calcDiscBtn, setLoyBtn, removeProdBtn, dispBtn, clearBtn,rtlrBtn,changeDeptBtn;
    private JComboBox purYCB;
    private JCheckBox isInSales1, isPayOnline;
    private ArrayList<Store> list = new ArrayList<>();

    // Constructor
    public void DepartmentGUI() {
        f1 = new JFrame("STORE GUI");
        f1.setSize(1600, 800);
        //f1.getContentPane().setBackground(new Color(135, 206, 235));

        // Create a layered pane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(1600, 800);

        // Load and display the background image
        ImageIcon icon = new ImageIcon("Departmentimg.png");  // Load the image
        background = new JLabel(icon);  // Create a JLabel to hold the image
        background.setBounds(0, 0, 1600, 800);  // Set the bounds for the image label
        layeredPane.add(background, Integer.valueOf(0));  // Add the background image to the layered pane

        // Create a panel for other components
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false);  // Make sure the panel is transparent
        panel.setBounds(0, 0, 1600, 800);  // Make the panel cover the entire frame

        //----Heading--------------------------------------
        JLabel heading = new JLabel("DEPARTMENT");
        heading.setBounds(650, 70, 240, 30);
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        f1.add(heading);
        //-------------------------------------------------

        //----Store ID Label and TextField------------------------------------
        idL = new JLabel("Store ID: ");
        idL.setBounds(290, 175, 150, 30);
        idL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(idL);

        idTF = new JTextField();
        idTF.setBounds(410, 175, 230, 30);
        idTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(idTF);
        //--------------------------------------------------

        //----Store Name Label and TextField------------------------------------
        nameL = new JLabel("Store Name: ");
        nameL.setBounds(290, 245, 150, 30);
        nameL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(nameL);

        nameTF = new JTextField();
        nameTF.setBounds(410, 245, 230, 30);
        nameTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(nameTF);
        //--------------------------------------------------

        //----Location Label and TextField------------------------------------
        locL = new JLabel("Location: ");
        locL.setBounds(290, 315, 130, 30);
        locL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(locL);

        locTF = new JTextField();
        locTF.setBounds(410, 315, 230, 30);
        locTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(locTF);
        //--------------------------------------------------

        //----Opening Hour Label and TextField------------------------------------
        hourL = new JLabel("Opening Hour: ");
        hourL.setBounds(290, 385, 150, 30);
        hourL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(hourL);

        hourTF = new JTextField();
        hourTF.setBounds(410, 385, 230, 30);
        hourTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(hourTF);
        //--------------------------------------------------

        //----Total Sales Label and TextField------------------------------------
        salesL = new JLabel("Total Sales: ");
        salesL.setBounds(790, 175, 130, 30);
        salesL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(salesL);

        salesTF = new JTextField();
        salesTF.setBounds(910, 175, 230, 30);
        salesTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(salesTF);
        //--------------------------------------------------

        //----Total Discount Label and TextField------------------------------------
        discL = new JLabel("Total Discount: ");
        discL.setBounds(790, 245, 150, 30);
        discL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(discL);

        discTF = new JTextField();
        discTF.setBounds(910, 245, 230, 30);
        discTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(discTF);
        //--------------------------------------------------

        //----Product Name Label and TextField------------------------------------
        prodL = new JLabel("Product Name: ");
        prodL.setBounds(790, 315, 150, 30);
        prodL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(prodL);

        prodTF = new JTextField();
        prodTF.setBounds(910, 315, 230, 30);
        prodTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(prodTF);
        //--------------------------------------------------

        //----Marked Price Label and TextField------------------------------------
        markL = new JLabel("Marked Price: ");
        markL.setBounds(790, 385, 150, 30);
        markL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(markL);

        markTF = new JTextField();
        markTF.setBounds(910, 385, 230, 30);
        markTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(markTF);
        //--------------------------------------------------

        //----Display Button------------------------------------
        dispBtn = new JButton("Display");
        dispBtn.setBounds(330, 485, 160, 30);
        dispBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(dispBtn);
        //--------------------------------------------------

        //----Add Department Button------------------------------------
        addDeptBtn = new JButton("Add Department");
        addDeptBtn.setBounds(580, 485, 210, 30);
        addDeptBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(addDeptBtn);
        //--------------------------------------------------

        //----Clear Button (Form Reset)------------------------------------
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(930, 485, 160, 30);
        clearBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(clearBtn);
        //--------------------------------------------------

        //----Store ID (for Display) Label and TextField------------------------------------
        idL = new JLabel("Store ID: ");
        idL.setBounds(290, 600, 150, 30);
        idL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(idL);

        idTF2 = new JTextField();
        idTF2.setBounds(410, 600, 230, 30);
        idTF2.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(idTF2);
        //--------------------------------------------------

        //----Change to Lecturer Button ------------------------------------
        rtlrBtn = new JButton("Change to Retailer Button");
        rtlrBtn.setBounds(750, 600, 300, 30);
        rtlrBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(rtlrBtn);
        //--------------------------------------------------

        //-----isInSales------------------------------------
        isInSales1 = new JCheckBox("isInSales");
        isInSales1.setBounds(300, 680, 160, 30);
        isInSales1.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(isInSales1);
        //--------------------------------------------------

        //----Calculate Discount Button ------------------------------------
        calcDiscBtn = new JButton("Calculate Discount");
        calcDiscBtn.setBounds(500, 680, 200, 30);
        calcDiscBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(calcDiscBtn);
        //--------------------------------------------------

        //-------------------------------------------------Button function works---------------------------------------------------------------------------------

        //----Calling RetailerGUI button------------------------------------
        rtlrBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StoreGUI rtlrBtn = new StoreGUI(); // Create StoreGUI instance
                rtlrBtn.RetailerGUI(); // Call RetailerGUI method
                f1.setVisible(false); // Hide the current frame
            }
        });
        //------------------------------------------------------------
        

        //----Add Department button------------------------------------
        addDeptBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Check if any required fields are empty
                if (idTF.getText().isEmpty() || nameTF.getText().isEmpty() || locTF.getText().isEmpty() || hourTF.getText().isEmpty() ||
                    salesTF.getText().isEmpty() || discTF.getText().isEmpty() || prodTF.getText().isEmpty() || markTF.getText().isEmpty()) {
        
                    // Show error if any field is empty
                    JOptionPane.showMessageDialog(f1, "Fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Exit if validation fails
                }
        
                try {
                    // Parse input values
                    int storeId = Integer.parseInt(idTF.getText());
                    String storeName = nameTF.getText();
                    String location = locTF.getText();
                    String openingHour = hourTF.getText();
                    double totalSales = Double.parseDouble(salesTF.getText());
                    double totalDiscount = Double.parseDouble(discTF.getText());
                    String productName = prodTF.getText();
                    double markedPrice = Double.parseDouble(markTF.getText());
        
                    // Check if store ID already exists
                    boolean idExists = false;
                    for (Store obj : list) {
                        if (obj instanceof Department && obj.getStoreId() == storeId) {
                            idExists = true;
                            break; // Stop checking if ID is found
                        }
                    }
        
                    if (idExists) {
                        // Show error if ID exists
                        JOptionPane.showMessageDialog(f1, "Store ID already exists. Please use a different ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Create and add Department object to the list
                        Department dept1 = new Department(storeId, storeName, location, openingHour, totalSales, totalDiscount, productName, markedPrice);
                        list.add(dept1);
        
                        // Show success message
                        JOptionPane.showMessageDialog(f1, "Department added successfully.");
                    }
                } catch (NumberFormatException ex) {
                    // Show error for invalid number format
                    JOptionPane.showMessageDialog(f1, "Please enter valid numbers for Total Sales, Total Discount, and Marked Price.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        //------------------------------------------------------------------

        //----------Clear Button-----------------------------------
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear all text fields
                idTF.setText("");
                nameTF.setText("");
                locTF.setText("");
                hourTF.setText("");
                salesTF.setText("");
                discTF.setText("");
                prodTF.setText("");
                markTF.setText("");
                idTF2.setText("");
        
                // Reset the checkbox
                isInSales1.setSelected(false);
        
                // Optional: Confirm fields have been cleared
                JOptionPane.showMessageDialog(f1, "Cleared all fields");
            }
        });
        //------------------------------------------------------

        //----------Display Button-----------------------------------
        dispBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Check if the list is empty
                if (list.isEmpty()) {
                    JOptionPane.showMessageDialog(f1, "Add a Department or Retailer first", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                try {
                    // Get and parse the Store ID from the text field
                    int storeID = Integer.parseInt(idTF.getText());
                    boolean storeFound = false;
        
                    // Search for the store with the given ID
                    for (Store obj : list) {
                        if (obj.getStoreId() == storeID) {
                            if (obj instanceof Department) {
                                storeFound = true;
                                Department department = (Department) obj;
                                // Display department details
                                JOptionPane.showMessageDialog(f1,
                                    "Store ID: " + department.getStoreId() + "\n" +
                                    "Store Name: " + department.getStoreName() + "\n" +
                                    "Location: " + department.getLocation() + "\n" +
                                    "Opening Hour: " + department.getOpeningHour() + "\n" +
                                    "Total Sales: Rs " + department.getTotalSales() + "\n" +
                                    "Total Discount: Rs " + department.getTotalDiscount() + "\n" +
                                    "Product Name: " + department.getProductName() + "\n" +
                                    "Marked Price: Rs " + department.getMarkedPrice() + "\n" +
                                    "Selling Price: Rs " + department.getSellingPrice() + "\n" +
                                    "Is In Sales: " + department.getIsInSales(),
                                    "Department Details", JOptionPane.INFORMATION_MESSAGE
                                );
                                break; // Exit the loop after finding the department
                            }
                        }
                    }
        
                    if (!storeFound) {
                        // Show error if store ID is not found or not a Department
                        JOptionPane.showMessageDialog(f1, "Store ID not found or not a Department.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
        
                } catch (NumberFormatException ex) {
                    // Show error for invalid Store ID format
                    JOptionPane.showMessageDialog(f1, "Invalid Store ID. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        //----------------------------------------------------
        
        //------Calculate Discount Button------------------------
        calcDiscBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse input values
                    int storeId = Integer.parseInt(idTF2.getText());
                    boolean isInSales = isInSales1.isSelected();
                    double markedPrice = Double.parseDouble(markTF.getText());
        
                    // Check if the list is not empty
                    if (!list.isEmpty()) {
                        for (Store store11 : list) {
                            if (storeId == store11.getStoreId() && store11 instanceof Department) {
                                Department department11 = (Department) store11;
                                // Display calculated discount
                                JOptionPane.showMessageDialog(f1, "Discount amount: " + department11.calculateDiscountPrice(isInSales, markedPrice));
                                break; // Exit after calculation
                            }
                        }
                    }
        
                } catch (NumberFormatException ex) {
                    // Show error for invalid number format
                    JOptionPane.showMessageDialog(f1, "Error: Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        //-----------------------------------------------------

        f1.add(layeredPane);
        f1.setLayout(null);
        f1.setVisible(true);
    }

    //----------------------------------------------------------Retailer Frame----------------------------------------------------------------------------

    public void RetailerGUI() {
        //-----------------Frame------------------------------
        f1 = new JFrame("STORE GUI");
        f1.setSize(1600, 800);
        
        // Create a layered pane for background and components
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(1600, 800);
        
        // Load and display the background image
        ImageIcon icon = new ImageIcon("Retailerimg.png");
        background = new JLabel(icon);
        background.setBounds(0, 0, 1600, 800);
        layeredPane.add(background, Integer.valueOf(0));
        
        // Create a transparent panel for other components
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false);
        panel.setBounds(0, 0, 1600, 800);
        
        //----Heading--------------------------------------
        JLabel heading = new JLabel("RETAILER");
        heading.setBounds(680, 40, 240, 30);
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        f1.add(heading);
        //-------------------------------------------------
        
        //----Store ID Label and TextField------------------------------------
        idL = new JLabel("Store ID: ");
        idL.setBounds(290, 135, 150, 30);
        idL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(idL);
        
        idTF = new JTextField();
        idTF.setBounds(410, 135, 230, 30);
        idTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(idTF);
        //--------------------------------------------------
        
        //----Store Name Label and TextField------------------------------------
        nameL = new JLabel("Store Name: ");
        nameL.setBounds(290, 205, 150, 30);
        nameL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(nameL);
        
        nameTF = new JTextField();
        nameTF.setBounds(410, 205, 230, 30);
        nameTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(nameTF);
        //--------------------------------------------------
        
        //----Location Label and TextField------------------------------------
        locL = new JLabel("Location: ");
        locL.setBounds(290, 275, 130, 30);
        locL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(locL);
        
        locTF = new JTextField();
        locTF.setBounds(410, 275, 230, 30);
        locTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(locTF);
        //--------------------------------------------------
        
        //----Opening Hour Label and TextField------------------------------------
        hourL = new JLabel("Opening Hour: ");
        hourL.setBounds(290, 345, 150, 30);
        hourL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(hourL);
        
        hourTF = new JTextField();
        hourTF.setBounds(410, 345, 230, 30);
        hourTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(hourTF);
        //--------------------------------------------------
        
        //----Total Sales Label and TextField------------------------------------
        salesL = new JLabel("Total Sales: ");
        salesL.setBounds(790, 135, 130, 30);
        salesL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(salesL);
        
        salesTF = new JTextField();
        salesTF.setBounds(950, 135, 230, 30);
        salesTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(salesTF);
        //--------------------------------------------------
        
        //----Total Discount Label and TextField------------------------------------
        discL = new JLabel("Total Discount: ");
        discL.setBounds(790, 205, 150, 30);
        discL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(discL);
        
        discTF = new JTextField();
        discTF.setBounds(950, 205, 230, 30);
        discTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(discTF);
        //--------------------------------------------------
        
        //----VAT Inclusive Price Label and TextField------------------------------------
        vatL = new JLabel("VAT Inclusive Price ");
        vatL.setBounds(790, 275, 150, 30);
        vatL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(vatL);
        
        vatTF = new JTextField();
        vatTF.setBounds(950, 275, 230, 30);
        vatTF.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(vatTF);
        //--------------------------------------------------
        
        //----Purchased Year Label and ComboBox------------------------------------
        purYL = new JLabel("Purchased Year ");
        purYL.setBounds(790, 345, 150, 30);
        purYL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(purYL);
        
        String year[] = {"2017","2018","2019","2020","2021","2022","2023","2024"};
        purYCB = new JComboBox(year);
        purYCB.setFont(new Font("Arial", Font.BOLD, 16));
        purYCB.setBounds(920, 345, 150, 30);
        f1.add(purYCB);
        //--------------------------------------------------
        
        //----Display Button------------------------------------
        dispBtn = new JButton("Display");
        dispBtn.setBounds(420, 450, 160, 30);
        dispBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(dispBtn);
        //--------------------------------------------------
        
        //----Add Retailer Button------------------------------------
        addRetailBtn = new JButton("Add Retailer");
        addRetailBtn.setBounds(700, 450, 210, 30);
        addRetailBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(addRetailBtn);
        //--------------------------------------------------
        
        //----Clear Button (Form Reset)------------------------------------
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(1100, 450, 120, 30);
        clearBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(clearBtn);
        //--------------------------------------------------
        
        //----Store ID (for Display) Label and TextField------------------------------------
        idL = new JLabel("Store ID: ");
        idL.setBounds(290, 570, 150, 30);
        idL.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(idL);
        
        idTF2 = new JTextField();
        idTF2.setBounds(410, 570, 230, 30);
        idTF2.setFont(new Font("Arial", Font.BOLD, 14));
        f1.add(idTF2);
        //--------------------------------------------------
        
        //----Change to Department Button ------------------------------------
        changeDeptBtn = new JButton("Change to Department Button");
        changeDeptBtn.setBounds(750, 570, 300, 30);
        changeDeptBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(changeDeptBtn);
        //--------------------------------------------------
        
        //-----isPaymentOnline------------------------------------
        isPayOnline = new JCheckBox("isPaymentOnline");
        isPayOnline.setBounds(320, 680, 160, 30);
        isPayOnline.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(isPayOnline);
        //--------------------------------------------------
        
        //----Set Loyalty Point Button ------------------------------------
        setLoyBtn = new JButton("Loyalty Point");
        setLoyBtn.setBounds(580, 680, 160, 30);
        setLoyBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(setLoyBtn);
        //--------------------------------------------------
        
        //----Remove Product Button ------------------------------------
        removeProdBtn = new JButton("Remove Product");
        removeProdBtn.setBounds(840, 680, 160, 30);
        removeProdBtn.setFont(new Font("Arial", Font.BOLD, 16));
        f1.add(removeProdBtn);
        //--------------------------------------------------

        //-------------------------------------------------Button function works---------------------------------------------------------------------------------

        //-------------Display Button---------------------
        dispBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (list.isEmpty()) {
                    JOptionPane.showMessageDialog(f1, "Add a Retailer first", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                try {
                    // Parse the Store ID from the text field
                    int storeID = Integer.parseInt(idTF.getText());
                    boolean storeFound = false;
        
                    // Iterate through the list to find the matching Retailer
                    for (Store obj : list) {
                        if (obj instanceof Retailer && obj.getStoreId() == storeID) {
                            storeFound = true;
                            Retailer retailer = (Retailer) obj;
        
                            // Format the message to display Retailer details
                            String message = "Store ID: " + retailer.getStoreId() +
                                "\nStore Name: " + retailer.getStoreName() +
                                "\nLocation: " + retailer.getLocation() +
                                "\nOpening Hour: " + retailer.getOpeningHour() +
                                "\nTotal Sales: Rs " + retailer.getTotalSales() +
                                "\nTotal Discount: Rs " + retailer.getTotalDiscount() +
                                "\nVAT Inclusive Price: Rs " + retailer.getVATInclusivePrice() +
                                "\nIs Payment Online: " + (retailer.getisPaymentOnline() ? "Yes" : "No") +
                                "\nPurchased Year: " + retailer.getPurchasedYear();
        
                            // Display the Retailer details
                            JOptionPane.showMessageDialog(f1, message);
                            break; // Exit loop once the retailer is found and displayed
                        }
                    }
        
                    // Show error message if Retailer is not found
                    if (!storeFound) {
                        JOptionPane.showMessageDialog(f1, "Store ID not found or not a Retailer.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
        
                } catch (NumberFormatException ex) {
                    // Handle invalid Store ID format
                    JOptionPane.showMessageDialog(f1, "Invalid Store ID format. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        //----Add Retailer button------------------------------------
        addRetailBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Check if any required fields are empty
                if (idTF.getText().isEmpty() || nameTF.getText().isEmpty() || locTF.getText().isEmpty() || hourTF.getText().isEmpty() ||
                    salesTF.getText().isEmpty() || discTF.getText().isEmpty() || vatTF.getText().isEmpty()) {
                    // Show an error message if any field is empty
                    JOptionPane.showMessageDialog(f1, "Fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
                    return;  // Exit if fields are empty
                }
        
                try {
                    // Parse input values
                    int StoreId = Integer.parseInt(idTF.getText());
                    String StoreName = nameTF.getText();
                    String Location = locTF.getText();
                    String OpeningHour = hourTF.getText();
                    double TotalSales = Double.parseDouble(salesTF.getText());
                    double TotalDiscount = Double.parseDouble(discTF.getText());
                    int VATInclusivePrice = Integer.parseInt(vatTF.getText());
                    boolean IsPaymentOnline = isPayOnline.isSelected();
                    String purchasedYear = (String) purYCB.getSelectedItem();
        
                    // Check if Store ID already exists
                    boolean ilu = false;
                    for (Store obj : list) {
                        if (obj instanceof Retailer && obj.getStoreId() == StoreId) {
                            ilu = true;
                            break;
                        }
                    }
        
                    if (ilu) {
                        // Show error if ID exists
                        JOptionPane.showMessageDialog(f1, "StoreID exists. Please use a different ID", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Create and add new Retailer
                        Retailer retail1 = new Retailer(StoreId, StoreName, Location, OpeningHour, TotalSales, TotalDiscount, VATInclusivePrice, 
                                IsPaymentOnline, purchasedYear);
                        list.add(retail1);
                        JOptionPane.showMessageDialog(f1, "Retailer added successfully.");
                    }
                } catch (NumberFormatException ex) {
                    // Show error for invalid number format
                    JOptionPane.showMessageDialog(f1, "Input valid numbers for Total Sales, Total Discount, and VAT inclusive price", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        //----Calling DepartmentGUI button------------------------------------
        changeDeptBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a new StoreGUI instance and call the DepartmentGUI method
                StoreGUI changeDeptBtn = new StoreGUI();
                changeDeptBtn.DepartmentGUI();
                // Hide the current frame
                f1.setVisible(false);
            }
        });


        //----------------Clear Button----------------
        clearBtn.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // Clear all text fields
                    idTF.setText("");
                    nameTF.setText("");
                    locTF.setText("");
                    hourTF.setText("");
                    salesTF.setText(""); 
                    discTF.setText("");
                    vatTF.setText("");
                    idTF2.setText("");

                    // Reset the checkbox
                    isPayOnline.setSelected(false);

                    // Reset the combo box
                    purYCB.setSelectedIndex(0); // Or set to a default value if applicable

                    // Optional: Display a message confirming that fields have been cleared
                    JOptionPane.showMessageDialog(f1, "Cleared all fields");
                }
            });

        //----------------Remove Product Button----------------
        removeProdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the Store ID from the text field
                    int storeId = Integer.parseInt(idTF.getText());
                    boolean storeFound = false;
        
                    // Search for the Retailer with the given Store ID
                    for (Store obj2 : list) {
                        if (obj2 instanceof Retailer && obj2.getStoreId() == storeId) {
                            storeFound = true;
                            // Remove the Retailer from the list
                            list.remove(obj2);
                            // Notify user of successful removal
                            JOptionPane.showMessageDialog(f1, "Product was removed successfully");
                            break; // Exit the loop once removed
                        }
                    }
        
                    // Notify user if the Store ID was not found or is not a Retailer
                    if (!storeFound) {
                        JOptionPane.showMessageDialog(f1, "Store ID not found or not a Retailer.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    // Handle invalid number format for Store ID
                    JOptionPane.showMessageDialog(f1, "Invalid Input. Please enter a valid Store ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        //----------------Set Loyalty Point Button----------------
        setLoyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get inputs
                    int storeId = Integer.parseInt(idTF2.getText());
                    boolean isPaymentOnline = isPayOnline.isSelected();
                    int VATInclusivePrice = Integer.parseInt(vatTF.getText());
        
                    // Find and update Retailer
                    for (Store obj3 : list) {
                        if (obj3 instanceof Retailer && obj3.getStoreId() == storeId) {
                            Retailer retailer = (Retailer) obj3;
                            retailer.setLoyaltyPoint(isPaymentOnline, VATInclusivePrice);
        
                            JOptionPane.showMessageDialog(f1, "Loyalty point set successfully! " + retailer.getLoyaltyPoint());
                            return;
                        }
                    }
        
                    // Handle case where Store ID is not found
                    JOptionPane.showMessageDialog(f1, "Store ID not found or not a Retailer", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    JOptionPane.showMessageDialog(f1, "Invalid Input. Please enter a valid Store ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        f1.add(layeredPane);
        f1.setLayout(null);
        f1.setVisible(true);

    }
    public static void main(String[] args) {
        StoreGUI s1 = new StoreGUI();
        s1.DepartmentGUI();
    }
}

