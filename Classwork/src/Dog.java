public class Dog {
    String name;
    String breed;
    int age;
    public Dog(String name, String breed, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog other){
        if(this.age > other.age){
            return 1;
        }else if(this.age < other.age){
            return -1;
        }
        else{
            if(this.name.compareTo(other.name) > 0){
                return 1;
            } else if (this.name.compareTo(other.name) < 0) {
                return -1;
            }else {
                return 0;
            }
        }
    }
}
