package PersonalPractice;

public class ElectricGuitar {

    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    public ElectricGuitar(String aBrand, int num, boolean yesOrNO) {
        this.brand = aBrand;
        this.numOfPickups = num;
        this.rockStarUsesIt = yesOrNO;
    }

   String getBrand() {
       return this.brand;
   }

   void setBrand(String aBrand) {
       this.brand = aBrand;
   }

   int getNumOfPickups() {
       return this.numOfPickups;
   }

   void setNumOfPickups(int num) {
       this.numOfPickups = num;
   }

   boolean getRockStarUsesIt() {
       return this.rockStarUsesIt;
   }

   void setRockStarUsesIt(boolean yesOrNo) {
       this.rockStarUsesIt = yesOrNo;
   }

}
