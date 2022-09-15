package ST10226868;

import java.util.Scanner;

class PreOwnedCarDealership {
//this is a business problem 
    //in which it has been programmed to print out all of the pre-owned cars 
//by their brand, make, colour and price in the dealership or just show the cars of a particular brand
    public static void main(String[] args) {
        //An array to store and display the data of cars available for sale
    String[][] cars_for_sale = {
     {"Toyota", " Camry", " Sedan", "2019","Grey","R90 000"},
     {"Toyota", "Corolla", "SUV ", "2017", "Red","R114 000"},
     {"VolksWagen","Golf ", " Convertible"," 2020","Black","R140 000"},
     {"VolksWagen","Polo Vivo ", "Hatch"," 2016","Blue","R125 000"},
     {"Ford","Everest","Convertible"," 2019", "Orange"," R175 000"},
     {"Ford","Ranger","Stormtrak"," 2017", "White"," R117 000"},
     {"Mercedes","C-Class","Sedan","2018","White","R111 599"},
     {"Mercedes","E-Class","Coup","2020","Grey","R115 099"}
     };
  System.out.println("Welcome to T.Shbalala's Pre-Owned Car Delearship");
  System.out.println("View our stock of cars");
  System.out.println("1.View all the cars");
  System.out.println("2.View cars by make");
  System.out.print("Enter your option: ");
      Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option == 1)
        {
   for(int i = 0; i<cars_for_sale.length;i++)
          {
      System.out.print(i+1);
      Car elantraSedan = new Car(cars_for_sale[i][0],cars_for_sale[i][4],
         cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); 
            elantraSedan.carDetails(); //calling the method to print all car details
          }
        }
        else if(option==2)
        {
     System.out.println("1.View all Toyota cars");
     System.out.println("2.View all Ford cars");
     System.out.println("3.View all Volkswagen cars");
      System.out.println("4.View all Mercedes cars");
     System.out.print("Enter you option: ");
          int myoption = sc.nextInt();
         if(myoption == 1)
         {  int count = 1;
         for(int i = 0; i<cars_for_sale.length;i++)
          {
          if(cars_for_sale[i][0] == "Toyota") //selction for Toyota
          {
              System.out.print(count);
                Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                    cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); 
                      elantraSedan.carDetails(); //calling the method to print Toyota details
                        count = count +1;
       }
       }
       }
       else if(myoption == 2)
       {
      int count = 1;
      for(int i = 0; i<cars_for_sale.length;i++)
                {
       if(cars_for_sale[i][0] == "VolksWagen") //slection for VolksWagen
       {
             System.out.print(count);
              Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
                 cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); 
                    elantraSedan.carDetails(); //calling the method to print VolksWagen details
                      count = count +1;
       }
       }
       }
        else if(myoption == 3)
        {
        int count = 1;
         for(int i = 0; i<cars_for_sale.length;i++)
      {
       if(cars_for_sale[i][0] == "Ford")//selection for Ford
       {
        System.out.print(count);
          Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
            cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); 
              elantraSedan.carDetails(); //calling the method to print Ford details
                count = count +1;
        }
       
        }
        }
         else if(myoption == 4)
        {
        int count = 1;
         for(int i = 0; i<cars_for_sale.length;i++)
      {
       if(cars_for_sale[i][0] == "Mercedes")//selection for Mercedes
       {
        System.out.print(count);
          Car elantraSedan = new Car(cars_for_sale[i][0], cars_for_sale[i][4],
            cars_for_sale[i][3], cars_for_sale[i][1], cars_for_sale[i][2], cars_for_sale[i][5]); 
              elantraSedan.carDetails(); //calling the method to print Mercedes details
                count = count +1;
       }
      }
        }
      
          else
        {
          System.out.println("Invalid option, please try again");
        }
        }
        }
        }


