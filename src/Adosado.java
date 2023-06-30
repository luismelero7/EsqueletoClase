public class Adosado extends Vivienda {

    private boolean jardin;


    public Adosado(boolean jardin) {

        this.jardin = jardin;
    }
    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }
}
