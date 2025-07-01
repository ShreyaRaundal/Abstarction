package Calculator;

public class CalculatorDriver {
    public static void main(String[] args){
        Calculator add=new Addition();
        Calculator sub=new Subtraction();
        Calculator mul=new Multiplication();
        Calculator div=new Division();

        System.out.println("Addition : "+ add.operate(2, 77));
        System.out.println("Substarction : "+ sub.operate(3,4));
        System.out.println("Multiplicatio : "+ mul.operate(4,5 ));
        System.out.println("Division : "+ div.operate(7, 5));



    }
}
