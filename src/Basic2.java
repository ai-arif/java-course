public class Basic2 {
    public static void main(String[] args) {
        //Control Statement

        //if-else

        int score = 85;
        if(score >= 90){
            System.out.println("Excellent");
        }else if(score >= 80){
            System.out.println("Good");
        }else if(score >= 70){
            System.out.println("Average");
        }else{
            System.out.println("Poor");
        }

        //switch statement

        int day = 3;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        //Loops

        //for loop
        for(int i = 0; i<5; i++){
            System.out.println(i);
        }

        //while loop
        int j = 0;
        while(j<5){
            System.out.println(j);
            j++;
        }

        //do-while loop
        int k = 0;
        do{
            System.out.println(k);
            k++;
        }while(k<5);














    }
}
