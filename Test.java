package practice4;
import java.util.Scanner;

public class Test{
    
    public static void main(String[] args) {

        ComputeMethods calculos = new ComputeMethods();

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit  = teclado.nextDouble();
        double celsius = ComputeMethods.fToC(fahrenheit);

        System.out.printf("A temperatura em Celsius é: %3.2f \n" , celsius);

        //
        
        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = teclado.nextDouble();
        
        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = teclado.nextDouble();

        double hypotenusa = ComputeMethods.hypotenusa(lado1, lado2);
        
        teclado.close();
        System.out.printf("Os lados do triângulo são %%2.2f, e a hipotenusa é %2.3f \n",lado1,lado2, hypotenusa);

        //

        int valorrolado = ComputeMethods.rolar();
       
        System.out.printf("O valor rolado no dado é: %d" , valorrolado);





}
}
