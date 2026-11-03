package OrientaçãoObjetos;
/**
 * Exercício 03 - Polimorfismo e classes abstratas
 * Crie uma classe abstrata Forma com o método calcularArea() e implemente
 * Circulo e Retangulo. Percorra uma lista de formas calculando as áreas.
 */
abstract class Forma {
    public abstract double calcularArea();
}

class Circulo extends Forma {
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo extends Forma {
    private final double base;
    private final double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

public class OrientaçãoObjetos03 {
    public static void main(String[] args) {
        Forma[] formas = {new Circulo(3), new Retangulo(4, 5), new Circulo(1.5)};

        for (Forma f : formas) {
            System.out.printf("%s -> área: %.2f%n",
                    f.getClass().getSimpleName(), f.calcularArea());
        }
    }
}