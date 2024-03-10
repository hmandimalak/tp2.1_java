package tp2;

import java.util.ArrayList;
import java.util.List;

public class Etudiant implements IStatisticable,Comparable<Etudiant>{
	private String matricule;
	private String nom;
	List<Note>notes;
	public Etudiant(String matricule, String nom) {

		this.matricule = matricule;
		this.nom = nom;
		notes=new ArrayList<>();
	}
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void addnote(Note n)
	{
		notes.add(n);
		
	}
	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + "]";
	}
	public void affiche()
	{
		System.out.println(this.toString());
		for(int i=0;i<notes.size();i++)
		{
			System.out.println(notes.get(i));
		}
		
	}
	public  double getValue()
	{
		double s=0;
		for(int i=0;i<notes.size();i++)
		{
			 s=s+notes.get(i).getNote();
		}
		return s/notes.size();
	}
	public double getMax()
	{
		double max=notes.get(0).getNote();
		for(int i=1;i<notes.size();i++)
		{
			if (max>notes.get(i).getNote())
			{
				max=notes.get(i).getNote();
			}
		}
		return max;
	}
	public double getMin()
	{
		double min=notes.get(0).getNote();
		for(int i=1;i<notes.size();i++)
		{
			if (min<notes.get(i).getNote())
			{
				min=notes.get(i).getNote();
			}
		}
		return min;
	}

	@Override
	public int compareTo(Etudiant E)
	{
		if(this.getValue()>E.getValue())
		{
			return 1;
		}
		if(this.getValue()<E.getValue())
		{
			return -1;
		}
		return 0;
	}
	
	

}
