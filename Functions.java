public class Functions{
    public static void main(String[] args){

        //function     inputs >>>>>> box >>>>>> Outputs

        doStuff(3, 5);      // calls function
        doStuff(4, 6);

    }


    // signature

    public static int doStuff(int a, int b){
        int result = a + b ;
        return result;
    }

}