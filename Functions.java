public class Functions{
    public static void main(String[] args){

        //function     inputs >>>>>> box >>>>>> Outputs

        int x = doStuff(3, 5);      // calls function

        System.out.println(doStuff(3, 5) + doStuff(4, 6));

    }


    // signature

    public static int doStuff(int a, int b){
        int result = a + b ;
        return result;      // end function imediately
    }

}