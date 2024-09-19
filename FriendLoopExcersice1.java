public class FriendLoopExcersice1 {
    public static void main(String[] args) {
        String Day = "";
        int increment = 100;
        int calories = 1700;

        for(int d = 1; d < 8; d++){
            switch(d){
                case 1:
                    Day = "Monday";
                    break;
                case 2:
                    Day = "Tuesday";
                    break;
                case 3:
                    Day = "Wednesday";
                    break;
                case 4:
                    Day = "Thursday";
                    break;
                case 5:
                    Day = "Friday";
                    break;
                case 6:
                    Day = "Saturday";
                    break;
                case 7:
                    Day = "Sunday";
                    break;
    
                default:
                    Day = "Invalid Value";
                    break;
            }
        }
    }
}
