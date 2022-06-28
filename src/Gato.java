public class Gato extends Animal implements Carnivoro {
    @Override
    public void emitirSom() {
        System.out.println("miau");
    }

    @Override
    public void comer() {
        comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("Gato comendo carne");
    }
}
