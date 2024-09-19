public class CarFuelComparison {
    
        private String Car;
        private double Fuel;
    
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
    
        double[][] Fuel = new double[3][3];
        String[][] Car = new String[3][3];
    
        Car[0][0] = "Perodua Myvi"; Car[0][1] = "Perodua Kenari"; Car[0][2] = "Perodua Kelisa";
        Car[1][0] = "Proton X70"; Car[1][1] = "Proton Exora"; Car[1][2] = "Proton Iriz";
        Car[2][0] = "Volkswagen Scirocco"; Car[2][1] = "Volkswagen Beetle"; Car[2][2] = "Volkswagen Polo";
    
        Fuel[0][0] = 0.05; Fuel[0][1] = 0.033; Fuel[0][2] = 0.04;
        Fuel[1][0] = 0.078; Fuel[1][1] = 0.076; Fuel[1][2] = 0.069;
        Fuel[2][0] = 0.071; Fuel[2][1] = 0.067; Fuel[2][2] = 0.056;
    
        for(int row = 0; row < Car.length; row++){
            for(int col = 0; col < Car[row].length; col++){
                carUsage.setCarBrand(Car[row][col]);
                carUsage.setFuelUsage(Fuel[row][col]);
                System.out.println("The " + carUsage.getCarBrand() + " uses " + carUsage.getFuelUsage() + " liters per kilometer.");
            }
        }
     }  
    

    
}
