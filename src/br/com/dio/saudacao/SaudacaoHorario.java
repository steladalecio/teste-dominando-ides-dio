package br.com.dio.saudacao;


public class SaudacaoHorario {
    public static void saudacaoHorario(int horas) {
        switch (horas) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mensagemBomdia();
                System.out.println("Bom dia");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoatarde();
                System.out.println("Bom tarde");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoanoite();
                System.out.println("Boa noite");
                break;

            default:
                System.out.println("Hora inválida: ");
                break;
        }
    }

    private static void mensagemBoanoite() {
    }

    private static void mensagemBomdia() {
    }

    private static void mensagemBoatarde() {
    }
}