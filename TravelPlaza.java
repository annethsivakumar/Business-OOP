/*
 * Program Name: TravelPlaza.java
 * Student Name: Anneth Sivakumar
 * Student Number: 20320973
 * Date: August 01, 2023
 * Description: This class represents a travel plaza franchise, which is a specific type of business. 
 * It inherits attributes and behaviors from the Business class and extends it to include additional features
 * specific to travel plazas, such as dining options, shopping options, and fuel services availability.
 */
public class TravelPlaza extends Business {
    // Intialize variables.
    private String[] diningOptions;
    private String[] shoppingOptions;
    private boolean fuel;

    /**
     * Creates a new instance of the TravelPlaza class with the provided parameters.
     * @param registrationNumber The business' registration number as an integer.
     * @param owner The franchise owner's name as an object.
     * @param year The year the business was established as an integer.
     * @param dailySales The average dollar amount of daily sales at the business as a double.
     * @param annualSales The average dollar amount of annual sales at the business as a double.
     * @param diningOptions The dining options available at the travel plaza in an Array of Strings.
     * @param shoppingOptions The shopping options available at the travel plaza in an Array of Strings.
     * @param fuel Whether fuel services are available at the travel plaza.
     * @throws IllegalBusiness If any of the provided parameters are invalid or out of range.
     */
    public TravelPlaza(int registrationNumber, FranchiseOwner owner, int year, double dailySales, double annualSales, String[] diningOptions, String[] shoppingOptions, boolean fuel) throws IllegalBusiness{
        // Invoking the constructor of the Business class.
        super(registrationNumber, owner, year, dailySales, annualSales);
        setDiningOptions(diningOptions);
        setShoppingOptions(shoppingOptions);
        setFuel(fuel);
    }

    /**
     * Returns a String of Array representation of the dining options available at the travel plaza.
     * @return An array of Strings containing the dining options.
     */
    public String[] getDiningOptions() {
        return diningOptions;
    }

    /**
     * Sets a String of Array representation of the dining options available at the travel plaza.
     * @param diningOptions An array of Strings containing the dining options to set.
     */
    public void setDiningOptions(String[] diningOptions) {
        this.diningOptions = diningOptions;
    }

    /**
     * Returns a String of Array representation of the shopping options available at the travel plaza.
     * @return An array of Strings containing the shopping options.
     */
    public String[] getShoppingOptions() {
        return shoppingOptions;
    }

    /**
     * Sets a String of Array representation of the shopping options available at the travel plaza.
     * @param shoppingOptions An array of Strings containing the shopping options to set.
     */
    public void setShoppingOptions(String[] shoppingOptions) {
        this.shoppingOptions = shoppingOptions;
    }

    /**
     * Checks if fuel services are available at the travel plaza as a boolean value.
     * @return True if fuel services are available, false otherwise.
     */
    public boolean hasFuel() {
        return fuel;
    }

    /**
     * Sets whether fuel services are available at the travel plaza as a boolean value.
     * @param fuel True if fuel services are available, false otherwise.
     */
    public void setFuel(boolean fuel) {
        this.fuel = fuel;
    }
    
    /**
     * Joins an array of strings into a single String with elements separated by commas.
     * @param building The Array of Strings to join.
     * @return A String representation of the joined elements.
     */
    private String stringOfBuildings(String[] building){
        return String.join(", ", building);
    }

    /**
     * Returns a String representation of the TravelPlaza object.
     * @return A String containing information about TravelPlaza object.
     */
    @Override
    public String toString(){
        return "The restaurants located at the travel plaza are: " + stringOfBuildings(diningOptions) + "." + "\n" + 
               "The stores located at the travel plaza are: " + stringOfBuildings(shoppingOptions) + "." + "\n" +
               "Plaza offers fuel services?: " + fuel + ".";
    }
}