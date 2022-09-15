package a1st10226868;
import java.util.Scanner;

public class RegisterProduct {
  
static ReportData newReport;

public static void main(String[] args) {
// obj for reading input
Scanner in = new Scanner(System.in);
// obj for ReportData
newReport = new ReportData();

while (true) {
showWelcomeMessage();
String choice = in.nextLine();
if (!choice.equals("1")) {
break;
}
//loop for menu
while (true) {
showMenu();
choice = in.nextLine();
if(choice.equals("6"))
break;
switch(choice){
case "1":
newReport.addProduct(in);//to add the products
break;
case "2":
Product p = newReport.SearchProduct(in);//to search the products
if( p!= null)
System.out.println(p);
else
System.out.println("The product cannot be located. Invalid product.");
break;
case "3":
newReport.UpdateProduct(in);//to update the products
break;
case "4":
newReport.DeleteProduct(in);//to delete the products
break;
case "5":
newReport.ReportData();//to print the products
break;
default:
System.out.println("Invalid entry. Please try again.");
}
}
}
}

//displaying the welcoming message
private static void showWelcomeMessage() {
System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
System.out.println("**************************************");
System.out.println("Enter (1) to launch menu or any other key to exit");
}

//displaying the option menu
private static void showMenu() {
System.out.println("\nPlease select one of the menu item: ");
System.out.println("(1). Capture a new product");
System.out.println("(2). Search for a product");
System.out.println("(3). Update a product");
System.out.println("(4). Delete a product");
System.out.println("(5). Print report data");
System.out.println("(6). Exit application");
}
}