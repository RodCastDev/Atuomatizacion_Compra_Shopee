package Cucumber_Models;

public class categoriaCompra {
    private String seccion;
    private String subCategoria;

    public categoriaCompra(String seccion, String subCategoria) {
        this.seccion = seccion;
        this.subCategoria = subCategoria;
    }
    public String getSeccion() {
        return seccion;
    }
    public String getCategoria() {
        return subCategoria;
    }
}


