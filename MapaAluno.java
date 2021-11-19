package AlunoCurso;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String args[])
	{
		Map<String,NotaAluno> mapa = new TreeMap<String,NotaAluno>();
		
		NotaAluno a= new NotaAluno("João Barone", "JAVA",7.3);
		NotaAluno b= new NotaAluno("Maria Eduarda", "HTML",5.9);
		NotaAluno c= new NotaAluno("Rafael Oliveira", "Python",8.8);
		NotaAluno d= new NotaAluno("Paula Maria", "Kotlin",7.6);
		
		mapa.put("João Barone",a);
		mapa.put("Maria Eduarda",b);
		mapa.put("Rafael Oliveira",c);
		mapa.put("Paula Maria",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Maria Eduarda"));
		
		Collection<NotaAluno> alunos = mapa.values();
		for(NotaAluno e:alunos)
		{
			System.out.println(e);
		}
}
}