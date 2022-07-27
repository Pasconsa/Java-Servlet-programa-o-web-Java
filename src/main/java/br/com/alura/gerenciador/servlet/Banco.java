package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {  //simulando um banco de dados
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static { //lista estatica que ja vai esta no navegador e não sera apagada pornão salvar.
		Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("Caelum");
        lista.add(empresa);
        lista.add(empresa2);
    }

        public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        Banco.lista.add(empresa);
        }
	
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		 Iterator<Empresa> it = lista.iterator();

		    while(it.hasNext()) { 
		        Empresa emp = it.next();

		        if(emp.getId() == id ) {
		            it.remove();
	        }
	    }
	}


	public Empresa buscaEmpresaPelaId(Integer id) { 
	    for (Empresa empresa: lista) { 
	        if(empresa.getId() == id)  {
	            return empresa;
	        }

	    }
	    return null;
	}
}




