public class Armazenamentos { //definição do nome do programa
    public static void main(String[] args) throws Exception { //comando de início do programa
        int A, B, C, D; //declaração das variáveis do programa
        D = 0; //atribui o valor 0 à variável D
        System.out.println("Valor de D: " + D); //exibe na tela o valor de D com frase explicativa
        A = 2; //atribui o valor 2 à variável A
        System.out.println("Valor de A: " + A); //exibe na tela o valor de A com frase explicativa
        B = 3; //atribui o valor 3 à var/iável B
        System.out.println("Valor de B: " + B); //exibe na tela o valor de B com frase explicativa
        C = 5; //atribui o valor 5 à variável C
        System.out.println("Valor de C: " + C); //exibe na tela o valor de C com frase explicativa
        C = C + 1; //atualiza a variável C o seu valor anterior acrescido de 1
        System.out.println("Valor de C: " + C); //exibe na tela o valor de C (atualizado) com frase explicativa
        D = A + C; //atribui à variável D a soma do valor de A com o valor atual de C
        System.out.println("Valor de D: " + D); //exibe na tela o valor de D (atualizado) com frase explicativa
    }//comando de fim do programa
}
