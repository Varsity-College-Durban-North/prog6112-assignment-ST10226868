
package ST10226868;
class Vehicle {

    // this method will show the make,colour,year and model of a car
    private String make;
    private String color;
    private String year;
    private String model;
   //Constructor for the vehicles
    public Vehicle(String make, String color, String year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }
     // this will print the details of a car
    public void printDetails() {
        System.out.println("\t\tManufacturer: " + make);
        System.out.println("\t\tModel: " + model);
        System.out.println("\t\tColor: " + color);
        System.out.println("\t\tYear: " + year);

    }

}