Feature: Realizar una compra hasta el login.
  Yo como comprador de productos web
  quiero realizar una compra cierta cantidad pagina Shopee
  para validar que al final el mensaje de inicio de sesion.

#Scenario: Realizar una compra en Shopee
#  Given Me dirijo a la pagina "https://shopee.com.co/" a la seccion de categorias
#  And Selecciono la categoria "Tecnologia"
#  When estoy en la seccion "Tecnologia"
#  And y selecciono la seccion "Camara y Accesorios"
#  And selecciono el producto de mi interes
#  And selecciono el color y la cantidad
#  Then lo agrego al carrito
#  And valido el mensaje de inicio de sesion

  #.section-category-list   --categorias block
  #//*[@Class='section-category-list']//a[@href="/Tecnología-cat.11069115"]
  #//div[@class='home-category-list__group']//*[text()='Tecnología']

Scenario: Realizar una compra en Shopee
  Given Me dirijo a la pagina "https://shopee.com.co/" a la seccion de categorias
  When voy a la seccion de interes y filtro por la sub-categoria
    | seccion    | sub-categoria       |
    | Tecnologia | Camara y Accesorios |
  And selecciono el producto de mi interes
  And escogo el color y la cantidad del producto a comprar
    | color    | cantidad  |
    | Negro    | 3         |
  Then lo agrego al carrito
  And valido el mensaje de inicio de sesion

