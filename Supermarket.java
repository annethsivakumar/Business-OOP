/*
 * Program Name: Supermarket.java
 * Description: This class represents a supermarket franchise, which is a specific type of business. 
 * It inherits attributes and behaviors from the Business class and extends it to include additional 
 * features specific to supermarkets, such as the number of products in the store inventory, 
 * the percentage of loyalty program users, and the list of departments available in the supermarket.
 */
public class Supermarket extends Business {
    // Intialize variables.
    private int numProducts;
    private double loyaltyUsers;
    private String[] lisDepartments;

    /**
     * Creates a new instance of the Supermarket class with the provided parameters.
     * @param registrationNumber The business' registration number as an integer.
     * @param owner The franchise owner's name as an object.
     * @param year The year the business was established as an integer.
     * @param dailySales The average dollar amount of daily sales at the business as a double.
     * @param annualSales The average dollar amount of annual sales at the business as a double.
     * @param numProducts The number of products in the store inventory as an integer.
     * @param loyaltyUsers The percentage of supermarket's members in the loyalty program as a double.
     * @param listDepartments A list of Strings representing departments available in the supermarket.
     * @throws IllegalBusiness If any of the provided parameters are invalid or out of range.
     */
    public Supermarket(int registrationNumber, FranchiseOwner owner, int year, double dailySales, double annualSales, int numProducts, double loyaltyUsers, String[] listDepartments) throws IllegalBusiness{
        // Invoking the constructor of the Business class.
        super(registrationNumber, owner, year, dailySales, annualSales);
        setNumProducts(numProducts);
        setLoyaltyUsers(loyaltyUsers);
        setListDepartments(listDepartments);
    }

    /**
     * Returns an integer representation of the number of products in the store inventory.
     * @return The number of products in the store inventory as an integer.
     */
    public int getNumProducts() {
        return numProducts;
    }

    /**
     * Sets an integer representation of the number of products in the store inventory.
     * @param numProducts An integer number representing the number of products to set.
     * @throws IllegalBusiness If the numProducts value is less than 0.
     */
    public void setNumProducts(int numProducts) throws IllegalBusiness{
        // Check if user's input is valid.
        if(numProducts < 0){
            throw new IllegalBusiness("Invalid integer entered. Please enter an integer greater or equal to zero.");
        } else {
            this.numProducts = numProducts;
        }
    }

    /**
     * Returns a double representation of the percentage of supermarket's members in the loyalty program.
     * @return A double value percentage of supermarket's members in the loyalty program.
     */
    public double getLoyaltyUsers() {
        return loyaltyUsers;
    }

    /**
     * Sets a double representation of the percentage of supermarket's members in the loyalty program.
     * @param loyaltyUsers A double value percentage of loyalty program users to set.
     */
    public void setLoyaltyUsers(double loyaltyUsers) throws IllegalBusiness{
        // Check if user's input is valid.
        if(loyaltyUsers < 0.0){
            throw new IllegalBusiness("Invalid double value entered. Please enter a double value greater or equal to zero.");
        } else {
            this.loyaltyUsers = loyaltyUsers;
        }
    }

    /**
     * Returns the Array of departments available in the supermarket.
     * @return An Array of Strings containing the list of departments.
     */
    public String[] getListDepartments() {
        return lisDepartments;
    }

    /**
     * Sets the list of departments available in the supermarket.
     * @param listDepartments The Array of Strings representing departments to set.
     */
    public void setListDepartments(String[] listDepartments) {
        this.lisDepartments = listDepartments;
    }

    /**
     * Joins an array of strings into a single String with elements separated by commas.
     * @param listDepartments The Array of Strings to join.
     * @return A String representation of the joined elements.
     */
    private String stringOfListDepartments(String[] listDepartments){
        return String.join(", ", listDepartments);
    }


    /**
     * Returns a String representation of the Supermarket object.
     * @return A String containing information about Supermarket object.
     */
    @Override
    public String toString(){
        return "This supermarket has " + numProducts + " products in the store inventory." + "\n" + 
               loyaltyUsers + "% of the supermarket's members are in the loyaltly program." + "\n" + 
               "Here is the list of departments at this supermarket: " + stringOfListDepartments(lisDepartments) + ".";
    }
}
