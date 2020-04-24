package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import app.armas.Anduril;
import app.armas.ArcoYFlecha;
import app.armas.Arma;
import app.armas.Baculo;
import app.armas.Espada;
import app.armas.HachaDoble;
import app.armas.Sting;
import app.interfaces.IEsMagico;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.personajes.criaturas.Elfo;
import app.personajes.criaturas.Enano;
import app.personajes.criaturas.Goblin;
import app.personajes.criaturas.Hobbit;
import app.personajes.criaturas.Orco;
import app.personajes.humanos.Humano;
import app.personajes.humanos.Wizard;
import app.reliquias.Reliquia;
import app.reliquias.reliquias_anillos.AnilloElfico;
import app.reliquias.reliquias_anillos.AnilloNarya;
import app.reliquias.reliquias_anillos.AnilloUnico;
import app.reliquias.reliquias_fisicas.ChalecoDeMithril;




public class JuegoLOTR {
    ArrayList<Arma> armas = chequearInventario();
    ArrayList<Personaje> personajes = listaPersonajes();
    public static ArrayList<Reliquia> reliquias = listaReliquias();
    public static Scanner Teclado = new Scanner(System.in);
    public static Random random = new Random();
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static ArrayList<Reliquia> listaReliquias() {
        ArrayList<Reliquia> reliquias = new ArrayList<>();

        Reliquia soyReliquia1 = new AnilloNarya("soyAnilloNarya", 0.20, 0.30, 1);
        reliquias.add(soyReliquia1);
        Reliquia soyReliquia2 = new AnilloUnico("soyAnilloUnico", 0.20, 0.30, 1);
        reliquias.add(soyReliquia2);
        Reliquia chaleco = new ChalecoDeMithril("Chaleco Mithril", 0.10, 0.40);
        reliquias.add(chaleco);

        return reliquias;
    }

    
    public static ArrayList<Arma> inventario = new ArrayList<>();
    public ArrayList<Arma> chequearInventario() {

        Anduril anduril = new Anduril("Anduril", 25, 15, 15);
        inventario.add(anduril);
        ArcoYFlecha arcoYFlecha = new ArcoYFlecha("Arco y Flecha", 2, 1);
        inventario.add(arcoYFlecha);
        Baculo baculo = new Baculo("Baculo", 50, 30, 50);
        inventario.add(baculo);
        Espada espada = new Espada("Espada", 35, 20);
        inventario.add(espada);
        HachaDoble hachaDoble = new HachaDoble("Hacha Doble", 30, 30);
        inventario.add(hachaDoble); 
        Sting sting = new Sting("Sting", 20, 20, 25);
        inventario.add(sting);
       return inventario;           

    }

    public Arma buscarInventario(String nombre){
        for (Arma a: JuegoLOTR.inventario) {

            if (inventario.equals(nombre))
                return a;
        }
        return null;

    }
       
