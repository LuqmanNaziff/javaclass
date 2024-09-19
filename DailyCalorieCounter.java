public class DailyCalorieCounter {

    public static void main(String[] args) {
        String dayName;
        int calories;


        for (int i = 100; i<=700; i=i+100){
            if (i==100) {
                calories = 1700;
            }else if (i==200){
                calories = 1700;
            }else {
                calories = 1700+i;
            }

            switch(i){
                case 100:
                    dayName = "Monday";
                    //calories = 1000;
                    break;
                case 200:
                    dayName = "Tuesday";
                    //calories = 1000;
                    break;
                case 300:
                    dayName = "Wednesday";
                    //calories = 2200;
                    break;
                case 400:
                    dayName = "Thursday";
                    //calories = 2300;
                    break;
                case 500:
                    dayName = "Friday";
                    //calories = 2350;
                    break;
                case 600:
                    dayName = "Saturday";
                    //calories = 2400;
                    break;
                case 700:
                    dayName = "Sunday";
                    //calories = 1800;
                    break;
    
                default:
                    dayName = "Invalid Value";
                    //calories = 2200;
                    break;
            }


    
            System.out.println(dayName + " " + calories );
        }


        }
}
