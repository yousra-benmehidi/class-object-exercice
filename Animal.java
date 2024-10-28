package pack;

public class Animal {
	String nom,race,type;
	public Animal(String nom,String race, String type)
	{
		this.nom = nom;
		this.race = race;
		this.type = type;
	}
	public static void AnimalStatistique(Animal tab[])
	{
		int nbH=0;
		int nbC=0;
		for(int i=0; i<tab.length;i++)
		{
			if(tab[i].type == "carnivore")
				nbC++;
			else
			{
				if(tab[i].type == "herbivore")
					nbH++;
			}
		}
		System.out.println("le nombre de carnivores est "+nbC);
		System.out.println("le nombre de herbivores est "+nbH);
	}
	public static void organiserTableau(Animal tab[])
	{   
		Animal[] tab1 = new Animal[tab.length];
		Animal[] tab2 = new Animal[tab.length];
		int j=0;
		for(int i=0;i<tab.length;i++)
		{
			if(tab[i].type=="carnivore")
			{
				tab1[j]=tab[i];
				j++;
			}
		}

		for(int i=0;i<j;i++)
		{
			System.out.println(tab1[i]);
		}
		j=0;
		for(int i=0;i<tab.length;i++)
		{
			if(tab[i].type=="herbivore")
			{
				tab2[j]=tab[i];
				j++;
			}
		}
		for(int i=0;i<j;i++)
		{
			System.out.println(tab2[i]);
		}
	}
	public String toString()
	{
		return "le nom est "+nom+", type: "+type+", race: "+race;
	}
}
