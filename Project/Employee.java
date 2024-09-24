public class Employee {
    String name;
    double baseSalary = 0;
    double healthAllowance = 0;
    double transportAllowance = 0;
    double bonus = 0;
    double totalSalary = 0;
    double totalBonus = 0;
    double actualSalary = 0;
    
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = 5000;
        this.transportAllowance = 300;
        this.bonus = assignBonus();
        this.actualSalary = calculateTotalSalary();


    }

    public String getName(){
        return name;
    }
// else if it is 
    public double assignBonus(){          
            if(baseSalary >= 50000){
                bonus = 10.0;
                
                // return bonus;
            }else if(baseSalary >= 30000){
                bonus = 5.0;
                
                // return bonus;
            }else{
                bonus = 0.0;
                // return bonus;
        }
        totalBonus = (baseSalary * bonus / 100); 
        return totalBonus;
    }

    public double calculateTotalSalary(){
        totalSalary = baseSalary + healthAllowance + transportAllowance + totalBonus;
        return totalSalary;
    }
    

    public void displayDetails(){
        System.out.println("name is: " + name);
        System.out.println("Base Salary is : " + baseSalary);
        System.out.println("Health Allowance is : " + healthAllowance);
        System.out.println("Transport Allowance is : " + transportAllowance);
        System.out.println("Total Salary: " + actualSalary);
    }


}
