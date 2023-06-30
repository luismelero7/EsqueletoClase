

public class Urbanizacion {

    Vivienda [][] U;

    //las filas 0 y 1 son adosados y el resto son edificios.


    public Urbanizacion(){
        U = new Vivienda[10][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++)
                U[i][j] = new Adosado(true);
        }
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 5; j++)
                U[i][j] = new Edificio();
        }
    }

    public void mostrarUrbanizacion() {
        for (int i = 0; i < U.length; i++) {
            for (int j = 0; j < U[i].length; j++) {
                System.out.print(U[i][j].getClass() + " "+ U[i][j].getNumCatastro() + " ");
            }
            System.out.println();
        }
    }









}
