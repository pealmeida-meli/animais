public class Cachorro extends Animal implements Carnivoro {
    @Override
    public void emitirSom() {
        System.out.println("auau");
    }

    @Override
    public void comer() {
        comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("Cachorro comendo carne");
    }
}
