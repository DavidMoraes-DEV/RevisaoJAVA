package RevisaoProgOrientadaObjetos.Encapsulamento.application;

import RevisaoProgOrientadaObjetos.Encapsulamento.entities.Person;

public class Program {

	public static void main(String[] args) {

		Person person = new Person("Maria");
		System.out.println(person.getName());
		
	}

}
