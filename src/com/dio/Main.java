package com.dio;
import com.dio.model.Gato;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato(null, null, null);
		gato.setCor("azul");
		System.out.println(gato.getCor());
	}

}
