package stepDefinitions;

import Actions.action;
import Cucumber_Models.categoriaCompra;
import Cucumber_Models.objetoCompra;
import Pages.Home;
import Pages.objetoPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.core.Serenity.getDriver;

public class testStepDefinitions {

    @Given("Selecciono la categoria {string}")
    public void selecciono_la_categoria(String string) {

    }
    @When("estoy en la seccion {string}")
    public void estoy_en_la_seccion(String string) {

    }
    @When("y selecciono la seccion {string}")
    public void y_selecciono_la_seccion(String string) {

    }
    @When("selecciono el color y la cantidad")
    public void selecciono_el_color_y_la_cantidad() {

    }


    //(-____________________-)//


    @Given("Me dirijo a la pagina {string} a la seccion de categorias")
    public void me_dirijo_a_la_pagina_a_la_seccion_de_categorias(String strUrl) {
        System.out.println("Given");
        action.navegateToUrl(getDriver(), strUrl);
    }
    @When("voy a la seccion de interes y filtro por la sub-categoria")
    public void voy_a_la_seccion_de_interes_y_filtro_por_la_sub_categoria(categoriaCompra categoriacompra) {
        System.out.println("seccion de interes y sub-categoria");
        System.out.println(categoriacompra.getSeccion());
        System.out.println(categoriacompra.getCategoria());
        action.clickElement(getDriver(), Home.tecnologiCategori);

    }
    @When("selecciono el producto de mi interes")
    public void selecciono_el_producto_de_mi_interes(objetoCompra objetoCompra) {
        System.out.println("Objeto a comprar");
        System.out.println(objetoCompra.getObjeto());
        action.clickElement(getDriver(), objetoPage.objetoCamera);

    }
    @When("escogo el color y la cantidad del producto a comprar")
    public void escogo_el_color_y_la_cantidad_del_producto_a_comprar(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("lo agrego al carrito")
    public void lo_agrego_al_carrito() {

    }
    @Then("valido el mensaje de inicio de sesion")
    public void valido_el_mensaje_de_inicio_de_sesion() {

    }

}
