public class loopy{
    public static void main(String[] args){
        int i = 0 ;
        int total = 0 ;
        int times = 10;

        while( i < times ){
            total += i ;
            i++ ;
        }

        for (int i = 0 ; i < tmes ; i++){
            total += i ;
        }

        System.out.println(total == times * (times- 1) / 2);
    }
}