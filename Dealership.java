/*
Project: Team Project Design: Car Dealership Create the Java Classes
Purpose Details: Sales Lead Java Class
Course: IST 242
Team:  4
Date Developed: 02/17/2019
Last Date Changed: 02/17/2019
Rev:
*/

public class Dealership {
    //---- Data Members ----//

    //System
    public static void SystemIntegration();

    //Inventory
    public int VINNumber;
    public String VehicleType;
    public int Milage;
    public float Price;

    //Location
    public String Address;
    public String Hours;
    public String PhoneNumber;

    //Customer
    private String Name;
    private String Number;
    private String Address;
    private String Email;

    //Accounting
    private int Associate;
    public String Name;
    public String Number;
    public String Email;
    private String CustomerFinancingInfo;

    //Sale
    private int SalesAssociates;
    public String Name;
    public String Number;
    public String Email;


    //---- Method Members ----//

    //--Cars--//
    //Setter and Getter for Sedan
    public int get(VINNumber) { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Trucks
    public int get(VINNumber) { return Trucks; }
    public void set(int _) {this.Trucks = _;}
    //Setter and Getter for Vans
    public int get(VINNumber) { return Vans; }
    public void set(int _) {this.Vans = _;}
    //Setter and Getter for Hybrid
    public int get(VINNumber) { return Hybrid; }
    public void set(int _) {this.Hybrid = _;}
    //Setter and Getter for Sport
    public int get(VINNumber) { return Sport; }
    public void set(int _) {this.Sport = _;}

    //--Cars--//
    //Setter and Getter for Sedan
    public int get(VehicleType) { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Trucks
    public int get(VehicleType) { return Trucks; }
    public void set(int _) {this.Trucks = _;}
    //Setter and Getter for Vans
    public int get(VehicleType) { return Vans; }
    public void set(int _) {this.Vans = _;}
    //Setter and Getter for Hybrid
    public int get(VehicleType) { return Hybrid; }
    public void set(int _) {this.Hybrid = _;}
    //Setter and Getter for Sport
    public int get(VehicleType) { return Sport; }
    public void set(int _) {this.Sport = _;}

    //--Cars--//
    //Setter and Getter for Sedan
    public int get(Milage) { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Trucks
    public int get(Milage) { return Trucks; }
    public void set(int _) {this.Trucks = _;}
    //Setter and Getter for Vans
    public int get(Milage) { return Vans; }
    public void set(int _) {this.Vans = _;}
    //Setter and Getter for Hybrid
    public int get(Milage) { return Hybrid; }
    public void set(int _) {this.Hybrid = _;}
    //Setter and Getter for Sport
    public int get(Milage) { return Sport; }
    public void set(int _) {this.Sport = _;}

    //--Cars--//
    //Setter and Getter for Sedan
    public int get(Price) { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Trucks
    public int get(Price) { return Trucks; }
    public void set(int _) {this.Trucks = _;}
    //Setter and Getter for Vans
    public int get(Price) { return Vans; }
    public void set(int _) {this.Vans = _;}
    //Setter and Getter for Hybrid
    public int get(Price) { return Hybrid; }
    public void set(int _) {this.Hybrid = _;}
    //Setter and Getter for Sport
    public int get(Price) { return Sport; }
    public void set(int _) {this.Sport = _;}

    //Arguments
    public static void main(int[] args) {
        //--Cars--//
        Inventory s1 = new Inventory();
        s1.setSedan(1);
        System.out.println(s1.getSedan());

        Inventory s2 = new Inventory();
        s2.setTrucks(1);
        System.out.println(s2.getTrucks());

        Inventory s3 = new Inventory();
        s3.setVans(1);
        System.out.println(s3.getVans());

        Inventory s4 = new Inventory();
        s4.setHybrid(1);
        System.out.println(s4.getHybrid());

        Inventory s5 = new Inventory();
        s5.setSport(1);
        System.out.println(s5.getSport());



    }
}
