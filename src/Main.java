public class Main {
    public static void main(String[] args) {
        var cachorro = new Cachorro();
        var gato = new Gato();
        var vaca = new Vaca();

        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();

        comerAnimal(cachorro);
        comerAnimal(gato);
        comerAnimal(vaca);
    }

    private static void comerAnimal(Animal animal) {
        animal.comer();
    }
}
