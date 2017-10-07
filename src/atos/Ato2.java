package atos;

import java.util.Scanner;
import audio.Som;
import static audio.Som.ato2;
import rpii.Raca;
import sun.audio.AudioStream;
public class Ato2 {

    private Raca jogador;

    public Ato2(Raca jogador) {
        this.jogador = jogador;
    }

    public long Enredo_2() throws Exception {
        AudioStream musica = ato2();
      /*  System.out.println("Fechando seu velho casebre você da uma ultima olhada para a vila de kenka, a fumaça apesar de ter diminuído ainda não se extinguiu.\n"
                + "Você pensa em dar um enterro digno para seus amigos, grande parte de seus corpos foi consumida pelo fogo\n"
                + "mas os que restaram ainda estão a céu aberto.\n"
                + "Ao mesmo tempo que se preocupa com entrar na floresta de Lavitan com o corpo cansado, pode não ser uma boa ideia.\n");*/
        fase1();
        return 0;
    }

    public long fase1() throws Exception {
        //comando escolha de acao
        Scanner e = new Scanner(System.in);
        System.out.println("1-POUPAR-SE DO ENTERRO   2-ENTERRAR AMIGOS");
        int resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
               /* System.out.println("Você segue a passos lentos atravessando pela última vez à vila, observa os corpos pelo chão mas os ignora\n"
                        + "um grande vazio preenche seu coração, tal sensação já foi sentida em seu passado, mas os calmos anos em Kenko\n"
                        + "de certa forma tinham o preenchido. nada mais importa, o fervor de seu sangue em busca de vingança fala mais alto e \n"
                        + "a entrada da pequena estrada que atravessa a Grande Floresta de Lavitan  se aproxima.\n");*/
                break;
            }
            if (resp == 2) {
               /* System.out.println("Você pega uma pá e segue para a vila de Kenko novamente, após recolher os corpos com uma pequena carroça puxada por você mesmo\n"
                        + "inicia o feitio das covas, entrando noite adentro executando tal tarefa, no fim, coloca os corpos em seus respectivos locais e realiza uma\n"
                        + "pequena oração para cada e se despede pela última vez. \n"
                        + "Apesar de não ter notado no momento, suas mãos estão quase em carne viva, e seu corpo está fadigado. \n"
                        + "Você pensa em usarseu bálsamo de cura, um dos itens que pegou ao sair de casa, mas ao mesmo tempo lembra que pode precisar dele para mais tarde\n"
                        + "na floresta e só tem uma unidade deste.");*/
                //comando consumo de item
                System.out.println("1-NAO CONSUMIR   2-CONSUMIR BALSAMO");
                resp = e.nextInt();
                while (resp != 1 || resp != 2) {
                    if (resp == 2) {
                      /*  System.out.println("Tragando o líquido espesso você sente seu cansaço desaparecer completamente, os ferimentos regeneram-se.\n"
                                + "agora só resta partir para a saída da vila, e seguir à pequena estrada que atravessa a Grande Floresta de Lavitan.\n"
                                + "Já está quase nascendo um novo dia e você com pressa de fazer algo em relação ao ocorrido com Kenko parte na sua jornada.");*/
                        break;
                    }
                    if (resp == 1) {
                        /*System.out.println("Você pondera que é melhor guardar a cura para um momento mais oportuno e ignora os danos, e também a ansiedade\n"
                                + "de vingar seus amigos o impede de descansar mais um dia.\n"
                                + "Agora só resta partir para a saída da vila, e seguir à pequena estrada que atravessa a Grande Floresta de Lavitan.");*/
                        break;
                    }
                    System.out.println("Numero invalido, tente novamente\n"
                            + "1-NAO CONSUMIR   2-CONSUMIR BALSAMO");
                }
            }
            System.out.println("1-POUPAR-SE DO ENTERRO   2-ENTERRAR AMIGOS");
            resp = e.nextInt();
        }
        /*System.out.println("\nA grande floresta de Lavitan, uma das maiores no reino de Eresda, muitos criaturas habitam ali, desde animais, seres mitológicos"
                + "criaturas desconhecidas e bandidos.\n "
                + "Sabendo deste último, seguir pela estrada principal pode não ser uma boa idéia, saqueadores podem aparecer e frustrar qualquer avanço.\n"
                + "Mas seguir pela floresta pode gerar encontros inesperados com algumas criaturas.\n"
                + "1-ENTRAR NA FLORESTA  2-SEGUIR PELA ESTRADA");*/
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                floresta();
                break;
            }
            if (resp == 2) {
                estrada();
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-ENTRAR NA FLORESTA  2-SEGUIR PELA ESTRADA");
        }
        return 0;
    }

    public void estrada() {
        Scanner e = new Scanner(System.in);
        /*System.out.println("Você segue seu ritmo pela pequena estrada, aos poucos mais algumas trilhas se juntam a ela e de certa forma ela aumente um pouco"
                + "significando que pessoas passam por ali mais frequentemente. \n"
                + "Mais adiante você percebe que alguns galhos movem-se na floresta, acompanhando sua caminhada, ainda não dá para saber o que é mas certamente\n"
                + "coisa boa não deve ser, pensa consigo mesmo.\n"
                + "3 bandidos(humanos?) surgem ao seu redor, com olhares penetrantes e certamente decididos do que estão fazendo.\n"
                + "Você observa mais atentamente que eles estão muito magros e com roupas já bastante gastas, estas também claramente não foram feitas para a batalha\n"
                + "já que desprovem de qualquer proteção mais robusta.\n"
                + "5-LUTAR!");*/
        //comando de luta
        int resp = e.nextInt();
        while (resp != 5) {
            if (resp == 5) {
             /*   System.out.println("Tragando o líquido espesso você sente seu cansaço desaparecer completamente, e as feridas em suas mãos regeneram-se.\n"
                        + "agora só resta partir para a saída da vila, e seguir à pequena estrada que atravessa a Grande Floresta de Lavitan.\n"
                        + "Já está quase nascendo um novo dia e você com pressa de fazer algo em relação ao ocorrido com Kenko parte na sua jornada.");*/
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "5-LUTAR!");
        }
        //comando para pegar item
        System.out.println("1-SAQUEAR LADROES   2-SEGUIR SUA JORNADA");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println("Saque realizado");
                break;
            }
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "5-LUTAR!");
        }
        /*System.out.println("Apos a luta segue seu ruma pela estrada de terra batida, mais adiante você avista a estrutura de uma ponte\n"
                + "chegando mais perto percebe que ela foi derrubada, suas vigas de sustentação foram derrubadas, acarretando em sua queda.\n"
                + "Olhando para baixo só se avista o pequeno Canyon e as águas turbulentas do rio passando. Apesar de nao ser muito grande\n"
                + "qualquer tentativa de passagem parece impossível devido o declive muito íngreme e a feroz correnteza em seu fundo.\n"
                + "1- SUBIR O LEITO DO RIO   2- DESCER O LEITO DO RIO");*/
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                /*System.out.println("Você segue bravamente mata adentro subindo pela costa do rio. Sempre atento para possíveis perigos advindos\n"
                        + "da desconhecida floresta.\n"
                        + "Mais adiante há um trecho em que é possível a passagem, pois não há barrancas muito grandes no rio e a correnteza\n"
                        + "primeiramente parece permitir passagem.\n"
                        + "5- NADAR ATE O OUTRO LADO DO LEITO (vai ter mesmo mob da outra parte do rio");*/
                //comando que perde vida
                resp = e.nextInt();
                while (resp != 5) {
                    if (resp == 5) {
                        System.out.println("Escolha um numero de 0 a 5");
                        resp = e.nextInt();
                        while (resp != 4) {
                            if (resp == 4) {
                                /*System.out.println("Você segue pela densa floresta, começando a perceber um aumento na elevação do terreno,\n"
                                        + "em um estalo latente da sua memória uma lembrança de um relato de Tothurin, este a muito tempo lhe havia dito que havia\n"
                                        + "um templo semelhante no meio da floresta de levitan, mas estava abandonada devido o difícil acesso e o constante ataque\n"
                                        + "de criaturas do local. O relato era que o tal templo ficava próximo a margem do grande rio que corta Levitan\n"
                                        + "onde a floresta fica mais densa e o terreno eleva-se, lá ficava o templo, mais que depressa você procura pelo templo.\n");
                               */ fase2();
                                break;
                            }
                            System.out.println("Numero errado, VOCE ESTA SE AFOGANDO!\n"
                                    + "Escolha um numero de 0 a 5");
                        }

                        break;
                    }
                    System.out.println("Numero invalido, tente novamente\n"
                            + "5- NADAR ATE O OUTRO LADO DO LEITO");
                }

                break;
            }
            if (resp == 2) {
                /*System.out.println("Você segue as corredeiras do caudaloso rio, quebrando galhos e contornando quando necessário, passa alguns pequenos riachos e rios de\n"
                        + "pequeno porte, estes últimos geralmente acabando em cachoeiras e cascatas ao juntar-se com o rio Levitan a floresta de levitan é um desafio para\n"
                        + "qualquer um que se aventure fora de suas trilhas.\n"
                        + "Mais adiante embora com o rio mais calmo e com o fim do pequeno canyon. O que parece dificultar agora é sua largura, com algumas junções de outros\n"
                        + "rios e riachos ele tomou proporções preocupantes, e conhecendo bem a floresta de Levitan certamente haveriam perigos naquelas águas. atravessar a nado\n"
                        + "seria certamente um desafio.\n"
                        + "Seria mais sábio construir uma pequena jangada ou algo do gênero, mas para isso é necessário coletar alguns materiais.");*/
                floresta();
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1- SUBIR O LEITO DO RIO   2- DESCER O LEITO DO RIO");
        }
    }

    public void floresta() {
        Scanner e = new Scanner(System.in);
        /*System.out.println("Você começa a andar pelos arredores da margem, em busca de cipós, pequenos troncos e troncos maiores para a base, estes mais espessos\n"
                + "obrigando a dar cabo de algumas árvores. Você avança alguns metros longe da costa do rio e começa a talhar os materiais, mas de repente uma das\n"
                + "árvores atingidas por seus golpes surpreendentemente parece ganhar vida própria e se afasta de voce.\n"
                + "É um Ent, uma espécie de “árvore humanóide” surge para você, com pelo menos quatro metros de altura, muito robusta, com uma cabeça alta e quase sem pescoço\n"
                + "sua “pele” parece uma casca de árvore e coberta de musgo. Olhos profundos, lentos e solenes, mas muito penetrantes.\n"
                + "1-METODO LUTA CONTA O ENT   2-FUGIR(VAI NADANDO DAI)");*/
        int resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                //comando de luta
                System.out.println("Após a luta você termina de catar os materiais.");
                break;
            }
            if (resp == 2) {
                //comando de colher materiais
                System.out.println("Voce corre vergonhosamente e termina de catar os materiais.");
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-LUTAR CONTA O ENT   2-FUGIR");
        }
        System.out.println("5-MONTAR JANGADA");
        resp = e.nextInt();
        while (resp != 5) {
            if (resp == 5) {
                jangada();
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "5-MONTAR JANGADA");
        }
      /*  System.out.println("A jangada improvisada boia com dificuldades, mas cumpre seu papel, suportando todo seu peso sobre sua estrutura, por vezes, dependendo do balanço devido\n"
                + "as remadas a água gelada bate em seus pés.\n"
                + "Pela metade do rio você observar alguns objetos vindo em sua direção, primeiramente pensa serem alguns troncos, mas quando se aproximam, os objetos revelam-se sendo\n"
                + "corpos de pessoas, homens e algumas mulheres, provavelmente algum grupo de comerciantes.\n"
                + "A visão não lhe apavora tanto quanto deveria, o que mais lhe intriga é isto estar acontecendo nesta situação. Será que teria alguma relação com as pessoas que atacaram a vila?\n"
                + "Chegando na outra margem você observa sua jangada e pensa em amarrá-la, mas ao mesmo tempo está com pressa e pode ser um desperdício de tempo\n"
                + "1- ATAR JANGADA  2-SOMENTE DESCER DA JANGADA");*/
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
               /* System.out.println("Sua jangada estara aqui caso precise usa-la novamente!\n");
                System.out.println("A passos largos onde o terreno permitia você continua em sua jornada pela floresta. \n"
                        + "Algumas horas depois chega na borda de um grande rio, possivelmente o rio Lavitan, que corta a floresta com mesmo nome, e conhecendo bem esta parte do reino de Eresda\n"
                        + "certamente haveriam perigos naquelas águas. atravessar a nado poderia ser uma experiência bem ruim.\n"
                        + "1-USAR SUA JANGADA   2-ENCONTRAR OUTRA FORMA DE ATRAVESSAR");*/
                resp = e.nextInt();
                while (resp != 1 || resp != 2) {
                    if (resp == 1) {
                        fase2();
                        break;
                    }
                    if (resp == 2) {
                        break;
                    }
                    System.out.println("Numero invalido, tente novamente\n"
                            + "7- USAR SUA JANGADA");
                }
                break;
            }
            if (resp == 2) {
                System.out.println("Sua jangada foi rio abaixo, caso precise usa-la novamente tera que construir outra!\n");
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1- ATAR JANGADA  2-SOMENTE DESCER DA JANGADA");
        }
       /* System.out.println("Seguindo seu caminho pela densa floresta você tem uma lembrança de um relato de Tothurin, este a muito tempo lhe havia dito que havia um templo semelhante no meio da floresta\n"
                + "de levitan, mas estava abandonada devido o difícil acesso e o constante ataque de criaturas do local.\n"
                + "Por um breve momento você se sente feliz, mas logo em seguida vem a lembrança da morte de Tothurin e todos os outros, contrastando com o primeiro sentimento.\n"
                + "Seguindo a lógica geográfica você segue a costa do rio no sentido ascendente, já que provavelmente o templo ficará na parte da cabeceira do rio, mais alta em relevo.\n"
                + "5-SUBIR O LEITO DO RIO");*/
        resp = e.nextInt();
        while (resp != 5) {
            if (resp == 5) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "5-SUBIR O LEITO DO RIO");
        }
        /*System.out.println("Seguindo pela floresta, atravessando variados tipos de terrenos você chega em uma área parcialmente “limpa” em relação ao resto da floresta, mas não de forma natural,\n"
                + "a vegetação foi quebrada e há sinais claros que algo habita naquelas árvores, você ouve um som agudo vindo do meio das árvores, de repente algo dá um rasante sobre você\n"
                + "que se atira ao chão para evitar o choque.\n"
                + "Erguendo a cabeça você observa a criatura, uma harpia, esta criatura tem asas e pernas como aves de rapina com rosto e busto de mulher, com um tamanho proporcional a pouco\n"
                + "mais da metade de um homem. retornando do rasante ela pousa em um galho próximo e grita novamente, ameaçando sua presença."
                + "1-ENFRENTAR HARPIA   3-CORRER");*/
        resp = e.nextInt();
        while (resp != 1 || resp != 3) {
            if (resp == 3) {
              /*  System.out.println("Você tenta correr vergonhosamente, porem as harpias podem voar e logo o alcansa, forcando-lhe a enfrenta-las!");*/
                break;
            }
            if (resp == 1) {
                //comando luta
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-ENFRENTAR HARPIA   3-CORRER");
        }
        /*System.out.println("Após o duro confronto você pensa em cuidar dos ferimentos. Apesar de querer seguir em frente logo,\n"
                + "você sabe que harpias sempre carregam coisas para seus ninhos, passa pela sua cabeça procurar, possivelmente deve estar nas proximidades.\n"
                + "1-SEGUIR SUA JORNADA   2-PROCURAR PELO NINHO");*/
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 2) {
                //comando pegar itens
               /* System.out.println("Você anda pela redondeza olhando para cima em busca do tal ninho, e no topo de uma imponente árvore retorcida está ele. Apesar de ser relativamente alto os grossos galhos tortos facilitam a subida.\n"
                        + "Dentro dele estão ovos e ...");*/
                break;
            }
            if (resp == 1) {
                //comando luta
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-SEGUIR SUA JORNADA   2-PROCURAR PELO NINHO");
        }
       /* System.out.println("Seguindo seu caminho, pela selva de levitan, você chega a estrada principal que corta as localidades entre Kenko e as outras localidades. A cena não é das melhores, a esquerda, sobre o rio Levitan,\n"
                + "a ponte que ali existia está destruída, e pelo chão da estrada há muito sangue e carroças destruídas ou viradas. \n"
                + "Nas proximidades do comboio haviam muitos corpos sem vida espalhados, certamente atacados sem dó ou piedade.\n"
                + "Não há muito o que fazer, apenas seguir seu caminho para o terreno mais elevado rio acima.\n"
                + "seguindo pela floresta começa a perceber um aumento na elevação do terreno mais significativa, batendo com o relato de Tothurin lembrado anteriormente.\n"
                + "Agora possivelmente o templo está próximo, falta encontrá-lo, você sente que deve apurar o paço e encontrar tal templo antes que a noite caia\n"
                + "6-SEGUIR CAMINHO EM BUSCA DO TEMPLO");*/
        resp = e.nextInt();
        while (resp != 6) {
            if (resp == 6) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "6-SEGUIR CAMINHO EM BUSCA DO TEMPLO");
        }
        /*System.out.println("Você adentra pela floresta de lavitan, no início ela até parecia uma floresta normal mas a média que se embrenha em seu interior a vegetação fica cada vez mais soberana. \n"
                + "Durante algumas horas você avança sem muitas dificuldades, de vez em quando cruzando com algum animal pequeno, como lebres e pássaros das mais variadas espécies.\n"
                + "\n"
                + "Sem perceber você se encontra cercado por uma matilha de lobos cinzas, eles simplesmente surgiram silenciosamente ao seu redor, aos rosnados, seus olhos famintos destoavam da sua pelagem, e bem na sua frente\n"
                + "o maior entre eles possuía os olhos vermelhos, certamente esse era o alfa do grupo, se de alguma forma fosse possível abate-lo antes dos outros a matilha ficará desorientada.\n"
                + "1-ENFRENTAR LOBOS  2-FUGIR");*/
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println("1-ATACAR OS FRACOS PRIMEIRO   2-ATACR O LIDER PRIMEIRO");
                resp = e.nextInt();
                while (resp != 1 || resp != 2) {
                    if (resp == 1) {
                        //comando de luta
                        System.out.println("Os fracos tombam facilmente, voce perde pouca vida, porem ainda tem que enfrentar o lider");
                        break;
                    }
                    if (resp == 2) {
                        /*System.out.println("Após derrotar o lider, os mais fracos se assustam e fogem!\n"
                                + "Mais uma vez em sua existência, sua calma na hora de analisar o campo de batalha o salva de um desfecho desfavorável, certamente atacar aleatoriamente ou fugir de inimigos rápidos\n"
                                + "e múltiplos como estes seria uma má ideia. Agora só resta seguir seu caminho.");*/
                        break;
                    }
                    System.out.println("Numero invalido, tente novamente\n"
                            + "1-ATACAR OS FRACOS PRIMEIRO   2-ATACR O LIDER PRIMEIRO");
                }
            }
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-ENFRENTAR LOBOS  2-FUGIR");
        }
        /*System.out.println("A passos largos onde o terreno permitia você continua em sua jornada pela floresta. Algumas horas depois chega na borda de um grande rio, possivelmente o rio Lavitan, que corta a floresta com mesmo nome\n"
                + "e conhecendo bem esta parte do reino de Eresda certamente haveriam perigos naquelas águas. atravessar a nado poderia ser uma experiência bem ruim.\n"
                + "Seria mais sábio construir uma pequena jangada ou algo do gênero.\n"
                + "4-CONSTRUIR JANGADA");*/
        resp = e.nextInt();
        while (resp != 4) {
            if (resp == 4) {
                jangada();
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "4-CONSTRUIR JANGADA");
        }
        System.out.println("Parabens, voce acaba de concluir a fase 1 do ato2\n"
                + "1-INICIAR FASE 2   3-IR PARA O MENU PRINCIPAL");
        resp = e.nextInt();
        while (resp != 1 || resp != 3) {
            if (resp == 1) {
                fase2();
                break;
            }
            if (resp == 3) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "4-CONSTRUIR JANGADA");
        }
    }

    public void jangada() {
        Scanner e = new Scanner(System.in);
        //comando de usar materiais
        System.out.println("Qual item ira primeiro?\n"
                + "1-CORDAS  2-LEME  3-MADEIRAS PESADAS  4-MADEIRAS LEVES");
        int resp = e.nextInt();
        while (resp != 3) {
            if (resp == 3) {
                //comando de usar materiais
                System.out.println("Item certo! Qual item sera o segundo?\n"
                        + "1-CORDAS  2-LEME  3-MADEIRAS LEVES");
                resp = e.nextInt();
                while (resp != 1) {
                    if (resp == 1) {
                        System.out.println("Item certo! Qual item sera o terceiro?\n"
                                + "1-CORDAS  2-LEME  3-MADEIRAS LEVES");
                        resp = e.nextInt();
                        while (resp != 3) {
                            if (resp == 3) {
                                System.out.println("Item certo! Qual item sera o quarto?\n"
                                        + "1-CORDAS  2-LEME");
                                resp = e.nextInt();
                                while (resp != 1) {
                                    if (resp == 1) {
                                        System.out.println("Item certo! Qual item sera o quinto?\n"
                                                + "1-CORDAS  2-LEME");
                                        resp = e.nextInt();
                                        while (resp != 2) {
                                            if (resp == 2) {
                                                System.out.println("Item certo! Agora precisa amarrar o leme.\n"
                                                        + "1-CORDAS");
                                                resp = e.nextInt();
                                                while (resp != 1) {
                                                    if (resp == 1) {
                                                        //comando de luta
                                                        System.out.println("\nJangada construida!\n");
                                                        break;
                                                    }
                                                    System.out.println("Numero invalido, tente novamente\n"
                                                            + "1-CORDAS");
                                                }
                                                break;
                                            }
                                            System.out.println("Item errado, tente novamente\n"
                                                    + "1-CORDAS  2-LEME");
                                        }
                                        break;
                                    }
                                    System.out.println("Item errado, tente novamente\n"
                                            + "1-CORDAS  2-LEME");
                                }
                                break;
                            }
                            System.out.println("Item errado, tente novamente\n"
                                    + "1-CORDAS  2-LEME  3-MADEIRAS LEVES");
                        }
                        break;
                    }
                    System.out.println("Item errado, tente novamente\n"
                            + "1-CORDAS  2-LEME  3-MADEIRAS LEVES");
                }

                break;
            }
            System.out.println("Item errado, tente novamente\n"
                    + "1-CORDAS  2-LEME  3-MADEIRAS PESADAS  4-MADEIRAS LEVES");
        }
    }

    public void fase2() {
        Scanner e = new Scanner(System.in);
        //comando pegar item
        /*System.out.println("A tentativa de encontrar o templo falha e noite cai sobre levitan, agora a floresta\n"
                + "que já éra escura pela copa espessa das árvores durante o dia, está totalmente dominada pelo breu.\n"
                + "você pega um galho seco amarra um pedaço de pano encerado com uma vela que tem no inventário \n"
                + "para montar uma espécie de tocha, agora só resta acendê-la.\n"
                + "7-ACENDER TOCHA");*/
        int resp = e.nextInt();
        while (resp != 7) {
            if (resp == 7) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "7-ACENDER TOCHA");
        }
        /*System.out.println("a pequena chama ilumina os arredores, e os sons noturnos da floresta o deixam bem mais atento\n"
                + "que anteriormente, a noite os principais predadores saem em busca de alimento, e você certamente não pretende\n"
                + "findar seus dias nesta posição.\n"
                + "Parar e se esconder pode ser útil, mas sem ninguém para revezar na vigia pode ser perigoso, mas seguir no escuro\n"
                + "também não é nada convidativo\n"
                + "1-PARAR E DESCANSAR   2-CONTINUAR MESMO A NOITE");*/
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                /*System.out.println("Você sobe em uma grande árvore próxima, encontrando uma forquilha formada pelos galhos, ali poderia descansar\n"
                        + "seu corpo com a menor probabilidade de sofrer algum ataque durante o período em repouso. Após a escalada e acomodação,\n"
                        + "a tocha é apagada e rapidamente você cai no sono, o cansaço era evidente apesar da relutância em aceitá-lo.\n"
                        + "…\n" //comando tirar itens
                        + "Quando desperta no outro dia você agradece mentalmente por nada ter ocorrido, mas sua mochila parece estar mais leve que quando\n"
                        + "iniciou o descanso. Observando um lado dela percebe-se um rasgo em sua lateral, certamente alguma pequena criatura na procura de alimento\n"
                        + "a rasgou e furtou alguns dos seus itens.\n"
                        + "Descendo de seu posto você recolhe algumas coisas que caíram pelo rasgo, inclusive a adaga de Chunchumaru, que estava acoplada na lateral\n"
                        + "da mochila, este importante item poderia ter sido perdido. As únicas coisas que sumiram foram coisas alimentícias (definir o que tinha,\n"
                        + "possivelmente carne da caçada do começo), - dos males o menor - pensa você.\n"
                        + "agora só resta recolher os itens\n"
                        + "1- RECOLHER ITENS   2-SEGUIR SEU CAMINHO");//comando recolher itens*/
                resp = e.nextInt();
                while (resp != 1 || resp != 2) {
                    if (resp == 1) {
                      /*  System.out.println("Sem muito o que fazer resta seguir em frente na procura do templo. Seguindo, no meio da floresta você se depara com uma\n"
                                + "trilha de pedra, quase encoberta pela vegetação rasteira, certamente ela levaria ao templo, seria difícil alguma outra construção\n"
                                + "ser feita tão adentro da floresta de Lavitan.");*/
                        break;
                    }
                    if (resp == 2) {
                        break;
                    }
                    System.out.println("Numero invalido, tente novamente\n"
                            + "1- RECOLHER ITENS   2-SEGUIR SEU CAMINHOS");
                }
                /*System.out.println("Considerando que se está no interior da floresta o caminho aqui é de facil passagem, apesar da vegetação espalhar alguns galhos pelo caminho\n"
                        + "e pequenas ervas nascem nas frestas das pedras, ainda assim um caminho fácil de andar.\n"
                        + "Depois de algum tempo o caminho se alarga em um grande platô de pedra esculpida, e na outra extremidade está a entrada do templo, que adentra a\n"
                        + "elevação rochosa em sua retaguarda.  Finalmente o templo é encontrado, é só entrar.");*/
            }
            if (resp == 2) {
              /*  System.out.println("Seguindo adiante com sua tocha iluminando o ambiente e afastando as criaturas que não suportam a luz você tropeça em uma espécie de calçamento\n"
                        + "caindo e derrubando a tocha.\n"
                        + "Você levanta-se e recolhe sua fonte de visão, observando mais atentamente você percebe q os formatos geométricos do solo ali não pertencem a\n"
                        + "construções naturais, agachando-se olhando mais de perto é percebido que se trata de um caminho pavimentado com pedras.\n"
                        + "Certamente levariam para o templo, agora resta somente segui-lo\n"
                        + "4-SEGUIR CAMINHO PAVIMENTADO");*/
                resp = e.nextInt();
                while (resp != 4) {
                    if (resp == 4) {
                      /*  System.out.println("Considerando que se está no interior da floresta o caminho aqui é de fácil passagem, apesar da vegetação espalhar alguns galhos pelo caminho\n"
                                + "e pequenas ervas nascem nas frestas das pedras, ainda assim um caminho fácil de andar.\n"
                                + "Depois de algum tempo o caminho se alarga em um grande platô de pedra esculpida, como não existe vegetação nele, é possível avistar que na outra extremidade\n"
                                + "está a entrada do templo, que adentra a elevação rochosa em sua retaguarda.\n"
                                + "Finalmente o templo é encontrado, e só entrar.");*/
                        break;
                    }
                    System.out.println("Numero invalido, tente novamente\n"
                            + "4-SEGUIR CAMINHO PAVIMENTADO");
                }
            }
            System.out.println("5-ENTRAR NO TEMPLO");
            resp = e.nextInt();
            while (resp != 5) {
                if (resp == 5) {
                    templo();
                    break;
                }
                System.out.println("Numero invalido, tente novamente\n"
                        + "5-ENTRAR NO TEMPLO");
            }

            System.out.println("Numero invalido, tente novamente\n"
                    + "1-PARAR E DESCANSAR   2-CONTINUAR MESMO A NOITE");
        }
    }

    public void templo() {
        Scanner e = new Scanner(System.in);
        /*System.out.println("Você atravessa o plano pavimentado da entrada e quando se aproxima da entrada do templo, mas um som parecido com rochas rolando e se chocando lhe vem aos ouvidos,\n"
                + "mais que depressa você para e observa algo mover-se ao lado da entrada do templo.\n"
                + "E um golem de pedra, possuindo cerca de 4 metros e algumas inscrições rúnicas no rosto. Certamente feito e colocado ali para proteger qualquer entrada não autorizada\n"
                + "no templo antes de seu abandono.\n"
                + "7-LUTAR CONTRA O GOLEM");*/
        int resp = e.nextInt();
        while (resp != 7) {
            if (resp == 7) {
                //comando de luta
                //comando perda de itens
                System.out.println("o golem desfere um golpe com uma das mãos, você desvia dele com dificuldades devido a surpresa, a tocha que lhe servia com iluminação cai entre as folhas\n"
                        + "secas presentes no chão, o fogo rapidamente se espalha para uma das extremidades da área, iluminando melhor todo o local\n"
                        + "\nOs ataques não surtem dano, você vai perder inevitavelmente mas devido a adaga ele recua\n");
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "7-LUTAR CONTRA O GOLEM");
        }
        System.out.println("Após sua arma ter sido arremessada para longe com um golpe do golem desferido, o que também o derrubou, você recorre a adaga de Chunchumaru,\n"
                + "sua única arma restante, com ela em mãos encara o imponente gigante.\n"
                + "De repente ele cessa seus ataques, e as inscrições rúnicas em seu rosto começam brilhar em um tom azulado e ele retorna para o lado da entrada, sentando e ficando imóvel novamente.\n"
                + "Certamente a adaga deve ter algum poder mágico que permite a entrada no local - pensa voce.\n"
                + "Agora só resta entrar\n"
                + "2-ENTRAR NA SALA");
        resp = e.nextInt();
        while (resp != 2) {
            if (resp == 2) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "2-ENTRAR NA SALA");
        }
        System.out.println("acendendo sua tocha você adentra o templo, depois de descer algumas escadarias você chega ao altar principal, este ultimo igual ao que existe na vila de Kenko.\n"
                + "já sabendo das passagens secretas você adentra aos cômodos escondidos.\n"
                + "dessa vez no local igual ao que existia a adaga de Chunchumaru estava apenas um pergaminho, que continha os dizeres: (print dentro de um pergaminho desenhado com caracteres)\n"
                + "Se estiver lendo isto possivelmente alguém está tentando ressuscitar Darknuss, uma personificação do mal a muito tempo banida deste mundo. Os impeça!\n"
                + "Cada templo possui um fragmento de Nys, usados para selar este grande mal no passado, infelizmente os fragmentos reunidos também tem o poder de libertar Darknuss, formando o Orbe de Nys.\n"
                + "Este último, juntamente com a adaga são as ferramentas para o aprisionamento.\n"
                + "O orbe deste templo foi levado para a vila de Kenko a muitos anos.\n"
                + "\n"
                + "Por favor coloque a adaga de Chunchunmaru no altar neste cômodo, nela estão contidas diversas magias antigas de selamento, que serão incorporadas no líquido dentro do cabo da adaga, faça\n"
                + "esse processo em todos os outros templos para recarregar os poderes de selamento da adaga.\n"
                + "Reúna todos as magias e o orbe e evite que este mal assole o mundo novamente.\n"
                + "\n"
                + "Dos protetores de Xiuhno.\n"
                + "\n"
                + "\n"
                + "Terminando de ler muita coisa se esclarece para você, agora falta fazer o procedimento com a adaga.\n"
                + "9-COLOCAR ADAGA SOBRE O ALTAR DE PEDRA");
        resp = e.nextInt();
        while (resp != 9) {
            if (resp == 9) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "9-COLOCAR ADAGA SOBRE O ALTAR DE PEDRA");
        }
        System.out.println("Largando a adaga sobre o altar, ela misteriosamente começa a flutuar e uma espécie de vórtice surge no local, girando calmamente e sendo absorvidos pela adaga, o cabo desta brilha\n"
                + "intensamente. Após esta cena ela repousa novamente sobre o altar, como se nada tivesse acontecido."
                + "Agora um objetivo maior e mais nobre o aguarda.\n"
                + "\n"
                + "\n"
                + "Saindo do templo agora com destino a próxima cidade/vila Paeres era de noite quando chegou, Você está novamente no átrio externo do templo de Xiuhno da floresta de Lavitan, certamente o\n"
                + "caminho de pedra de onde você veio levará para a estrada principal que corta a floresta de Lavitan, é a melhor escolha a tomar neste momento.\n"
                + "A sua direita está o golem protetor, agora inofensivo,  como qualquer outra rocha, contrastando com seu real poder destrutivo, sem a adaga a única opção seria fugir, agora era possível\n"
                + "observar que existiam apenas alguns arranhões em sua superfície, e não foram feitos por você."
                + "1-SEGUIR ESTRADA   2-OBSERVAR");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println("seguindo pelo caminho, depois de muito andar, as pedras simplesmente foram arrancadas e a pequena trilha desfeita, restando apenas algumas remanescentes, pelo jeito do relevo\n"
                        + "lavado nesta parte o motivo era visivelmente a força d'água, com declive do terreno ela arrastou a maioria das pedras em dias de chuva durante os anos.  \n"
                        + "Ignorando este fato você segue em linha reta em direção ao sul sem mais problemas, até chegar na estrada principal.\n"
                        + "Já avistando entre a vegetação a estrada você ouve muitas vozes, e passos de muitas pessoas marchando. a essa altura é melhor ser cauteloso antes de aparecer.");
                break;
            }
            if (resp == 2) {
                System.out.println("Observando mais atentamente você nota que sao soldados fortemente armados e alguns comerciantes. Os soldados usavam o brasão do governo de Eresda, algo que você conhecia bem,\n"
                        + "os comerciantes usavam roupas normais de civis e reclamavam bastante, provavelmente por causa da ponte destruída.\n"
                        + "Seguir para Paeres com este grupo lhe parece bastante convidativo.");
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-SEGUIR ESTRADA   2-OBSERVAR");
        }
        System.out.println("Saindo do meio do mato os soldados lhe encaram por alguns momentos mas não chegam a tomar qualquer atitude, você procura alguém para perguntar.\n"
                + "1-PERGUNTAR AO COMERCIANTE   2-PERGUNTAR AO SOLDADO");
        resp = e.nextInt();
        while (resp != 1 || resp != 2) {
            if (resp == 1) {
                System.out.println("O comerciante exaltado apenas lhe fala da ponte e de uma de suas caravanas que foi atacada nas proximidades da travessia do rio Lavitan e como isso lhe causou prejuízo.\n"
                        + "Isso nao lhe esclarece muito mas o comerciante não parece interessado em falar de outra coisa. resta perguntar aos soldados.\n"
                        + "Você indaga um soldado sobre o porquê daquilo tudo, ele lhe conta que estavam averiguando os fatos da ponte caída e de comerciantes atacados na região, e também atrás de um\n"
                        + "grupo de mercenários chamado Wulfforce, que vinha causando estragos por alguns lugares do reino.");
                break;
            }
            if (resp == 2) {
                System.out.println("Você indaga um soldado sobre o porquê daquilo tudo, ele lhe conta que estavam averiguando os fatos da ponte caída e de comerciantes atacados na região, e também atrás de um\n"
                        + "grupo de mercenários chamado Wulfforce, que vinha causando estragos por alguns lugares do reino.");
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-PERGUNTAR AO COMERCIANTE   2-PERGUNTAR AO SOLDADO");
        }
        System.out.println("Você decide não lhes contar sobre sua missão, pois sabe que os governantes e comandantes de Eresda nem sempre são bem intencionados e nunca se sabe quem pode estar envolvido.\n"
                + "Mas agora ao menos já sabe o nome de quem fez isso com Kenko.\n"
                + "\n"
                + "Você acompanha a caravana até a saída da floresta de Lavitan, aproveitando de sua escolta passiva contra quaisquer perigos advindo dos arredores.\n"
                + "PARABENS VOCE ACABA DE CONCLUIR O ATO2!  O que deseja fazer agora?\n"
                + "1-INICIAR ATO 3   2-IR PARA O MENU PRINCIPAL  3-VER STATUS");
        resp = e.nextInt();
        while (resp != 1 || resp != 2 || resp != 3) {
            if (resp == 1) {
                break;
            }
            if (resp == 2) {
                break;
            }
            if (resp == 3) {
                break;
            }
            System.out.println("Numero invalido, tente novamente\n"
                    + "1-INICIAR ATO 3   2-IR PARA O MENU PRINCIPAL  3-VER STATUS");
        }

    }

}