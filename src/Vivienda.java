import java.util.Random;

public abstract class Vivienda {
    int numCatastro;

    private Propietario propietario;



    public Vivienda()   {
        Random r = new Random();
        this.numCatastro = r.nextInt(1000000, 9999999);
        propietario= new Propietario(r.nextInt(100000, 999999));

    }


    public int getNumCatastro() {
        return numCatastro;
    }

    public void setNumCatastro(int numCatastro) {
        this.numCatastro = numCatastro;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
