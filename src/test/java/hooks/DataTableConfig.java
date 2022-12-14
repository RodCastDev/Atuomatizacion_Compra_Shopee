package hooks;

import Cucumber_Models.categoriaCompra;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableConfig {

    @DataTableType
    public categoriaCompra seleccion (Map<String, String> producto) throws Throwable{
        return new categoriaCompra(
                producto.get("seccion"),
                producto.get("sub-categoria"));
    }
}
