/**
 * Created by pc on 16.04.2015.
 */
class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public String bark() {
        return "Dog" + this.name + "is saying bark";
    }
}