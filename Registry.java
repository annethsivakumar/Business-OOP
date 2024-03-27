/*
 * Program Name: Registry.java
 * Student Name: Anneth Sivakumar
 * Student Number: 20320973
 * Date: August 01, 2023
 * Description: This class represents a registry that holds a collection of business objects.
 * It provides methods to add businesses to the registry, print information about the businesses in the registry, 
 * and calculate the average daily sales and average yearly sales of all the businesses in the registry.
 */
import java.util.ArrayList;

public class Registry {
    // Intialize variables.
    private ArrayList<Business> businessCollection;

    /**
     * Creates a new instance of the Registry class.
     */
    public Registry() {
        businessCollection = new ArrayList<>();
    }
    
    /**
     * Adds a Business object to the registry.
     * @param business The Business object to be added to the registry.
     */
    public void addBusiness(Business business) {
        businessCollection.add(business);
    }

    /**
     * Prints information about the businesses in the registry. 
     * The information includes registration number, owner, year, daily sales, and annual sales for each business.
     */
    public void printRegistry() {
        // Loop through Registry and print information about businesses in the registry.
        for (Business business : businessCollection) {
            System.out.println("Registration Number: " + business.getRegistrationNumber());
            System.out.println("Owner: " + business.getOwner());
            System.out.println("Year: " + business.getYear());
            System.out.println("Daily Sales: " + business.getDailySales());
            System.out.println("Annual Sales: " + business.getAnnualSales());
            System.out.println();
        }
    }

    /**
     * Calculates a double representation of the average daily sales of all the businesses in the registry.
     * @return The average daily sales of all the businesses in the registry as a double value.
     */
    public double averageDailySales() {
        double sum = 0.0;
        for (Business business : businessCollection) {
            sum += business.getDailySales();
        }
        return sum / businessCollection.size();
    }

    /**
     * Calculates a double representation of the average annual sales of all the businesses in the registry.
     * @return The average annual sales of all the businesses in the registry as a double value.
     */
    public double averageYearlySales() {
        double sum = 0.0;
        for (Business business : businessCollection) {
            sum += business.getAnnualSales();
        }
        return sum / businessCollection.size();
    }
}