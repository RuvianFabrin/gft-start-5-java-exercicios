package one.digitalinnovation.basecamp;

public class Mensagem {
    public static void avaliacaoDoHorario(int horario) {
        if (horario >= 0 && horario <= 12) {
            bomDia();
        } else if (horario >= 13 && horario <= 18) {
            boaTarde();
        } else if (horario >= 19 && horario <= 24) {
            boaNoite();
        } else {
            System.out.println("Horário inválido!");
        }
    }
        
    public static void bomDia() {
        System.out.println("Bom dia!");
    }
    public static void boaTarde() {
        System.out.println("Boa tarde!");
    }
    public static void boaNoite() {
        System.out.println("Boa noite!");
    }
}
