public class TiposPrimitivosValores {
    public static void main(String[] args) {
        int soma = 5 + 5;
        System.out.println("Soma 5 + 5: " + soma);

        int subtracao = 10 - 3;
        System.out.println("Subtração 10 - 3: " + subtracao);

        long multiplicacao = 110 * 525;
        System.out.println("Multiplicação 110 * 525: " + multiplicacao);

        int resto = 100 % 30;
        System.out.println("Resto 100 % 30: " + resto);

        double divisao = 4.0d / 3.0d;
        System.out.println("Divisao 4 / 3: " + divisao);

        double salario = 1000.50d;
        double salario2 = 1000.0d;

        boolean verdadeiroFalso = false;
        boolean salarioMaiorSalario2 = salario > salario2;
        System.out.println("Salario > Salario 2: " + salarioMaiorSalario2);
    }
}