    public static ArrayList<Personaje> listaPersonajes() {

        ArrayList<Personaje> personajes = new ArrayList<>();

        Humano humano1 = new Humano("Faramir", 100, 100);
        personajes.add(humano1);

        Humano humano2 = new Humano("Aragorn", 100, 100);
        personajes.add(humano2);

        Humano humano3 = new Humano("Enethor II", 100, 100);
        personajes.add(humano3);

        Wizard wizard1 = new Wizard();
        wizard1.setNombre("Gandalf");
        wizard1.setStamina(100);
        personajes.add(wizard1);

        Wizard wizard2 = new Wizard("Saruman", 100);
        personajes.add(wizard2);

        Wizard wizard3 = new Wizard("Sauron", 100);
        personajes.add(wizard3);

        Elfo personajesElfico1 = new Elfo("Legolas", 90, 30, 25);
        personajes.add(personajesElfico1);

        Elfo personajesElfico2 = new Elfo("Aegnor", 90, 30, 25);
        personajes.add(personajesElfico2);

        Elfo personajesElfico3 = new Elfo("Galadriel", 90, 30, 25);
        personajes.add(personajesElfico3);

        Enano enano1 = new Enano("Durin", 100, 100);
        personajes.add(enano1);

        Enano enano2 = new Enano("Torin", 100, 100);
        personajes.add(enano2);

        Enano enano3 = new Enano("Gimli", 100, 100);
        personajes.add(enano3);

        Goblin goblin1 = new Goblin("Thirvia", 100, 100);
        personajes.add(goblin1);

        Hobbit hobbit1 = new Hobbit("Frodo", 100, 100);
        personajes.add(hobbit1);

        Hobbit hobbit2 = new Hobbit("Bilbo", 100, 100);
        personajes.add(hobbit2);

        Hobbit hobbit3 = new Hobbit("Sam", 100, 100);
        personajes.add(hobbit3);

        Orco orco1 = new Orco("Ugluk", 100, 100);
        personajes.add(orco1);

        Orco orco2 = new Orco("Mauhur", 100, 100);
        personajes.add(orco2);

        return personajes;
    }

    public void menuInicializacion() {

        int salir = 0;
        do {
            System.out.println("Bienvenido al mejor juego del mundo, LORD OF THE RINGS!");
            System.out.println("Para dar comienzo a la batalla, elige un personaje:");
            System.out.println("...............................................");
            System.out.println("SELECCIONA LA MODALIDAD DE JUEGO: ");
            System.out.println("1. Para jugar contra BOT");
            System.out.println("2. Para jugar 1vs1");
            System.out.println("0. Si quieres regresar atrás");

            int respuesta = Teclado.nextInt();

            switch (respuesta) {
                case 1:

                    combateContraBot();

                    break;
                case 2:

                    combateContraPlayer();

                    break;
                default:
                    System.out.println("Elige una opcion!");
                    break;
            }

        } while (salir != 0);
    }

    public void combateContraBot() {

        Personaje player1 = new Personaje();
        Personaje cpuBot = new Personaje();
        int posicionRandom;
        int salir = 1;

        do {
            System.out.println("Selecciona un personaje:");
            mostrarPersonaje();
            int respuesta = Teclado.nextInt();

            if (respuesta == 0) {
                menuInicializacion();
            } else if (respuesta > 0 || respuesta < personajes.size()) {

                player1 = personajes.get(respuesta - 1);
                System.out.println("¡Gran elección! Tu personaje es: " + player1.getNombre());
            }

            posicionRandom = random.nextInt(personajes.size()) + 1;
            cpuBot = personajes.get(posicionRandom);

            System.out.println("El cpu eligió: " + cpuBot.getNombre());

            iniciarCombateContraCPU(player1, cpuBot);
            salir = 0;

        } while (salir != 0);
    }

    public void combateContraPlayer() {

        ArrayList<Personaje> personajes = listaPersonajes();
        Personaje player1 = new Personaje();
        Personaje player2 = new Personaje();
        int salir = 1;

        do {
            System.out.println("PLAYER 1, selecciona tu personaje!");
            mostrarPersonaje();
            int respuesta = Teclado.nextInt();

            if (respuesta == 0) {
                menuInicializacion();
            } else if (respuesta > 0 || respuesta < personajes.size()) {

                player1 = personajes.get(respuesta - 1);
                System.out.println("¡Gran elección, Player 1! Tu personaje es: " + player1.getNombre());
            }

            System.out.println("PLAYER 2, selecciona tu personaje!");
            mostrarPersonaje();
            int respuesta2 = Teclado.nextInt();

            if (respuesta2 == 0) {
                menuInicializacion();
            } else if (respuesta2 > 0 || respuesta2 < personajes.size()) {

                player2 = personajes.get(respuesta2 - 1);
                System.out.println("¡Gran elección, Player 2! Tu personaje es: " + player2.getNombre());

            }

            iniciarCombate(player1, player2);
            salir = 0;

        } while (salir != 0);

    }

