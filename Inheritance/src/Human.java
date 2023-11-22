public class Human {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.length() < 2){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public  void setAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("There are no negative years");
        }
        this.age = age;
    }
}
