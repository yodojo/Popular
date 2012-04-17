import junit.framework.Assert;

import org.junit.Test;

public class LeitorResultadosTest {

	LeitorResultados leitor = new LeitorResultados();
		
	@Test
	public void deveValidarNumeroCorretoDeColunas(){
		
		String entrada =    "2" + "\n" +
							"0 1" + "\n"+
							"1 1";
		Assert.assertTrue(leitor.validaEntrada(entrada));
		
		
	}
	
	@Test
	public void deveValidarNumeroErradoDeColunas(){
		

		String entrada =    "2" + "\n" +
							"0 3 1" + "\n"+
							"1 1";
		Assert.assertFalse(leitor.validaEntrada(entrada));
		
		
	}
	
	
	@Test
	public void deveValidarNumeroCorretoDeLinhas(){
		
		String entrada =    "2" + "\n" +
							"0 1" + "\n"+
							"1 1";
		Assert.assertTrue(leitor.validaEntrada(entrada));
		
		
	}
	
	
	@Test
	public void deveValidarNumeroErradoDeLinhas(){
		

		String entrada =    "2" + "\n" +
							"0 1" + "\n"+
							"1 0" + "\n"+
							"1 1";
		Assert.assertFalse(leitor.validaEntrada(entrada));
		
		
	}
	
	
	@Test
	public void deveRetornarResultadoIgualACinco(){
		

		String entrada =    "6" + "\n" +
							"0 1 0 0 1 0" + "\n"+
							"1 0 0 0 1 0" + "\n"+
							"0 1 0 0 1 0" + "\n"+
							"0 1 1 1 0 1" + "\n"+
							"1 0 0 1 1 0" + "\n"+
							"1 1 0 1 1 0";
		Assert.assertEquals(5,leitor.calculaMaiorQuantidadeVotos(entrada));
	}
	
	@Test
	public void deveRetornarResultadoIgualATres(){
		

		String entrada =    "6" + "\n" +
							"0 1 0 0 1 0" + "\n"+
							"1 0 0 0 0 0" + "\n"+
							"0 0 0 0 0 0" + "\n"+
							"0 0 1 1 0 1" + "\n"+
							"1 0 0 1 1 0" + "\n"+
							"1 1 0 1 1 0";
		Assert.assertEquals(3,leitor.calculaMaiorQuantidadeVotos(entrada));
	}
}
