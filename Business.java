/*
 * Program Name: Business.java
 * Description: This class represents a business franchise and stores information such as registration number, franchise owner, year of establishment, daily sales, and annual sales. 
 */
public class Business {
    // Intialize variables.
    private int registrationNumber;
    private FranchiseOwner owner;
    private int year;
    private double dailySales;
    private double annualSales;

    /**
     * Creates a new instance of the Business class with the provided parameters.
     * @param registrationNumber The business' registration number as an integer.
     * @param owner The franchise owner's name as an object.
     * @param year The year the business was established as an integer.
     * @param dailySales The average dollar amount of daily sales at the business as a double greater than 0.
     * @param annualSales The average dollar amount of annual sales at the business as a double greater than 0.
     * @throws IllegalBusiness If any of the provided parameters are invalid or out of range.
     */
    public Business(int registrationNumber, FranchiseOwner owner, int year, double dailySales, double annualSales) throws IllegalBusiness{
        setRegistrationNumber(registrationNumber);
        setOwner(owner);
        setYear(year);
        setDailySales(dailySales);
        setAnnualSales(annualSales);
    }

    /**
     * Returns an integer representation of the registration number of the business.
     * @return The registration number as an integer.
     */
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets an integer representation of the registration number of the business.
     * @param registrationNumber The registration number to set.
     */
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Returns information about the franchise owner.
     * @return The franchise owner as an object.
     */
    public String getOwner() {
        return owner.getName();
    }

    /**
     * Sets a FranchiseOwner object for the business.
     * @param owner The franchise owner to set.
     */
    public void setOwner(FranchiseOwner owner) {
        this.owner = owner;
    }

    /**
     * Returns an integer representation of the year of establishment.
     * @return The year of establishment as an integer.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets an integer representation of the establishment year of the business.
     * @param year The establishment year to set.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns a double representation of the the daily sales of the business.
     * @return The daily sales as a double.
     */
    public double getDailySales() {
        return dailySales;
    }

    /**
     * Sets a double representation of the daily sales of the business.
     * @param dailySales The average dollar amount of daily sales at the business as a double.
     * @throws IllegalBusiness If the daily sales value is less than zero.
     */
    public void setDailySales(double dailySales) throws IllegalBusiness{
        // Check if user's input is valid.
        if (dailySales < 0){
            throw new IllegalBusiness("Invalid number entered. Daily sales cannot be less than zero.");
        } else{
            this.dailySales = dailySales;
        }
    }

    /**
     * Returns a double representation of the annual sales of the business.
     * @return The annual sales as a double.
     */
    public double getAnnualSales() {
        return annualSales;
    }

    /**
     * Sets a double representation of the annual sales of the business.
     * @param annualSales The average dollar amount of annual sales at the business as a double.
     * @throws IllegalBusiness If the annual sales value is less than zero.
     */
    public void setAnnualSales(double annualSales) throws IllegalBusiness{
        // Check if user's input is valid.
        if(annualSales < 0){
            throw new IllegalBusiness("Invalid number entered. Annual sales cannot be less than zero.");
        } else {
            this.annualSales = annualSales;
        }
    }

    /**
     * Returns a String representation of the Business object.
     * @return A String containing information about Business object.
     */
    @Override
    public String toString(){
        return owner.getName() + " has been a proud owner of franchise #" + registrationNumber + " for " + year + " years, making $" + dailySales + "/day and $" + annualSales + "/year.";
    }

}
