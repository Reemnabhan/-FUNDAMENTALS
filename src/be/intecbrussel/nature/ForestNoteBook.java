package be.intecbrussel.nature;

import be.intecbrussel.nature.animals.Animal;
import be.intecbrussel.nature.animals.Carnivore;
import be.intecbrussel.nature.animals.Herbivore;
import be.intecbrussel.nature.animals.Omnivore;
import be.intecbrussel.nature.plants.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNoteBook {

        private List<Animal> animals;
        private List<Plant> plants;
        private List<Carnivore> carnivores;
        private List<Omnivore> omnivores;
        private List<Herbivore> herbivores;

        private int plantCount;
        private int animalCount;



    public ForestNoteBook() {
                animals = new ArrayList<>();
                plants = new ArrayList<>();
                carnivores = new ArrayList<>();
                omnivores = new ArrayList<>();
                herbivores = new ArrayList<>();
                plantCount = 0;
                animalCount = 0;

            }

            public List<Carnivore> getCarnivores() {
                return carnivores;
            }

            public List<Omnivore> getOmnivores() {
                return omnivores;
            }

            public List<Herbivore> getHerbivores() {
                return herbivores;
            }

            public int getPlantCount() {
                return plantCount;
            }

            public int getAnimalCount() {
                return animalCount;
            }

            public void addAnimal(Animal a) {
                if (!animals.contains(a)) {
                    animals.add(a);
                    //add to either carnovore, omnivore or herbivore

                    if(a instanceof Carnivore) {
                        Carnivore temp= (Carnivore) a;
                        carnivores.add(temp);
                    }
                    else if(a instanceof Omnivore) {
                        omnivores.add((Omnivore)a);
                    }
                    else if(a instanceof Herbivore) {
                        herbivores.add((Herbivore)a);
                    }
                    animalCount++;

                }

            }

            public void addPlant(Plant plant) {
                if(!plants.contains(plant)) {
                    plants.add(plant);
                    plantCount++;
                }
            }

            public void sortAnimalsyName() {

                animals.sort(Comparator.comparing(Animal::getName));

            }

            public void sortPlantByName() {
                plants.sort(Comparator.comparing(Plant::getName));
            }


            public List<Animal> getAnimals() {
                return animals;
            }
            public void sortPlantByColour(){

                plants.sort(Comparator.nullsLast(Comparator.comparing(Plant::getColour)));
            }

            public void sortAnimalByHeight() {
                animals.sort(Comparator.comparing(Animal::getHeight));
            }

            public void sortPlantByHeight() {
                plants.sort(Comparator.comparing(Plant::getHeight));
            }
            public void printNoteBook() {
                System.out.println("Animals List:\n"+animals);
                System.out.println("\n\nPlants List:\n"+plants);
            }


    }


