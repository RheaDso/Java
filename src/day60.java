class Rent{
   int Rent_Amount;
   int Tax;
   int Total_rent;

   Rent() {

   }

   Rent(int RA, int T){
       Rent_Amount = RA;
       Tax = T;
       System.out.println("Total Rent is " + (Rent_Amount + Tax));
   }
}
class Owner extends Rent{
    int Amount;
    int Maintenance;

    Owner(int A, int M){
        Amount = A;
        Maintenance = M;

        System.out.println("Total Amount earned by the owner is " + (Amount - Maintenance));
    }
}
class Renter extends Rent {
    int Price;
    int Gas_Bill;
    int Electricity_Bill;
    int Total_Amt;

    Renter(int P, int GB, int EB) {
        Price = P;
        Gas_Bill = GB;
        Electricity_Bill = EB;
        System.out.println("The total rent to be paid is " +(Price+Gas_Bill+Electricity_Bill));
    }
}
public class day60 {

    public static void main(String[] args) {
        Rent R1 = new Rent(25000, 2000);
        Owner O1 = new Owner(25000, 5000);
        Renter R2 = new Renter(25000, 800, 2480);
    }
}
