package br.com.mauricio.java.io.teste.props;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestePropertiesLeitura {

	public static void main(String[] args) throws IOException {
		
		Properties props = new Properties();
		props.load(new FileReader("conf.properties"));
		
		String lg = props.getProperty("login");
		String senha = props.getProperty("senha");
		String end = props.getProperty("endereco");
		
		System.out.println(lg + ", " +senha+ ", " +end);
		
	}

}
