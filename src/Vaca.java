public class Vaca extends Animal implements Herbivoro {
    @Override
    public void emitirSom() {
        System.out.println("mu");
    }

    @Override
    public void comer() {
        comerPasto();
    }

    @Override
    public void comerPasto() {
        System.out.println("Vaca comendo pasto");
    }
}
