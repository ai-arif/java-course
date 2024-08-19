import java.util.List;

public class Beginner {
    public static void main(String[] args) {
        //different data types with variable declared and initialization

        byte b; //variable declaration
        b = 5; //initialization

        short s = 10;
        int i = 200;
        long l = 10000;
        float f = 3.14f;
        double d = 3.14;
        char c = 'c';
        boolean bool = true;
        String string = "hello";

        //To print out anything, following code get used
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(string);

        //Control Structures
        //if-else

        int count = 5;

        if(count > 2){
            System.out.println("Count is greater than 2");
        }else {
            System.out.println("Count is less than or equal to 2");
        }

        //Ternary Operator
        //We can use a ternary operator as a shorthand expression that works like an if/else statement.

        System.out.println(count > 2 ? "Count is greater than 2" : "Count is less than or equal to 2");

        //Switch Case
        //Switch case is used to execute one of the many blocks of code.

        int count2 = 3;
        switch(count){
            case 0:
                System.out.println("Count is 0");
                break;
            case 1:
                System.out.println("Count is 1");
                break;
            case 2:
                System.out.println("Count is 2");
                break;
            default:
        }

        //Loops
        //For Loop
        for(int j = 0; j < 5; j++){
            System.out.println(j);
        }

        //Break - We need to use break to exit early from a loop.
        List<String> names = getNameList();
        String name = "AI Arif";
//        int index = 0;
//
//        for( ; index < names.length; index++){
//            if(names.get(index).equals(name)){
//                break;
//            }
//        }



    }

    private static List<String> getNameList() {
        return List.of("AI Arif", "AI Arif", "AI Arif", "AI Arif", "AI Arif");
    }

}
