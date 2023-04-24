public abstract class Animal {

    private String name;
    private int age;
    private AnimalType type;
    private String habitat;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public AnimalType getType() {
        return type;
    }
    public String getHabitat() {
        return habitat;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setType(AnimalType type) {
        this.type = type;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
