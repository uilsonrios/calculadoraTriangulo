package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculoTrianguloStepDefinitions {

    private WebDriver driver;

    @Before /*Abertura do navegador google Chrome*/
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Dado("^que estou na pagina de calculo de triangulos$")
    public void que_estou_na_pagina_de_calculo_de_triangulos() {
        driver.manage().window().maximize();
        driver.get("https://calculadoratriangulo.herokuapp.com/calculadora.php"); /*Acessa o link da Calculadora*/
    }

    @Dado("^informo o primeiro lado do triangulo (\\d+)$") /*É Informado o primeiro lado do triangulo*/
    public void informo_o_primeiro_lado_do_triangulo(int lado1)  {
        driver.findElement(By.id("lado1")).sendKeys(String.valueOf(lado1));
    }

    @Dado("^informo o segundo lado do triangulo (\\d+)$") /*É Informado o segundo lado do triangulo*/
    public void informo_o_segundo_lado_do_triangulo(int lado2) {
        driver.findElement(By.id("lado2")).sendKeys(String.valueOf(lado2));
    }

    @Dado("^informo o terceiro lado do triangulo (\\d+)$") /*É Informado o terceiro lado do triangulo*/
    public void informo_o_terceiro_lado_do_triangulo(int lado3) {
        driver.findElement(By.id("lado3")).sendKeys(String.valueOf(lado3));
    }

    @Quando("^eu clico no botao calcular$") /*É Realizado o click no botão calcular*/
    public void eu_clico_no_botao_calcular() {
        driver.findElement(By.id("calcular")).click();
    }

    @Entao("^a seguinte texto deve ser exibido \"(.*?)\"$") /*Valida o Tipo de Triangulo Calculado*/
    public void a_seguinte_texto_deve_ser_exibido(String texto) {
        Assert.assertEquals(texto, driver.findElement(By.id("message")).getText());
    }

    @After /*Fecha o Navegador*/
    public void fechaNavegador(){
        driver.quit();
    }

}
