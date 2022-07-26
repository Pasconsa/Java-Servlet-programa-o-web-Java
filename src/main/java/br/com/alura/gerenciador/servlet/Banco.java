package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {  //simulando um banco de dados
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static { //lista estatica que ja vai esta no navegador e não sera apagada pornão salvar.
		  Empresa empresa = new Empresa();
		  empresa.setNome("Alura");
		  Empresa empresa2 = new Empresa();
		  empresa2.setNome("Caelum");
		  Banco.lista.add(empresa);
		  Banco.lista.add(empresa2);
		}

	
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);	
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
