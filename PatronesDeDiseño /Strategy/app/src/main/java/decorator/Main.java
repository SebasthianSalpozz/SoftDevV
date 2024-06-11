package decorator;

public class Main {
  public static void main(String[] args) {
    ComboCine comboBasico = new ComboBasicoCine();
    System.out.println("Combo básico: " + comboBasico.getDescripcion() + ", precio: $" + comboBasico.precio());

    ChocolateCaliente chocolateCaliente = new ChocolateCaliente(comboBasico);
    System.out.println("Combo básico con chocolate caliente: " + chocolateCaliente.getDescripcion() + ", precio: $" + chocolateCaliente.precio());

    Nachos nachos = new Nachos(chocolateCaliente);
    System.out.println("Combo básico con chocolate caliente y nachos: " + nachos.getDescripcion() + ", precio: $" + nachos.precio());
  }
}