package Pattern;

public class pattern16 {
    public static void main(String[] args){
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j<=5-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=5 ;j++){
                if((j>=2&&j<=4)&&(i>=2&&i<=4)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
