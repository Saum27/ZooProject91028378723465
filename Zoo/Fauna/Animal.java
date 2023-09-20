package Fauna;

public abstract class Animal {
    protected String name;
    protected int limbs;
    
    protected enum covering {
        FUR, FEATHERS, CHITIN, SCALES, SKIN, SHELL
    }

    protected enum Diet {
        CARNIVORE, HERBIVORE, OMNIVORE, FILTER_FEEDER
    }
}
