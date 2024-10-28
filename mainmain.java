package pack;

public class mainmain {

	public static void main(String[] args) {
		Animal chat = new Animal("A","siamois","carnivore");
		Animal girafe = new Animal("B","Masaï","herbivore");
		Animal cochondinde = new Animal("C","abyssinien","carnivore");
		Animal cheval = new Animal("D","Shagya","herbivore");
		Animal[] Tab = new Animal[] {chat,girafe,cochondinde,cheval};
		Animal.AnimalStatistique(Tab);
		Animal.organiserTableau(Tab);
	}
}
