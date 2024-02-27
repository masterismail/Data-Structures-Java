
public class solution {

    public static String compareIfElse(int a, int b) {
        String result;
        
        if (a > b) {
            result = "greater";
        }
        else if (b>a) {
            result = "smaller";
        }

        else {
            result = "equal";
        }
        return result;
    }
   

}
    

