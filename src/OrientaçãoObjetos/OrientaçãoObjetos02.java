package OrientaçãoObjetos;
/**
 * Exercício 02 - Herança
 * Crie uma classe Animal e subclasses Cachorro e Gato que sobrescrevem o método emitirSom().
 */
class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som.");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au au!");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }
}

public class OrientaçãoObjetos02 {
    public static void main(String[] args) {
        Animal generico = new Animal("Animal");
        Cachorro rex = new Cachorro("Rex");
        Gato mia = new Gato("Mia");

        generico.emitirSom();
        rex.emitirSom();
        mia.emitirSom();
    }
}