    public JuegoLOTR iniciarCombate(Personaje player1, Personaje player2) {

        System.out.println("Inicia el combate");
        Personaje ganadorCombate;
        String color;
        boolean turnoPlayer1 = true;

        player1.seleccionArmaPrincipal();

        player2.seleccionArmaPrincipal();        

        if (player1 instanceof ILlevaReliquia) {

            ((ILlevaReliquia) player1).seleccionReliquiaPrincipal();
        }
        if (player2 instanceof ILlevaReliquia) {

            ((ILlevaReliquia) player2).seleccionReliquiaPrincipal();
        }

        while (player1.estaVivo() && player2.estaVivo()) {

            Personaje atacante;
            Personaje atacado;

            color = turnoPlayer1 ? ANSI_PURPLE : ANSI_YELLOW;
            atacante = turnoPlayer1 ? player1 : player2;
            atacado = turnoPlayer1 ? player2 : player1;

            System.out.println(color + "Ataca: " + atacante.getNombre() + " y tiene una vida de: " + atacante.getSalud()
                    + " y una stamina de: " + atacante.getStamina() + ANSI_RESET);

                    /*

            if (atacante instanceof IHaceMagia && atacante instanceof ILlevaReliquia) {
                // entran los Elfos y Wizard, usan magia
                eligeAtaqueMagico(atacado, atacante);
                

            } else if (atacante instanceof ILlevaReliquia) {
                // entran los Humanos y los Hobbit, no usan magia
                System.out.println("Soy un personaje con reliquia");
                eligeAtaqueReliquia(atacado, atacante);      
                
                */



            if (atacante.getStamina() > atacante.getArma().getStamina()) {
                // Entran los Orcos, Goblin, Ennano, Troll
                
                elegirArma(atacante, atacado);

            } else if (atacante.getStamina() < atacante.getArma().getStamina()) {
                atacante.usarPosionStamina(atacante);
            }

            if (atacado.getSalud() < 1) {
                atacado.usarRevivir();
            }

            atacado.regeneracionVida();
            atacado.regeneracionStamina();

            turnoPlayer1 = !turnoPlayer1;
        }

        if (player1.getSalud() > 0) {
            ganadorCombate = player1;
        } else {
            ganadorCombate = player2;
        }
        ganadorDelCombate(ganadorCombate);
        return null;
    }

    public void iniciarCombateContraCPU(Personaje player, Personaje cpuBot) {

        System.out.println("Inicia el combate contra Bot");
        int turno = 1;
        Personaje ganadorCombate;

        if (player instanceof ILlevaReliquia) {

            Reliquia soyReliquia2 = new AnilloNarya("soyAnillo", 0.20, 0.30, 1);
            ((ILlevaReliquia) player).setReliquia(soyReliquia2);

        }

        while (player.estaVivo() && cpuBot.estaVivo()) {

            if (turno == 1) {

                System.out.println();
                System.out.println("Selecciona un arma " + player.getNombre() + " para usar:");
                System.out.println();

                int respuesta = seleccionarArmas();
                Arma armaActual = armas.get(respuesta - 1);

                if (player instanceof IHaceMagia && player instanceof ILlevaReliquia) {

                    System.out.println("Hola soy Elfo o Wizard");
                    // entran los Elfos y Wizard nada mas
                    if ((((ILlevaReliquia) player).getReliquia() instanceof AnilloElfico
                            && armaActual instanceof IEsMagico)) {
                        System.out.println("Soy un elfo con anillo elfico");

                        ((IHaceMagia) player).ataqueEpico(cpuBot, armaActual);

                    } else
                        player.atacar(cpuBot, armaActual);

                } else if (player instanceof ILlevaReliquia) {
                    System.out.println("Soy un personaje con reliquia");
                    player.atacar(cpuBot, armaActual);
                    // entran los Humanos y los Hobbit

                } else if (player.getStamina() > armaActual.getStamina()) {
                    // entran los demas personajes Enano, Troll, Orco, Goblin que tengan stamina.

                    player.atacar(cpuBot, armaActual);
                    System.out.println(ANSI_PURPLE + "Soy: " + player.getNombre() + "Ataque a: " + cpuBot.getNombre()
                            + ANSI_RESET);
                    System.out.println("Quedo con vida: " + cpuBot.getSalud());
                } else if (player.getStamina() < armaActual.getStamina()) {
                    // entran los demas personajes Enano, Troll, Orco, Goblin para usar posion de
                    // stamina.

                    player.usarPosionStamina(player);
                    System.out.println("Me cure estamina" + player.getNombre());
                }

                turno = 0;
            } else if (turno == 0) {
                Arma armaActual;
                Random random = new Random();
                int posicionRandom = random.nextInt(armas.size()) + 1;
                armaActual = armas.get(posicionRandom);

                cpuBot.atacar(player, armaActual);

                System.out.println(
                        ANSI_GREEN + "Deje a: " + player.getNombre() + " con vida: " + player.getSalud() + ANSI_RESET);

                turno = 1;
            }

        }

        if (player.getSalud() > 0) {
            ganadorCombate = player;
        } else {
            ganadorCombate = cpuBot;
        }
        ganadorDelCombate(ganadorCombate);

    }

