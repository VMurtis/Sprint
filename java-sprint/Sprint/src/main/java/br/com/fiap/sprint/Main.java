package br.com.fiap.sprint;

import br.com.fiap.sprint.dominio.*;
import br.com.fiap.sprint.infra.ClienteDAO;
import br.com.fiap.sprint.infra.dao.AutomovelDAO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaDoCarro = new ArrayList<>();


        boolean loopUsuario = true;
        String nome = "";

        while (loopUsuario) {
            System.out.println("Digite seu nome: ");
            try {
                nome = sc.nextLine();
                Cliente clienteInfo = new Cliente();

                if (clienteInfo.validarNome(nome)) {


                    loopUsuario = false;
                } else {
                    System.out.println("Nome inválidado");


                }

                if (!loopUsuario) {
                    System.out.println("\nNome validad:");

                }


            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.next();
            }
        }

        loopUsuario = true;
        String cpf = "";

        while (loopUsuario) {
            System.out.println("Digite seu cpf: ");
            try {
                cpf = sc.nextLine();
                Cliente clienteInfo = new Cliente();

                if (clienteInfo.validarCPF(cpf)) {


                    loopUsuario = false;
                } else {
                    System.out.println("Cpf inválidado");


                }

                if (!loopUsuario) {
                    System.out.println("\nCpf validado:");


                }


            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.next();
            }
        }

        loopUsuario = true;
        String telefone = "";

        while (loopUsuario) {
            System.out.println("Digite seu telefone: ");
            try {
                telefone = sc.nextLine();
                Cliente clienteInfo = new Cliente();

                if (clienteInfo.validarTelefone(telefone)) {


                    loopUsuario = false;
                } else {
                    System.out.println("Telefone inválidado");


                }

                if (!loopUsuario) {
                    System.out.println("\nTelefone validado:");

                }


            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.next();
            }

            loopUsuario = true;
            String email = "";

            while (loopUsuario) {
                System.out.println("Digite seu email: ");
                try {
                    email = sc.nextLine();
                    Cliente clienteInfo = new Cliente();

                    if (clienteInfo.validarEmail(email)) {


                        loopUsuario = false;
                    } else {
                        System.out.println("E-mail inválidado");


                    }

                    if (!loopUsuario) {
                        System.out.println("\nE-mail validado:");
                        Cliente cliente = new Cliente(nome, cpf, telefone, email);
                        ClienteDAO clienteDao = new ClienteDAO();
                        clienteDao.adicionar(cliente);
                        System.out.println("\nCliente adicionado no banco de dados:");

                    }


                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    sc.next();
                }
            }

            boolean loopAutomovel = true;
            String marcaCarro = "";

            while (loopAutomovel) {
                System.out.println("Digite a marca do veículo: ");
                try {
                    marcaCarro = sc.nextLine();
                    Automovel auomovelInfo = new Automovel();


                    if (auomovelInfo.validarMarca(marcaCarro)) {


                        loopAutomovel = false;
                    } else {
                        System.out.println("Marca inválidado");


                    }

                    if (!loopAutomovel) {
                        System.out.println("\nMarca validada:");

                    }


                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    sc.next();
                }
            }

            loopAutomovel = true;
            String modeloCarro = "";

            while (loopAutomovel) {
                System.out.println("Digite a marca do veículo: ");
                try {
                    modeloCarro = sc.nextLine();
                    Automovel auomovelInfo = new Automovel();


                    if (auomovelInfo.validarModelo(modeloCarro)) {


                        loopAutomovel = false;
                    } else {
                        System.out.println("Modelo inválidado");


                    }

                    if (!loopAutomovel) {
                        System.out.println("\nModelo validada:");

                    }


                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, tente novamente.");
                    sc.next();
                }
            }

            loopAutomovel = true;
            String corCarro = "";

            while (loopAutomovel) {
                System.out.println("Digite a marca do veículo: ");
                try {
                    corCarro = sc.nextLine();
                    Automovel auomovelInfo = new Automovel();


                    if (auomovelInfo.validarCor(corCarro)) {


                        loopAutomovel = false;
                    } else {
                        System.out.println("Informação inválidado");


                    }

                    if (!loopAutomovel) {
                        System.out.println("\nInformação validada:");

                    }


                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, tente novamente.");
                    sc.next();
                }
            }

            loopAutomovel = true;
            String placaCarro = "";

            while (loopAutomovel) {
                System.out.println("Digite a marca do veículo: ");
                try {
                    placaCarro = sc.nextLine();
                    Automovel auomovelInfo = new Automovel();


                    if (auomovelInfo.validarPlaca(placaCarro)) {


                        loopAutomovel = false;
                    } else {
                        System.out.println("informação inválidado");


                    }

                    if (!loopAutomovel) {
                        System.out.println("\nInformação validada:");

                    }


                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, tente novamente.");
                    sc.next();
                }
            }

            loopAutomovel = true;
            int anoCarro = 0;

            while (loopAutomovel) {
                System.out.println("Digite a marca do veículo: ");
                try {
                    anoCarro = sc.nextInt();
                    sc.nextLine();
                    Automovel auomovelInfo = new Automovel();


                    if (auomovelInfo.validarAno(anoCarro)) {


                        loopAutomovel = false;
                    } else {
                        System.out.println("informação inválidado");


                    }

                    if (!loopAutomovel) {
                        System.out.println("\nInformação validada:");
                        Automovel automovel = new Automovel(marcaCarro, modeloCarro, corCarro, placaCarro, anoCarro);
                        AutomovelDAO automovelDAO = new AutomovelDAO();
                        automovelDAO.adicionarAutomovel(automovel);


                    }


                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, tente novamente.");
                    sc.next();
                }
            }


            int opcao = 0;

            do {
                System.out.println("=== Menu ===");
                System.out.println("1. Fazer o questionário");
                System.out.println("2. Remover");
                System.out.println("3. Listar");
                System.out.println("4. Sair");
                System.out.println("5. menu banco");
                System.out.print("Escolha uma opção: ");


                try {
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Você escolheu Adicionar.");
                            String tipoCombustao = "";
                            boolean loopCarburador = true;

                            while (loopCarburador) {
                                System.out.println("Digite 1 - Carburador ou 2 - Injeção direta: ");
                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {
                                        System.out.println("Carburador");
                                        listaDoCarro.add("Tipo Combustão: Carburador\n");
                                        tipoCombustao = "Carburador";

                                        loopCarburador = false;
                                    } else if (escolha == 2) {
                                        System.out.println("Injeção direta");
                                        listaDoCarro.add("Tipo Combustão: Injeção direta\n");
                                        tipoCombustao = "Injeção direta";
                                        loopCarburador = false;

                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para carburador ou 2 para injeção direta.");


                                    }

                                    if (!loopCarburador) {
                                        System.out.println("\nInformações Coletadas:");


                                        Alinhamento ali = new Alinhamento(tipoCombustao);
                                        System.out.println(tipoCombustao);
                                    }


                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }
                            }
                            boolean loopAlinhamento = true;

                            while (loopAlinhamento) {
                                System.out.println("Você notou se o carro sai de uma linha reta em uma estrada plana? ( (1-sim ou 2-não):  ");
                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("puxa para um lado quando você dirige em linha reta : sim\n");
                                        loopAlinhamento = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("puxa para um lado quando você dirige em linha reta : não\n");
                                        loopAlinhamento = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }

                                    if (!loopAlinhamento) {
                                        System.out.println("\nInformações Coletadas:");

                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }

                            }
                            boolean loop = true;
                            String trocaDeFiltroApos20MilKm = "";
                            String aumentoConsumoCombustivel = "";

                            String naoGelaEFazsonAssobio = "";

                            while (loop) {
                                System.out.println("Você já trocou o filtro do ar após o intervalo de até 20 mil km? ( (1-sim ou 2-não):  ");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("trocou o filtro do ar após o intervalo de até 20 mil km : sim\n");
                                        trocaDeFiltroApos20MilKm = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("trocou o filtro do ar após o intervalo de até 20 mil km : não\n");
                                        trocaDeFiltroApos20MilKm = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");
                                        Arcondicionado ar = new Arcondicionado(trocaDeFiltroApos20MilKm, aumentoConsumoCombustivel, naoGelaEFazsonAssobio);

                                    }
                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }
                            }
                            loop = true;

                            while (loop) {
                                System.out.println("Quando você usa o ar-condicionado, notou o aumento do consumo de combustível? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Aumento do consumo de combustível quando usa o ar-condicionado : sim\n");
                                        aumentoConsumoCombustivel = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Aumento do consumo de combustível quando usa o ar-condicionado : não\n");
                                        aumentoConsumoCombustivel = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");

                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;

                            while (loop) {
                                System.out.println("Você notou se o ar-condicionado não gela e faz sons de assobios quando você liga o sistema? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Ar-condicionado não gela e faz sons de assobios : sim\n");
                                        naoGelaEFazsonAssobio = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Ar-condicionado não gela e faz sons de assobios : não\n");
                                        naoGelaEFazsonAssobio = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas do ar-condicionado:");
                                        Arcondicionado ar = new Arcondicionado(trocaDeFiltroApos20MilKm, aumentoConsumoCombustivel, naoGelaEFazsonAssobio);

                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String vibracaoEmAltaVelocidade = "";

                            while (loop) {
                                System.out.println("Você sente vibrações no volante ou no assento em determinadas velocidades? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Vibrações no volante ou no assento em determinadas velocidades : sim\n");
                                        vibracaoEmAltaVelocidade = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Vibrações no volante ou no assento em determinadas velocidades : não\n");
                                        vibracaoEmAltaVelocidade = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String desgasteIrregularDosPneus = "";

                            while (loop) {
                                System.out.println(" Os pneus estão desgastando de forma desigual, com áreas mais gastas em certos pontos? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Os pneus estão desgastando de forma desigual : sim\n");
                                        desgasteIrregularDosPneus = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Os pneus estão desgastando de forma desigual : não\n");
                                        desgasteIrregularDosPneus = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String instabilidadeEmCurvas = "";

                            while (loop) {
                                System.out.println("O carro parece menos estável ao fazer curvas, especialmente em velocidades mais altas? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Carro parece menos estável ao fazer curvas em velocidades mais altas : sim\n");
                                        instabilidadeEmCurvas = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Carro parece menos estável ao fazer curvas em velocidades mais altas : não\n");
                                        instabilidadeEmCurvas = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas do Balanceamento e Geometria:");
                                        BalanceamentoGeometria bala = new BalanceamentoGeometria(vibracaoEmAltaVelocidade, desgasteIrregularDosPneus, instabilidadeEmCurvas);


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String ruidoCorreia = "";

                            while (loop) {
                                System.out.println("Você já notou algum ruído anormal proveniente do motor, exemplo chiados ou zumbidos? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Você já notou algum ruído anormal proveniente do motor, exemplo chiados ou zumbidos : sim\n");
                                        ruidoCorreia = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Você já notou algum ruído anormal proveniente do motor, exemplo chiados ou zumbidos : não\n");
                                        ruidoCorreia = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String partidaMotor = "";

                            while (loop) {
                                System.out.println("O motor do veículo apresenta dificuldade ao dar partida? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("O motor do veículo apresenta dificuldade ao dar partida : sim\n");
                                        partidaMotor = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("O motor do veículo apresenta dificuldade ao dar partida : não\n");
                                        partidaMotor = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String desgasteCorreia = "";

                            while (loop) {
                                System.out.println("Há desgaste visível nas bordas da correia? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Desgaste visível nas bordas da correia : sim\n");
                                        desgasteCorreia = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Desgaste visível nas bordas da correia : não\n");
                                        desgasteCorreia = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas: sobre a correia");
                                        Correia correia = new Correia(ruidoCorreia, partidaMotor, desgasteCorreia);


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String embreagem = "";

                            while (loop) {
                                System.out.println("Você já notou se a embreagem dura? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Embreagem dura : sim\n");
                                        embreagem = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Embreagem dura : não\n");
                                        embreagem = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String embreagemTrepida = "";

                            while (loop) {
                                System.out.println("Quando você está dirigindo, sente o pedal de embreagem trepidando? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("O pedal de embreagem trepidando : sim\n");
                                        embreagemTrepida = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("O pedal de embreagem trepidando : não\n");
                                        embreagemTrepida = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String embreagemMarcha = "";

                            while (loop) {
                                System.out.println("Quando troca de marcha, notou algum barulho como chiado ou estalo ao acionar o pedal? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Marcha com barulho : sim\n");
                                        embreagemMarcha = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Marcha com barulho : não\n");
                                        embreagemMarcha = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas da embreagem:");
                                        Embreagem embreage = new Embreagem(embreagem, embreagemTrepida, embreagemMarcha);


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String paneLigar = "";

                            while (loop) {
                                System.out.println("Há sinais de dificuldade quando você tenta ligar o automóvel? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Dificuldade quando você tenta ligar o automóvel : sim\n");
                                        paneLigar = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Dificuldade quando você tenta ligar o automóvel : não\n");
                                        paneLigar = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String paneLuz = "";

                            while (loop) {
                                System.out.println("Quando você tenta ligar o automóvel, acontece alguma redução das luzes? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Ao ligar o automóvel acontece alguma redução das luzes : sim\n");
                                        paneLuz = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Ao ligar o automóvel acontece alguma redução das luzes : não\n");
                                        paneLuz = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas pane eletrica:");
                                        PaneEletrica pane = new PaneEletrica(paneLigar, paneLuz);


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String freio = "";

                            while (loop) {
                                System.out.println("Quando você aperta o pedal, o freio assovia ou range? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("O pedal de freio assovia ou range : sim\n");
                                        freio = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("O pedal de freio assovia ou range : não\n");
                                        freio = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String freioDuro = "";

                            while (loop) {
                                System.out.println("O pedal de freio está muito duro? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("O pedal de freio freio está muito duro : sim\n");
                                        freioDuro = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("O pedal de freio freio está muito duro : não\n");
                                        freioDuro = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String freioBaixo = "";

                            while (loop) {
                                System.out.println("O pedal de freio está muito baixo? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("O pedal de freio está muito baixo : sim\n");
                                        freioBaixo = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("O pedal de freio está muito baixo : não\n");
                                        freioBaixo = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String freioVibra = "";

                            while (loop) {
                                System.out.println("O freio está vibrando? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("O freio está vibrando : sim\n");
                                        freioVibra = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("O freio está vibrando : não\n");
                                        freioVibra = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas sistema de freio:");
                                        SistemaDeFreio frei = new SistemaDeFreio(freio, freioDuro, freioBaixo, freioVibra);


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String nivelDeAgua = "";

                            while (loop) {
                                System.out.println("Você tem que completar o nível de água do motor diversas vezes em um curto período de tempo? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Completar o nível de água do motor diversas vezes em um curto período de tempo : sim\n");
                                        nivelDeAgua = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Completar o nível de água do motor diversas vezes em um curto período de tempo : não\n");
                                        nivelDeAgua = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }
                            loop = true;
                            String mangueirasInternas = "";

                            while (loop) {
                                System.out.println("Verifique se às mangueiras internas do veículo estão estufadas? (1-Sim ou 2-Não)");

                                try {
                                    int escolha = sc.nextInt();

                                    if (escolha == 1) {

                                        listaDoCarro.add("Mangueiras internas do veículo estão estufadas : sim\n");
                                        mangueirasInternas = "Sim";
                                        loop = false;
                                    } else if (escolha == 2) {

                                        listaDoCarro.add("Mangueiras internas do veículo estão estufadas : não\n");
                                        mangueirasInternas = "Não";
                                        loop = false;
                                    } else {
                                        System.out.println("Resposta inválida. Por favor, digite 1 para sim ou 2 para não.");

                                    }
                                    if (!loop) {
                                        System.out.println("\nInformações Coletadas:");
                                        Superaquecimento aquecimento = new Superaquecimento(nivelDeAgua, mangueirasInternas);


                                    }

                                } catch (Exception e) {
                                    System.out.println("Entrada inválida. Por favor, insira um número.");
                                    sc.next();
                                }


                            }


                            break;

                        case 2:
                            System.out.println("Você escolheu Remover.");

                            break;

                        case 3:
                            System.out.println("Você escolheu Listar.");

                            System.out.println("Lista de carros: " + listaDoCarro);
                            break;

                        case 4:
                            System.out.println("Saindo...");
                            break;

                        case 5:
                            System.out.println("banco");
                            System.out.println("digite 1 para adicionar ");
                            System.out.println("digite 2 para buscar ");
                            System.out.println("digite 3 para alterar ");
                            System.out.println("digite 4 para deletar ");
                            System.out.println("digite 5 para voltar ao menu principal");
                            int escolhaBanco;
                            try {

                                escolhaBanco = sc.nextInt();
                                Cliente cliente = new Cliente(nome, cpf,telefone,email);
                                ClienteDAO clienteDao = new ClienteDAO();


                                switch (escolhaBanco) {
                                    case 1:

                                        clienteDao.adicionar(cliente);

                                        break;
                                    case 2:

                                        clienteDao.listarTodos();

                                        break;
                                    case 3:

                                        clienteDao.alterarUsuario(cliente);
                                        break;
                                    case 4:
                                        ;
                                        clienteDao.deletarUsuario(cpf);
                                        break;
                                    case 5:


                                        break;
                                    default:
                                        System.out.println("informação inálida");
                                }

                            } catch (Exception e) {
                                System.out.println("Erro ao ler a opção. " + e.getMessage());
                            }
                            break;

                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                    }
                    System.out.println();
                } catch (Exception e) {
                    System.out.println("Erro ao ler a opção. " + e.getMessage());
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    sc.next();
                    opcao = 0;
                }
            } while (opcao != 4);


            for (String item : listaDoCarro) {
                System.out.println(item);
            }

            sc.close();
        }
    }
}
