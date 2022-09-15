package a1st10226868;
import java.util.ArrayList;
import java.util.Scanner;

public class ReportData {


private ArrayList<Product> products ;

private String[] categories;

public ReportData() {
// array for product categories
this.categories = new String[] {"Desktop Computer", "Laptop", "Tablet", "Printer", "Gaming console"};
products = new ArrayList<>();
}
  
//method to add a new product to list
void addProduct(Scanner in) {
 Product newProduct = new Product();
System.out.println("CAPTURE A NEW PRODUCT");
System.out.println("**********************");
System.out.print("Enter the product code: ");
newProduct.setProductCode(in.nextLine());
System.out.print("Enter the product name: ");
newProduct.setProductName(in.nextLine());
System.out.println("Enter the product category: ");
int choice;
// loop for category selection
while (true) {
for (int i = 0; i < categories.length; i++) {
System.out.println(categories[i] + " - " + (i + 1));
}
System.out.print("Product category: ");
try{
choice = Integer.parseInt(in.nextLine());
if(choice>0 && choice<=categories.length)
break;
}
catch(NumberFormatException e){
System.out.println("Incorrect category selection..");
}
}
newProduct.setCategory(categories[choice-1]);
setWarranty(newProduct, in);
setPrice(newProduct, in);
setStockLevel(newProduct, in);
System.out.print("Enter supplier for "+newProduct.getProductName()+": ");
newProduct.setSupplier(in.nextLine());
products.add(newProduct);
System.out.println("Product details has been captured successfully!\n");
  
}

//method to set stock level of a product
private void setStockLevel(Product newProduct, Scanner in) throws NumberFormatException {
System.out.print("Enter stock level for "+newProduct.getProductName()+": ");
newProduct.setLevel(Integer.parseInt(in.nextLine()));
}

//method to set price of a product
private void setPrice(Product newProduct, Scanner in) throws NumberFormatException {
System.out.print("Enter price for "+newProduct.getProductName()+": ");
newProduct.setPrice(Double.parseDouble(in.nextLine()));
}

//method to set warranty of a product
private void setWarranty(Product newProduct, Scanner in) {
System.out.print("Indicate product warranty. Enter (1) for 6 months or any other keys for 2 years: ");
newProduct.setWarranty(in.nextLine());
}

// method to search a product in the products list
Product SearchProduct(Scanner in) {
System.out.println("Please enter the product code: ");
String prodCode = in.nextLine();
System.out.println("\nPRODUCT SEARCH RESULT");
System.out.println("***************************");
for(int i=0; i<products.size(); i++){
if(products.get(i).getProductCode().equals(prodCode)){
return products.get(i);
}
}
return null;
}
// method to update the details of a product
void UpdateProduct(Scanner in) {
Product p = SearchProduct(in);
if(p!=null){
System.out.print("Do you want to update the warranty? (y)yes (n)no: ");
String choice = in.nextLine();
if(choice.equalsIgnoreCase("y")){
setWarranty(p, in);
}
System.out.print("Do you want to update the price of the product? (y)yes (n)no: ");
choice = in.nextLine();
if(choice.equalsIgnoreCase("y")){
setPrice(p, in);
}
System.out.print("Do you want to update the stock level of the product? (y)yes (n)no: ");
choice = in.nextLine();
if(choice.equalsIgnoreCase("y")){
setStockLevel(p, in);
}
System.out.println("The product details has been updated successfully!!!");
}
else{
System.out.println("The product cannot be located. Invalid product.");
}
}

//method for deleting a product
void DeleteProduct(Scanner in) {
Product p = SearchProduct(in);
if(p!=null){
System.out.print("Do you want to delete "+p.getProductCode()+"? (y)yes (n)no: ");
String choice = in.nextLine();
if(choice.equalsIgnoreCase("y")){
products.remove(p);
System.out.println(p.getProductCode() +" deleted.");
}
  
}
else{
System.out.println("The product cannot be located. Invalid product.");
}
}

//displaying report
void ReportData() {
double total = 0;
System.out.println("PRODUCT REPORT");
System.out.println("*************************************************");
for(int i=0; i<products.size(); i++){
System.out.println("PRODUCT "+(i+1));
System.out.println("--------------------------------------------------");
System.out.println(products.get(i));
total += products.get(i).getPrice();
System.out.println("--------------------------------------------------");
}
System.out.println("TOTAL PRODUCT COUNT: "+products.size());
System.out.println("TOTAL PRODUCT VALUE: R "+total);
System.out.printf("TOTAL PRODUCT VALUE: R %.2f",total/products.size());
}

}

