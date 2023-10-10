#language: es

Característica: Compra de productos de la categoria "Amor"

  Escenario: Seleccionara dos productos de la categoria "Amor" para agregarlos al carro de compras
    Dado que el usuario abre la pagina de Floristeria Mundo Flor
    Cuando el usuario seleccione la categoria "Amor"
    Y el usuario selecciona el primer producto de la lista
    Y agraga el producto al carro de comras
    Y selecciona otro producto de la pagina
    Entonces el usuario agrgara el segundo producto al carro de compras