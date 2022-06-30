package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioCursoOnline.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioCursoOnline.model.entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer idStudent;
		
		System.out.printf("How many students for course A? ");
		int qtdStudent = sc.nextInt();
		
		Set<Student> courseA = new HashSet<Student>();
		
		for(int i=0; i<qtdStudent; i++) {
			idStudent = sc.nextInt();
			courseA.add(new Student(idStudent));
		}
		
		System.out.printf("How many students for course B? ");
		qtdStudent = sc.nextInt();
		
		Set<Student> courseB = new HashSet<Student>();
		
		for(int i=0; i<qtdStudent; i++) {
			idStudent = sc.nextInt();
			courseB.add(new Student(idStudent));
		}
		
		System.out.printf("How many students for course C? ");
		qtdStudent = sc.nextInt();
		
		Set<Student> courseC = new HashSet<Student>();
		
		for(int i=0; i<qtdStudent; i++) {
			idStudent = sc.nextInt();
			courseC.add(new Student(idStudent));
		}
		
		System.out.printf("%nTotal students: ");
		
		Set<Student> courseABC = courseA;
		courseABC.addAll(courseB);
		courseABC.addAll(courseC);
		
		System.out.println(courseABC.size());
		
		sc.close();
	}
}
/*
* Em um portal de cursos online:
	- Cada usuário possui:
		- Um código único
			- Representado por um número inteiro.
	
	- Cada aluno pode se matricular em quantos cursos quiser.
			
	- Cada instrutor do portal pode ter:
		- Vários cursos
		- O número total de alunos de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui
			- pode haver alunos repetidos em mais de um curso.
			
* Exemplo: O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.

* Seu programa deve ler:
	- Os alunos dos cursos A, B e C do instrutor Alex
	- Depois mostrar a quantidade total de alunos dele
*/