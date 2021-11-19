package AlunoCurso;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String args[])
	{
		Set<NotaAluno> conjunto = new HashSet<NotaAluno>();
		NotaAluno a= new NotaAluno("João Barone", "JAVA",7.3);
		NotaAluno b= new NotaAluno("Maria Eduarda", "HTML",5.9);
		NotaAluno c= new NotaAluno("Rafael Oliveira", "Python",8.8);
		NotaAluno d= new NotaAluno("Paula Maria", "Kotlin",7.6);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}

}
