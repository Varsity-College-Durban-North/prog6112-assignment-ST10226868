package ST10226868;
//this calss has been extended 
class Car extends Vehicle {
 private String bodyStyle;
 private String price;
  public Car(String make, String color, String year, String model, String bodyStyle,  String price) {
      super(make, color, year, model);  //calling from superclass constructor
      this.bodyStyle = bodyStyle;
      this.price = price;
    }
    public void carDetails() {  //details of the cars
      printDetails();         //calling method from parent class
      System.out.println("\t\tBody Style: " + bodyStyle);
      System.out.println("\t\tPrice: " + price);
    }

}

