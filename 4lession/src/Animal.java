public class Animal {
    protected String name;
    public Animal(){
    }

    public Animal (String name){
        this.name = name;
    }

    public void animalInfo(){
        System.out.println("Animal: " + name);
    }
}
