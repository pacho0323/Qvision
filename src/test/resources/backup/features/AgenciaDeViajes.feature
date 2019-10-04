#Author: pacho0323@hotmail.com

@tag
Feature: Agencia de viajes
  Yo como usuario 
  quiero buscar la tarifa mas barata en diferentes destinos

  @tag1
  Scenario Outline: Buscar tarifa mas barata
    Given que el usuario se encuentre en la pagina web
    When realice la busqueda con los datos solicitados
    | LOCATION | MES INICIO | ANO INICIO | DIA INICIO | MES FIN | ANO FIN | DIA FIN | ROOMS |	ADULTS	| CHILDREN | 
    Then buscara el precio mas economico   	

	Examples: 
      | Data |
 	##@externaldata@./src/test/resources/datadriven/AgenciaDeViajes.xlsx@Datos   