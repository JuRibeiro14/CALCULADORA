import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int operacao;
        double num1,num2, resultado=0;
        Scanner scanner = new Scanner (System.in);
        Calculadora calc = new Calculadora();

        while(true){
        System.out.println("Digite a operação desejada: \n 1-Soma \n 2-Subtração \n 3-Divisão \n 4-Multiplição \n 5-Sair");
        operacao = scanner.nextInt();
        
        if(operacao==5){
            break;
        }
        System.out.println("Digite o primeiro valor");
        num1= scanner.nextDouble();
        System.out.println("Digite o segundo valor");
        num2= scanner.nextDouble();
    

        switch(operacao){
            case 1:
            resultado = calc.soma(num1,num2);
            break;
            case 2:
            resultado = calc.subtrai(num1,num2);
            break;
            case 3:
            resultado = calc.dividi(num1,num2);
            break;
            case 4:
            resultado = calc.multiplica(num1,num2);
            break;
        }
        System.out.println(resultado);
    } 
  }
}


        
        
