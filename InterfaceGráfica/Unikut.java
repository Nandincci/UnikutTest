package InterfaceGráfica;

import java.util.Scanner;

public class Unikut{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int opcao;

    System.out.println("Você está na Rede Social UNIKUT, divirta-se!");
    System.out.println("--------------------------------------------");
    do {
        System.out.println("Menu");
        System.out.println("------");
        System.out.println("1 - Entrar na conta");
        System.out.println("2 - Criar nova conta");
        System.out.println("3 - Sair");
        System.out.println("Qual ação você deseja realizar?");
        opcao = input.nextInt();
        if(opcao == 1){//login e senha, verificar se estão corretos (duas opções abaixo)
        //Assim que entrar na conta, aparecer uma interface podendo adicionar amigos, editar perfil e enviar recados
        //Ou colocar as opções citada acima, pedindo login e senha, sem interface   
            System.out.println();

        } else if(opcao ==2){//criar login, senha e nome (opcional). Depois verificar se já existe login/senha.
        //caso usuário não adicione o nome, o chamar de Convidado   
            System.out.println("");
        }


    } while(opcao != 3);
    System.out.println("Até mais!");
    input.close();
}



}
