package be.intecbrussel.nature.app;

import be.intecbrussel.nature.ForestNoteBook;
import be.intecbrussel.nature.animals.Animal;
import be.intecbrussel.nature.animals.Carnivore;
import be.intecbrussel.nature.animals.Herbivore;
import be.intecbrussel.nature.animals.Omnivore;
import be.intecbrussel.nature.plants.*;

import java.util.Comparator;
public class App {

    public static void main(String[] args) {
        ForestNoteBook notebook = new ForestNoteBook();

        //5 different plants
        Bush bush = new Bush("Lilac", 75);
        bush.setColour(Colour.GREEN);
        bush.setFruit("Mini lilacs");
        bush.setLeafType(LeafType.HEART);

        Flower flower = new Flower("Rose", 60);
        flower.setColour(Colour.RED);
        flower.setSmell(Scent.SWEET);

        Tree tree = new Tree("Lemon", 400);
        tree.setColour(Colour.YELLOW);
        tree.setLeafType(LeafType.ROUND);

        Weed weed = new Weed("Dandelion", 30);
        weed.setColour(Colour.YELLOW);
        Flower flower1 = new Flower("Jasmine", 45);
        flower1.setColour(Colour.BLUE);
        flower1.setSmell(Scent.ORANGE);

        notebook.addPlant(bush);
        notebook.addPlant(flower);
        notebook.addPlant(tree);
        notebook.addPlant(weed);
        notebook.addPlant(flower1);

        //9 animals 3 omivores, 3 carnivores, 3 herivores
        Omnivore omnivore1 = new Omnivore("Bear", 200, 250, 100);
        omnivore1.setDecibel(10);
        Omnivore omnivore2 = new Omnivore("Eagle", 80, 50, 50);
        omnivore2.setDecibel(100);
        Omnivore omnivore3 = new Omnivore("Snake", 80, 300, 30);
        omnivore3.setDecibel(70);

        Carnivore carnivore1 = new Carnivore("Lion", 200, 150, 80);
        carnivore1.setDecibel(80);
        Carnivore carnivore2 = new Carnivore("Tiger", 250, 180, 90);
        carnivore2.setDecibel(40);
        Carnivore carnivore3 = new Carnivore("Alligator", 300, 150, 50);
        carnivore3.setDecibel(60);

        Herbivore herbivore1 = new Herbivore("Cow", 200, 150, 80);
        herbivore1.setDecibel(5);
        Herbivore herbivore2 = new Herbivore("Duck", 20, 50, 20);
        herbivore2.setDecibel(105);
        Herbivore herbivore3 = new Herbivore("Goat", 100, 90, 50);
        herbivore3.setDecibel(55);

        notebook.addAnimal(omnivore1);
        notebook.addAnimal(omnivore2);
        notebook.addAnimal(omnivore3);

        notebook.addAnimal(carnivore1);
        notebook.addAnimal(carnivore2);
        notebook.addAnimal(carnivore3);

        notebook.addAnimal(herbivore1);
        notebook.addAnimal(herbivore2);
        notebook.addAnimal(herbivore3);

        notebook.printNoteBook();

        System.out.println("Number of plants: " + notebook.getPlantCount());
        System.out.println("Number of animals: " + notebook.getAnimalCount());

        //Omnivores
        System.out.println("Omnivores:\n"+notebook.getOmnivores());
        System.out.println("Carnivores:\n"+notebook.getCarnivores());
        System.out.println("Herbivores:\n"+notebook.getHerbivores());
        //sort
        notebook.sortAnimalsyName();
        notebook.sortPlantByName();
        System.out.println("\nPrint Notebook in sorted animals and plants by name:");
        //print
        notebook.printNoteBook();

        //sort by color
        System.out.println("Sorting plants by Colour:");
        notebook.sortPlantByColour();

        notebook.printNoteBook();

        notebook.getAnimals().
                stream().
                sorted(Comparator.comparing(Animal::getDecibel).reversed()).
                filter(a->a.getDecibel()>50).
                forEach(System.out::println);






    }
}

