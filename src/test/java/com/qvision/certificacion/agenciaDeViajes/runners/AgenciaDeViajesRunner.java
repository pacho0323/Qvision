package com.qvision.certificacion.agenciaDeViajes.runners;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import com.qvision.certificacion.agenciaDeViajes.utils.BeforeSuite;
import com.qvision.certificacion.agenciaDeViajes.utils.DataToFeature;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features="src/test/resources/features/AgenciaDeViajes.feature", 
glue="com/qvision/certificacion/agenciaDeViajes/steps/", 
snippets=SnippetType.CAMELCASE)
public class AgenciaDeViajesRunner {
	@BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/AgenciaDeViajes.feature");
    }
}
