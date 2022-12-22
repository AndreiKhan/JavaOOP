package HomeWork_02.Task_Animal;


public class Person {
    
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String pet(Cat cat) {

        if (cat.getSelfishness() - cat.getHunger() < 20) {
            return cat.getName() + " мурлыкает";
        }
        return cat.getName() + " игнорирует ухаживания человека";
    }

    public String call(Cat cat) {
        
        if (cat.getSelfishness() - cat.getHunger() < 50) {
            return cat.getName() + " прибегает на зов";
        }
        return cat.getName() + " игнорирует так как ему ничего не нужно";
    }

    @Override
    public String toString() {
        return name + " не влияет на кота, потому что коты, делают то что они хотят";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
