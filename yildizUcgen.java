import java.util.Scanner;
public class yildizUcgen {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Üçgenin yüksekliğini belirten sayı cinsinden uzunluğu giriniz:");
        int h=input.nextInt();

        for(int i=1;i<=h;i++){
            for(int k=1;k<=(h-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
