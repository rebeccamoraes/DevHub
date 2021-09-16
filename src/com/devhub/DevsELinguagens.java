package com.devhub;

import java.util.Scanner;

// Crie um programa em linguagem Java que atenda aos seguintes requisitos:
//_ O programa deve realizar o cadastro de um dev e uma linguagem.
//_ O programa deve ter um cabeçalho com o nome do programa. OK
//_ O programa deve exibir um menu com as opções cadastrar dev, cadastrar linguagem e sair. OK
//_ Deve ser utilizado a estrutura SWITCH-CASE para decidir sobre a opção escolhida pelo usuário. OK
//_ O cadastro de dev deve solicitar o nome, sobrenome, senioridade e idade.
//_ O nome e sobrenome devem conter no mínimo 3 caracteres.
//_ A idade deve ser maior que 0.

//_ O cadastro de linguagens deve solicitar o nome, descrição e a aplicação.
//_ O nome deve conter no mínimo 3 caracteres.
//- A aplicação deve ser apenas Frontend, Backend ou Mobile.
public class DevsELinguagens {
    public static void main(String[] args) {
        short opcao, tipoAplicacao, tipoSenioridade;
        int idade = 0;
        String nomeDev = "", sobrenome = "", senioridade = "", nomeLinguagem = "", descricao = "", aplicacao = "";


        Scanner scanner = new Scanner(System.in);

        System.out.println(" -------------------- DevHub - Cadastro de devs -----------------------");

        System.out.println("Escolha uma das opções: \n1. Cadastrar Dev \n2. Cadastrar linguagem \n3. Sair");
        opcao = scanner.nextShort();
        scanner.nextLine();


        switch (opcao) {
            case 1:
                System.out.println("Cadastro de DEV");

                //nome- no mínimo 3 caracteres
                do {
                    System.out.print("Digite o nome do novo DEV:  ");
                    nomeDev = scanner.nextLine();

                    if (nomeDev.length() < 3) {
                        System.out.println("Valor inválido. O nome deve ter no mínimo 3 caracteres. Digite novamente");
                    }
                } while (nomeDev.length() < 3);


                //sobrenome- no mínimo 3 caracteres
                do {
                    System.out.print("Digite o sobrenome do novo DEV:  ");
                    sobrenome = scanner.nextLine();

                    if (sobrenome.length() < 3) {
                        System.out.println("Valor inválido. O sobrenome deve ter no mínimo 3 caracteres. Digite novamente");
                    }
                } while (sobrenome.length() < 3);


                //senioridade - Junior , Pleno , Sênior , Master
                do {
                    System.out.println("Informe o tipo de senioridade: 1. Junior; 2. Pleno; 3. Senior; 4. Master ");
                    tipoSenioridade = scanner.nextShort();
                    scanner.nextLine();

                    switch (tipoSenioridade) {
                        case 1:
                            senioridade = "Junior";
                            break;
                        case 2:
                            senioridade = "Pleno";
                            break;
                        case 3:
                            senioridade = "Senior";
                            break;
                        case 4:
                            senioridade = "Master";
                            break;

                        default:
                            System.out.println("Tipo de aplicação inválida. Digite novamente");
                    }
                } while (tipoSenioridade < 1 || tipoSenioridade > 4);

                //idade - maior que 0
                do {
                    System.out.print("Digite a idade do novo DEV:  ");
                    idade = scanner.nextInt();
                    scanner.nextLine();

                    if (idade <= 0) {
                        System.out.println("Valor inválido. A idade do DEV ter não pode ser negativa. Digite novamente");
                    }
                } while (idade <= 0);


                System.out.printf("Cadastro realizado com sucesso \nO nome  informado foi: %s \nO sobrenome informado foi: %s \nA senioridade informada foi: %s \nA idade informada foi: %d", nomeDev, sobrenome, senioridade, idade);
                break;

            case 2:
                System.out.println("Cadastro de Linguagem");

                //nome
                do {
                    System.out.print("Nome da linguagem: ");
                    nomeLinguagem = scanner.nextLine();

                    if (nomeLinguagem.length() < 3) {
                        System.out.println("Valor inválido. O nome deve ter no mínimo 3 caracteres.  Digite novamente");
                    }
                } while (nomeLinguagem.length() < 3);

                //descricao
                do {
                    System.out.print("Descrição da linguagem: ");
                    descricao = scanner.nextLine();

                    if (descricao.length() < 3) {
                        System.out.println("Valor inválido. A descrição deve ter no mínimo 3 caracteres.  Digite novamente");
                    }
                } while (descricao.length() < 3);

                //aplicacao: deve ser apenas Frontend, Backend ou Mobile.
                do {
                    System.out.println("Informe o tipo da aplicação: 1. Frontend; 2. Backend; 3. Mobile");
                    tipoAplicacao = scanner.nextShort();
                    scanner.nextLine();

                    switch (tipoAplicacao) {
                        case 1:
                            aplicacao = "Frontend";
                            break;
                        case 2:
                            aplicacao = "Backend";
                            break;
                        case 3:
                            aplicacao = "Mobile";
                            break;
                        default:
                            System.out.println("Tipo de aplicação inválida. Digite novamente");
                    }
                } while (tipoAplicacao < 1 || tipoAplicacao > 3);

                System.out.printf("\nCadastro realizado com sucesso \nO nome  informado foi: %s \nA descrição informada foi: %s \nA aplicação informada foi: %s \n ", nomeLinguagem, descricao, aplicacao);
                break;

            case 3:
                System.out.println("Aplicação finaliza. Sair");
                break;

            default:
                System.out.println("Opção inválida. Digite novamente");

                break;
        }

    }
}
