/*
 * Program Name: FranchiseOwner.java
 * Description: This class represents a Franchise Owner and stores information such as the owner's name, age, and years of experience in the business industry. 
 */
public class FranchiseOwner {
    // Intialize variables.
    private String name;
    private int age;
    private int businessYears;

    /**
     * Creates a new instance of the FranchiseOwner class with the provided parameters.
     * @param name The name of a franchise owner as a String.
     * @param age The age of the franchise owner as an integer greater or equal to 18.
     * @param businessYears The number of years that the FranchiseOwner has worked in the industry as an integer less than 110.
     * @throws IllegalBusiness If any of the provided parameters are invalid or out of range.
     */
    public FranchiseOwner(String name, int age, int businessYears) throws IllegalBusiness{
        setName(name);
        setAge(age);
        setBusinessYears(businessYears);
    }

    /**
     * Returns a String representation of the name of the franchise owner.
     * @return The name of a franchise owner as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets an String representation of the name of the franchise owner.
     * @param name The name of a franchise owner as a String.
     */
    public void setName(String name) throws IllegalBusiness{
        this.name = name;
    }

    /**
     * Returns an integer representation of the age of the franchise owner.
     * @return The age of the franchise owner as an integer.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets an integer representation of the age of the franchise owner.
     * @param age The age of the franchise owner as an integer.
     * @throws IllegalBusiness If the age is less than 18.
     */
    public void setAge(int age) throws IllegalBusiness{
        // Check if user's input is valid.
        if(age < 18){
            throw new IllegalBusiness("Invalid integer entered. You must 18 or older to be a franchise owner.");
        } else{
            this.age = age;
        }
    }

    /**
     * Returns an integer representation of the number of years of experience in the business industry.
     * @return The number of years that the FranchiseOwner has worked in the industry as an integer.
     */
    public int getBusinessYears() {
        return businessYears;
    }

    /**
     * Sets an integer representation of the number of years of experience in the business industry.
     * @param businessYears The number of years that the FranchiseOwner has worked in the industry as an integer.
     * @throws IllegalBusiness If the businessYears value is greater than 110.
     */
    public void setBusinessYears(int businessYears) throws IllegalBusiness{
        // Check if user's input is valid.
        if(businessYears > 110){
            throw new IllegalBusiness("Invalid integer enetered. It is impossible to work more than 110 years in this industry.");
        } else{
            this.businessYears = businessYears;
        }
    }

    /**
     * Returns a String representation of the FranchiseOwner object.
     * @return A String containing information about the franchise owner's name, age, and years of experience in the business industry.
     */
    @Override
    public String toString(){
        return name + " is a " + age + " year old franchise owner with " + businessYears + " years of experience.";
    }
}
