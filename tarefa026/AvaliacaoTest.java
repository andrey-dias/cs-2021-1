package br.com.gilmar;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AvaliacaoTest {

	@Test
	public void shouldThrowValoresInvalidosExceptionWhenCargaHorariaMenorQueZero() {
		//Arrange
		double n1 = 5;
		double n2 = 5;
		double faltas = 0;
		double cargaHoraria = -1;
		Avaliacao av = new Avaliacao();
		
		//Assert
		Assert.assertThrows(ValoresInvalidosException.class, () -> {
			//Act
			av.avalia(n1, n2, faltas, cargaHoraria);
		});
	}
	
	@Test
	public void shouldThrowValoresInvalidosExceptionWhenFaltasMenorQueZero() {
		//Arrange
		double n1 = 5;
		double n2 = 5;
		double faltas = -1;
		double cargaHoraria = 10;
		Avaliacao av = new Avaliacao();
		
		//Assert
		Assert.assertThrows(ValoresInvalidosException.class, () -> {
			//Act
			av.avalia(n1, n2, faltas, cargaHoraria);
		});
	}
	
	@Test
	public void shouldThrowValoresInvalidosExceptionWhenFaltasMaiorQueCargaHoraria() {
		//Arrange
		double n1 = 5;
		double n2 = 5;
		double faltas = 10;
		double cargaHoraria = 5;
		Avaliacao av = new Avaliacao();
		
		//Assert
		Assert.assertThrows(ValoresInvalidosException.class, () -> {
			//Act
			av.avalia(n1, n2, faltas, cargaHoraria);
		});
	}
	
	@Test
	public void shouldThrowValoresInvalidosExceptionWhenNota1MenorQueZero() {
		//Arrange
		double n1 = -1;
		double n2 = 5;
		double faltas = 0;
		double cargaHoraria = 10;
		Avaliacao av = new Avaliacao();
		
		//Assert
		Assert.assertThrows(ValoresInvalidosException.class, () -> {
			//Act
			av.avalia(n1, n2, faltas, cargaHoraria);
		});
	}
	
	@Test
	public void shouldThrowValoresInvalidosExceptionWhenNota1MaiorQue10() {
		//Arrange
		double n1 = 11;
		double n2 = 5;
		double faltas = 0;
		double cargaHoraria = 10;
		Avaliacao av = new Avaliacao();
		
		//Assert
		Assert.assertThrows(ValoresInvalidosException.class, () -> {
			//Act
			av.avalia(n1, n2, faltas, cargaHoraria);
		});
	}
	
	@Test
	public void shouldThrowValoresInvalidosExceptionWhenNota2MenorQueZero() {
		//Arrange
		double n1 = 5;
		double n2 = -1;
		double faltas = 0;
		double cargaHoraria = 10;
		Avaliacao av = new Avaliacao();
		
		//Assert
		Assert.assertThrows(ValoresInvalidosException.class, () -> {
			//Act
			av.avalia(n1, n2, faltas, cargaHoraria);
		});
	}
	
	@Test
	public void shouldThrowValoresInvalidosExceptionWhenNota2MaiorQue10() {
		//Arrange
		double n1 = 5;
		double n2 = 11;
		double faltas = 0;
		double cargaHoraria = 10;
		Avaliacao av = new Avaliacao();
		
		//Assert
		Assert.assertThrows(ValoresInvalidosException.class, () -> {
			//Act
			av.avalia(n1, n2, faltas, cargaHoraria);
		});
	}
	
	@Test
	public void shouldReturnReprovadoPorFaltasWhenFaltasMaiorQue25PorcentoDaCargaHoraria() throws ValoresInvalidosException{
		//Arrange
		double n1 = 5;
		double n2 = 5;
		double faltas = 3;
		double cargaHoraria = 10;
		Avaliacao av = new Avaliacao();
		
		//Act
		String resultadoObtido = av.avalia(n1, n2, faltas, cargaHoraria);
		
		//Assert
		String resultadoEsperado = "Reprovado por Falta.";
		
		Assert.assertTrue(resultadoEsperado.equals(resultadoObtido));
	}
	
	@Test
	public void shouldReturnReprovadoPorMediaWhenMediaFinalMenorQue3() throws ValoresInvalidosException {
		//Arrange
		double n1 = 2;
		double n2 = 3;
		double faltas = 0;
		double cargaHoraria = 10;
		Avaliacao av = new Avaliacao();
				
		//Act
		String resultadoObtido = av.avalia(n1, n2, faltas, cargaHoraria);
				
		//Assert
		String resultadoEsperado = "Reprovado por Média.";
				
		Assert.assertTrue(resultadoEsperado.equals(resultadoObtido));
	}
	
	@Test
	public void shouldReturnProvaExtraWhenMediaFinalEntre3E6() throws ValoresInvalidosException {
		//Arrange
		double n1 = 5;
		double n2 = 5;
		double faltas = 0;
		double cargaHoraria = 10;
		Avaliacao av = new Avaliacao();
				
		//Act
		String resultadoObtido = av.avalia(n1, n2, faltas, cargaHoraria);
				
		//Assert
		String resultadoEsperado = "Prova Extra.";
				
		Assert.assertTrue(resultadoEsperado.equals(resultadoObtido));
	}
	
	@Test
	public void shouldReturnAprovadoWhenMediaFinalMaiorIgualA6() throws ValoresInvalidosException {
		//Arrange
		double n1 = 7;
		double n2 = 7;
		double faltas = 0;
		double cargaHoraria = 10;
		Avaliacao av = new Avaliacao();
				
		//Act
		String resultadoObtido = av.avalia(n1, n2, faltas, cargaHoraria);
				
		//Assert
		String resultadoEsperado = "Aprovado.";
				
		Assert.assertTrue(resultadoEsperado.equals(resultadoObtido));
	}
}