    public static void ganadorDelCombate(Personaje ganadorCombate) {

        System.out.println("Y el ganador es... Player " + ganadorCombate.getNombre());

    }

    public Personaje buscarPersonaje(String nombre) {
        for (Personaje p : this.personajes) {
            if (p.getNombre().equals(nombre))
                return p;
        }
        return null;
    }

    public void mostrarPersonaje() {
        int acumulador = 0;
        for (Personaje p : this.personajes) {
            acumulador++;
            System.out.println(acumulador + ". " + p.getNombre() + " Esta vivo: " + p.estaVivo());
        }
        System.out.println("0. Regresar al Menu");
        System.out.println();
    }

    public static void imprimirPersonajes() {

        ArrayList<Personaje> personajes = JuegoLOTR.listaPersonajes();
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println(
                    i + 1 + ". " + personajes.get(i).getNombre() + " Esta vivo: " + personajes.get(i).estaVivo());
        }
    }

    

    public static int seleccionarArmas() {

        int acumulador = 0;
        for (Arma a : inventario) {
            acumulador++;
            System.out.println(acumulador + ". " + a.getNombre() + " y tiene un danio de: " + a.getDanio());
        }
        int respuesta = Teclado.nextInt();

        return respuesta;
      
    }

    /*

    public int elegirArma() {

        for (int i = 0; i < armas.size(); i++) {
            System.out.println(i+1 + ". " + armas.get(i).getNombre() + 
            " Con danio de: " + armas.get(i).getDanio());
        }
        int respuesta = Teclado.nextInt();        
        return respuesta;
    }
*/
    public static void elegirArma(Personaje atacante, Personaje atacado) {
        System.out.println("Elija un arma");
        System.out.println("1. Espada (Anduril, Sting o Espada común)");
        System.out.println("2. Arco y flecha");
        System.out.println("3. Baculo");
        System.out.println("4. Hacha doble");
        int choice = Teclado.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Seleccionando Espada... loading...");
                atacante.clavarEspada(atacado, atacante);
                break;
            case 2:
                System.out.println("Seleccionando Arco y flecha... loading");
                atacante.setArma(inventario.get(1));
                atacante.dispararFlecha(atacado);
                break;
            case 3:
                System.out.println("Seleccionando Baculo... loading");
                atacante.setArma(inventario.get(2));
                atacante.usarBaculo(atacado);
                break;
            case 4:
                System.out.println("Seleccionando Hacha doble... loading");
                atacante.setArma(inventario.get(4));
                atacante.clavarHacha(atacado);
                break;
            default:
                System.out.println("Opción inválida, elija entre 1, 2, 3 o 4!");
                break;

        }

    }

    public static int elegirReliquia() {
        int acumulador = 0;
        for (Reliquia r : reliquias) {
            acumulador++;
            System.out.println(acumulador + ". " + r.getNombre() + " y tiene un factor dano de: " + r.getFactorDeAtaque());
        }
        int respuesta = Teclado.nextInt();

        return respuesta;
    }

    public void usoAtaqueEpico(Personaje atacado, Arma armaActual) {

        IHaceMagia atacanteSupremo = (IHaceMagia) this;
        IEsMagico armaPoderosa = (IEsMagico) armaActual;
        if(atacanteSupremo.getEnergiaMagica() > armaPoderosa.getEnergiaMagica()){
            atacanteSupremo.ataqueEpico(atacado, armaActual);
            int restaMagia = atacanteSupremo.getEnergiaMagica() - armaPoderosa.getEnergiaMagica();
            atacanteSupremo.setEnergiaMagica(restaMagia);
        } else System.out.println("Uyyy, no pudiste ejecutar ataque epico!! Te falta magia");
                
    }

    public void eligeAtaqueMagico(Personaje atacado, Personaje atacante) {

        System.out.println("Selecciona que ataque quieres ejecutar: ");
        System.out.println();
        System.out.println("1. Ataque de hielo epico poderoso");
        System.out.println("2. Ataque con Ojo Sauron");
        System.out.println("3. Invocar a Ulmo");
        System.out.println("4. Despiadado");

        int respuesta = Teclado.nextInt();

        switch (respuesta) {
            case 1:
                ((IHaceMagia) atacante).ataqueEpicoPoderoso(atacado);   
                break;
            case 2:
                (atacante).atacarConOjoSauron(atacado);; //ataque repetido en el switch de abajo
                break;
            case 3:

                
                break;
            case 4:
                
                break;
        
            default:
                break;
        }



    }

    public void usoHielo(Personaje atacado) {
        

    }

    public void eligeAtaqueReliquia(Personaje atacado, Personaje atacante) {

        System.out.println("Selecciona que ataque quieres ejecutar: ");
        System.out.println();
        System.out.println("1. Invocacion de Nazgul");
        System.out.println("2. Ataque Multiples flechas");
        System.out.println("3. Ataque anillo poderoso");
        System.out.println("4. Ataque ayuda de Smeagol");

        int respuesta = Teclado.nextInt();

        switch (respuesta) {
            case 1:                
                atacante.atacarConOjoSauron(atacado);  //este ataque está repetido en el switch de arriba!!
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
        
            default:
                break;
        }

    }

    public void eligeAtaqueSencillo() {

        System.out.println("Selecciona que ataque quieres ejecutar: ");
        System.out.println();
        System.out.println("1. Ataque tirar Roca");
        System.out.println("2. Ataque adsorber energia");
        System.out.println("3. Ataque Bruto");
        System.out.println("4. Ataque especial");

        int respuesta = Teclado.nextInt();

        switch (respuesta) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
        
            default:
                break;
        }

    }

    public void usoAtaqueEpico(Personaje atacante, Personaje atacado, Arma armaActual) {
        IHaceMagia atacanteSupremo = (IHaceMagia) atacante;
        IEsMagico armaPoderosa = (IEsMagico) armaActual;
        if(atacanteSupremo.getEnergiaMagica() > armaPoderosa.getEnergiaMagica()){
            atacanteSupremo.ataqueEpico(atacado, armaActual);
            int restaMagia = atacanteSupremo.getEnergiaMagica() - armaPoderosa.getEnergiaMagica();
            atacanteSupremo.setEnergiaMagica(restaMagia);
        } else System.out.println("Uyyy, no pudiste ejecutar ataque epico!! Te falta magia");
                
    }

}