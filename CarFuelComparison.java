public class CarFuelComparison {
    
        String Car;
        double Fuel;
    
        public String getCarBrand(){
            return Car;
        }
        public void setCarBrand(String Car){
            this.Car = Car;
        }
    
        public double getFuelUsage(){
            return Fuel;
        }
        public void setFuelUsage(double Fuel){
            this.Fuel = Fuel;
        }
    
     public static void main(String[] args){
    
        CarFuelComparison carUsage = new CarFuelComparison();
        
        String[][] Car = {{"Perodua Myvi"},{"Perodua Kenari"},{"Perodua Kelisa"},
                          {"Proton X70"},{"Proton Exora"},{"Proton Iriz"},
                          {"Volkswagen Scirocco"},{"Volkswagen Beetle"},{"Volkswagen Polo"}
        }; 

        double[][] Fuel = {{0.05},{0.033},{0.04},
        {0.078},{0.076},{0.069},
        {0.071},{0.067},{0.056}
        };
    
        for(int row = 0; row < Car.length; row++){
            for(int col = 0; col < Car[row].length; col++){
                carUsage.setCarBrand(Car[row][col]);
                carUsage.setFuelUsage(Fuel[row][col]);
                System.out.println("The " + carUsage.getCarBrand() + " uses " + carUsage.getFuelUsage() + " liters per kilometer.");
            }
        }
     }  
 
}
