#Author: pacho0323@hotmail.com

@tag
Feature: Agencia de viajes
  Yo como usuario 
  quiero buscar la tarifa economica en diferentes destinos

  @tag1
  Scenario: Buscar tarifa mas economica
    Given que el usuario se encuentre en la pagina web
    When realice la busqueda con los datos solicitados
    And buscara el precio mas economico
    Then valide el precio Total