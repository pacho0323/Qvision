package com.qvision.certificacion.agenciaDeViajes.steps;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.qvision.certificacion.agenciaDeViajes.pages.AgenciaDeViajesPages;
import com.qvision.certificacion.agenciaDeViajes.pages.PreciosHotelPages;
import com.qvision.certificacion.agenciaDeViajes.pages.TarifaNetaPages;
import com.qvision.certificacion.agenciaDeViajes.utils.CalcularTarifa;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AgenciaDeViajesStepDefinitions {
	//hola mama como estas
	AgenciaDeViajesPages agenciaDeViajes;
	PreciosHotelPages preciosHotelPages;
	TarifaNetaPages tarifaNetaPages;
	
	@Given("^que el usuario se encuentre en la pagina web$")
	public void queElUsuarioSeEncuentreEnLaPaginaWeb()  {	    

		agenciaDeViajes.open();
	}


	@When("^realice la busqueda con los datos solicitados$")
	public void realiceLaBusquedaConLosDatosSolicitados(List<String> datos) throws InterruptedException, ParseException  {
		agenciaDeViajes.abrirUbicaciones(datos.get(0));
	    agenciaDeViajes.abrirCalendario();
	    agenciaDeViajes.seleccionarFecha(datos.get(1), datos.get(2),datos.get(3));
	    agenciaDeViajes.abrirSegundoCalendario();
	    agenciaDeViajes.seleccionarFechaDos(datos.get(4),datos.get(5),datos.get(6));
	    agenciaDeViajes.seleccionarRooms(datos.get(7));
		System.out.println(datos.get(8));
		//String greeting = System.getenv("dato");
	    agenciaDeViajes.seleccionarAdultos(datos.get(8));
	    agenciaDeViajes.seleccionarChildren(datos.get(9));
	    agenciaDeViajes.buscarHotel();
	}
	
	@When("^buscara el precio mas economico$")
	public void buscaraElPrecioMasEconomico(List<String> datos) throws InterruptedException, ParseException, FilloException  {
	    preciosHotelPages.buscarPrecioMasBajo(datos.get(0), datos.get(1),datos.get(2),datos.get(3),datos.get(4),datos.get(5));
	}

	@Then("^valide el precio Total$")
	public void valideElPrecioTotal() throws NumberFormatException, FilloException  {
		CalcularTarifa calcularTarifa=new CalcularTarifa();
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(calcularTarifa.laTarifa(), tarifaNetaPages.tarifaNeta());
	}
  
}
