package zadanie_1;

class Dog
{
    private String name;
    private int age;

    public Dog(){
        name = "Vasya";
        age = 6;
    }
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n) {
        name = n;
        age = 0;
    }
    public String show_name(){
        return this.name;
    }
    public void set_name(String name){
        this.name = name;
    }
    public void set_age(int age){
        this.age = age;
    }
    public String toString(){
        return "Это САБАКА "+this.age+" лет, Зовут: "+this.name;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }

}
