/*
 * Program Name: DriverClass.java
 * Student Name: Anneth Sivakumar
 * Student Number: 20320973
 * Date: August 01, 2023
 * Description: This is the main driver class that demonstrates the use of the classes and their functionalities in the business management system.
 */

public class DriverClass {
    /**
     * This method serves as the main function to test the business management system.
     * @param args Command-line arguments which are not used in this program
     * @throws IllegalBusiness If there is an issue with business-related data, such as invalid values.
     */
    public static void main(String[] args) throws IllegalBusiness{
        // TESTING NOTE: TESTING GETTERS IS NOT NECESSARY IF I AM ABLE TO CREATE AN OBJECT.
        // Create instances of the owner.
        FranchiseOwner owner1 = new FranchiseOwner("Anneth", 33, 10);
        FranchiseOwner owner2 = new FranchiseOwner("Haris", 22, 5);
        // Check to see if custom Exceptions works.
        // FranchiseOwner owner3 = new FranchiseOwner("Mason", 15, 18); //Exception Works!
        // FranchiseOwner owner4 = new FranchiseOwner("Connor", 20, 120); //Exception Works!

        Business business1 = new Business(101, owner1, 2000, 1000.0, 500000.0);
        // Check to see if custom Exceptions works.
        // Business business2 = new Business(102, owner1, 1988, 0, 10000.0); //Exception Works!
        // Business business3 = new Business(103, owner1, 1988, 12000, 0); //Exception Works!

        String[] meals = { "Burger", "Pizza", "Salad"};
        Restaurant restaurant1 = new Restaurant(104, owner1, 2005, 2000.0, 800000.0, true, true, meals, 4, 1);
        // Check to see if custom Exceptions works.
        // Restaurant restaurant2 = new Restaurant(105, owner1, 2005, 2000.0, 800000.0, true, true, meals, 8, 1); //Exception Works!
        // Restaurant restaurant3 = new Restaurant(106, owner1, 2005, 2000.0, 800000.0, true, true, meals, 2, 0); //Exception Works!

        String[] departments = { "Grocery", "Bakery", "Deli"};
        Supermarket supermarket1 = new Supermarket(105, owner2, 2010, 3000.0, 1000000.0, 5000, 5, departments);
        // Check to see if custom Exceptions works.
        // Supermarket supermarket2 = new Supermarket(106, owner2, 2011, 3000.0, 1000000.0, -1, 5, departments); //Exception Works!
        // Supermarket supermarket3 = new Supermarket(106, owner2, 2012, 3000.0, 1000000.0, 1025, -1, departments); //Exception Works!

        String[] diningOptions = { "Restaurant A", "Restaurant B"};
        String[] shoppingOptions = { "Store A", "Store B" };
        TravelPlaza travelPlaza1 = new TravelPlaza(106, owner2, 2015, 4000.0, 1200000.0, diningOptions, shoppingOptions, true);
        // Check to see if custom Exceptions works.
        // TravelPlaza travelPlaza2 = new TravelPlaza(107, owner2, 2022, 4000.0, 1200000.0, diningOptions, shoppingOptions, true);
        // TravelPlaza travelPlaza3 = new TravelPlaza(108, owner2, 2025, 4000.0, 1200000.0, diningOptions, shoppingOptions, true);

        // Create a registry and add businesses to it.
        Registry registry = new Registry();
        registry.addBusiness(business1);
        //registry.addBusiness(business2);
        registry.addBusiness(restaurant1);
        registry.addBusiness(supermarket1);
        registry.addBusiness(travelPlaza1);
        // Print information about each business.
        System.out.println("----------------------------------------");
        registry.printRegistry();
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------" + "\n");
        // Test toStrings of child classes.
        System.out.println(business1);
        System.out.println("----------------------------------------");
        System.out.println(restaurant1);
        System.out.println("----------------------------------------");
        System.out.println(supermarket1);
        System.out.println("----------------------------------------");
        System.out.println(travelPlaza1);
        System.out.println("\n" + "----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------" + "\n");
        // Test getter methods.
        System.out.println(business1.getRegistrationNumber());
        System.out.println(business1.getOwner());
        System.out.println(business1.getYear());
        System.out.println(business1.getDailySales());
        System.out.println(business1.getAnnualSales());
        System.out.println("----------------------------------------");
        System.out.println(restaurant1.hasDriveThru());
        System.out.println(restaurant1.hasMobileOrdering());
        String[] lst1 = restaurant1.getListMeals();
        for(String items : lst1) {
            System.out.println(items);
        }
        System.out.println(restaurant1.getRating());
        System.out.println(restaurant1.getNumSeats());
        System.out.println("----------------------------------------");
        System.out.println(supermarket1.getNumProducts());
        System.out.println(supermarket1.getLoyaltyUsers());
        System.out.println(supermarket1);
        String[] lst2 = supermarket1.getListDepartments();
        for(String items : lst2) {
            System.out.println(items);
        }
        System.out.println("----------------------------------------");
        String[] lst3 = travelPlaza1.getDiningOptions();
        for(String items : lst3) {
            System.out.println(items);
        }
        System.out.println("--------");
        String[] lst4 = travelPlaza1.getShoppingOptions();
        for(String items : lst4) {
            System.out.println(items);
        }
        System.out.println(travelPlaza1.hasFuel());
        System.out.println("----------------------------------------");
        // Test averageDailySales and averageYearlySales method of the registry class.
        System.out.println("Average Daily Sales of Registry: $" + registry.averageDailySales());
        System.out.println("Average Yearly Sales of Registry: $" + registry.averageYearlySales());
        System.out.println("----------------------------------------");
    } 
}