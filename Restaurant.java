/*
 * Program Name: Restaurant.java
 * Description: This class represents a restaurant franchise, which is a specific type of business. 
 * It inherits attributes and behaviors from the Business class and extends it to include additional 
 * features specific to restaurants, such as drive-thru availability, mobile ordering, list of meals served, restaurant rating, and number of seats.
 */
public class Restaurant extends Business {
    // Intialize variables.
    private boolean driveThru;
    private boolean mobileOrdering;
    private String[] lisMeals;
    private int rating;
    private int numSeats;

    /**
     * Creates a new instance of the Restaurant class with the provided parameters.
     * @param registrationNumber The business' registration number as an integer.
     * @param owner The franchise owner's name as an object.
     * @param year The year the business was established as an integer.
     * @param dailySales The average dollar amount of daily sales at the business as a double.
     * @param annualSales The average dollar amount of annual sales at the business as a double.
     * @param driveThru Whether the restaurant has a drive-thru or not as a boolean.
     * @param mobileOrdering Whether the restaurant offers mobile ordering or not as a boolean.
     * @param listMeals The Array of meals served at the restaurant.
     * @param rating The restaurant's rating as an integer from 1 to 5.
     * @param numSeats The number of seats available in the restaurant as an integer greater 0.
     * @throws IllegalBusiness If any of the provided parameters are invalid or out of range.
     */
    public Restaurant(int registrationNumber, FranchiseOwner owner, int year, double dailySales, double annualSales, boolean driveThru, boolean mobileOrdering, String[] listMeals, int rating, int numSeats) throws IllegalBusiness{
        // Invoking the constructor of the Business class.
        super(registrationNumber, owner, year, dailySales, annualSales);
        setDriveThru(driveThru);
        setMobileOrdering(mobileOrdering);
        setListMeals(listMeals);
        setRating(rating);
        setNumSeats(numSeats);
    }

    /**
     * Checks if the restaurant has a drive-thru.
     * @return True if the restaurant has a drive-thru, false otherwise.
     */
    public boolean hasDriveThru() {
        return driveThru;
    }

    /**
     * Sets whether the restaurant has a drive-thru or not.
     * @param driveThru True if the restaurant has a drive-thru, false otherwise.
     */
    public void setDriveThru(boolean driveThru) {
        this.driveThru = driveThru;
    }

    /**
     * Checks if the restaurant offers mobile ordering.
     * @return True if mobile ordering is available, false otherwise.
     */
    public boolean hasMobileOrdering() {
        return mobileOrdering;
    }

    /**
     * Sets whether the restaurant offers mobile ordering or not.
     * @param mobileOrdering True if mobile ordering is available, false otherwise.
     */
    public void setMobileOrdering(boolean mobileOrdering) {
        this.mobileOrdering = mobileOrdering;
    }

    /**
     * Returns the list of meals served at the restaurant.
     * @return An array of Strings containing the list of meals.
     */
    public String[] getListMeals() {
        return lisMeals;
    }

    /**
     * Sets the list of meals served at the restaurant.
     * @param listMeals The list of meals to set.
     */
    public void setListMeals(String[] listMeals) {
        this.lisMeals = listMeals;
    }

    /**
     * Returns an integer representation of the restaurant's rating.
     * @return The restaurant's rating as an integer from 1 to 5.
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets an integer representation of the restaurant's rating.
     * @param rating The restaurant's rating as an integer from 1 to 5.
     * @throws IllegalBusiness If the rating value is not within the valid range (1 to 5).
     */
    public void setRating(int rating) throws IllegalBusiness{
        // Check if user's input is valid.
        if(rating < 1 || rating > 5){
            throw new IllegalBusiness("Invalid rating entered. A rating must be an integer from 1 to 5.");
        } else {
            this.rating = rating;
        }
    }

    /**
     * Returns an integer representation of the number of seats available in the restaurant.
     * @return The number of seats available in the restaurant as an integer greater 0.
     */
    public int getNumSeats() {
        return numSeats;
    }

    /**
     * Sets an integer representation of the number of seats available in the restaurant.
     * @param numSeats The number of seats available in the restaurant as an integer greater 0.
     * @throws IllegalBusiness If the numSeats value is less than 1.
     */
    public void setNumSeats(int numSeats) throws IllegalBusiness{
        // Check if user's input is valid.
        if(numSeats < 1){
            throw new IllegalBusiness("Invalid integer entered. There must be at least one seat in the restaurant.");
        } else{
            this.numSeats = numSeats;
        }
    }

    /**
     * Joins an array of strings into a single String with elements separated by commas.
     * @param restaurant The Array of Strings to join.
     * @return A String representation of the joined elements.
     */
    private String stringOfRestaurant(String[] restaurant){
        return String.join(", ", restaurant);
    }

    /**
     * Returns a String representation of the Restaurant object.
     * @return A String containing information about Restaurant object.
     */
    @Override
    public String toString(){
        return "Drive-thru Available?: " + driveThru + "." + "\n" + 
               "Mobile Ordering Available?: " + mobileOrdering + "." + "\n"+ 
               "List of Entrees Served at The Restaurant: " + stringOfRestaurant(lisMeals)+ "." + "\n" + 
               "Restaurant Rating: " + rating + "." + "\n" + 
               "Number of Seats at Restaurants: " + numSeats + ".";
    }

}
