public class Operadores {
    public static void main(String[] args) {
        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2) {
	        System.out.print("Os dois valores precisam ser verdadeiros");;
        }
        if(condicao1 || condicao2) {
	        System.out.print("Um dos valores precisa ser verdadeiro");
    }







        String nomeUm = "Anderson";
        String nomeDois = "Anderson";

        System.out.println(nomeUm == nomeDois);




        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("a nosssa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

    }
}