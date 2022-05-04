package dadosUsuario;
import java.util.Calendar;
import java.util.Scanner;

public class Dadosusuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Metodo scanner para entrada de dados.
        String nome;
        int idade, ano_atual, ano_nascimento,peso;
        String endereco;
        int telefone;
        float imc, altura;
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        Calendar calendario = Calendar.getInstance();
        ano_atual = calendario.get(Calendar.YEAR);
        ano_nascimento = ano_atual - idade;
        System.out.println("digite o endereco:");
        endereco = entrada.next();
        System.out.println("Digite seu telefone:");
        telefone = entrada.nextInt();
        System.out.println("Para calcular seu IMC, digite sua altura");
        altura = entrada.nextFloat();
        System.out.println("Para calcular o IMC, digite seu peso");
        peso = entrada.nextInt();
        imc = peso/(altura*2);


        System.out.printf("Seu nome " + nome +"\n");
        System.out.printf("Sua idade " + idade + "\n");
        System.out.printf("Voce nasceu em " + ano_nascimento + "\n");
        System.out.printf("Voce mora em " + endereco + "\n");
        System.out.printf("Seu telefone " + telefone + "\n");
        System.out.printf("Resultado do calculo IMC " + imc + "\n");

        if (imc < 18.5)
            System.out.println("Abaixo do peso ideal, vasmos melhorar!");
        else
            if ((imc > 18.5) && (imc < 24.9))
                System.out.println("Voce esta no peso ideal, parabens");
            else
                if ((imc > 25.0) && (imc < 29.9))
                    System.out.println("Voce esta com excesso de peso, vamos melhorar!");
                else
                    if ((imc > 30.0) && (imc < 34.9))
                        System.out.println("Obesidade Classe 1, cuidado!");
                    else
                        if ((imc > 35.0) && (imc < 39.9))
                            System.out.println("Obesidade Classe 2, ainda temos como mudar isso!");
                        else
                            if (imc >= 40)
                                System.out.println("Obesidade Classe 3, procure ajuda, nada esta perdido!");


                            System.out.println("obrigado");


    }
}
