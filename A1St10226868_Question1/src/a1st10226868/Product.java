package a1st10226868;
public class Product {
private String productCode;
private String productName;
private String category;
private String warranty;
private double price;
private int level;
private String supplier;

public Product() {
this.warranty = "2 years"; // this will indicate if the warranty should be for 2 years
}
public void setProductCode(String productCode) {
this.productCode = productCode;
}
public String getProductCode() {
return productCode;  
}

public void setProductName(String productName) {
this.productName = productName;
}
public String getProductName() {
return productName;
}

public void setCategory(String category) {
this.category = category;
}
public String getCategory() {
return category;
}

public void setWarranty(String warranty) {
if(warranty.equals("1"))
this.warranty = "6 months";// this will indicate if the warrenty should be for 6 months
}
public String getWarranty() {
return warranty;
}


public void setPrice(double price) {
this.price = price;
}
public double getPrice() {
return price;
}

public void setLevel(int level) {
this.level = level;
}
public int getLevel() {
return level;
}


public void setSupplier(String supplier) {
this.supplier = supplier;
}
public String getSupplier() {
return supplier;
}

@Override
public String toString() {
return "PRODUCT CODE >> \t" + productCode + "\nPRODUCT NAME >> \t" + productName + "\nPRODUCT CATEGORY >> \t" + category + "\nPRODUCT WARRANTY >> \t"
+ warranty + "\nPRODUCT PRICE >> \t" + price + "\nPRODUCT LEVEL >> \t" + level + "\nPRODUCT SUPPLIER >> \t" + supplier ;
}
      
}



