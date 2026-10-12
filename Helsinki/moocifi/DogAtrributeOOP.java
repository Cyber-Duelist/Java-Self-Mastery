package Helsinki.moocifi;

public class DogAtrributeOOP {
    public class Dog {
        private  String name;
        private  String breed;
        private int age;

        // Constructor
        public Dog(String name, String breed, int age){
            this.name = name;
            this.breed = breed;
            this.age = age;

        }

        //.Getters
        public String getName() {
            return name;
        }
        public String getBreed(){
            return breed;
        }
        public int getAge() {
            return age;
        }

        //Setters
        public void setName(String name) {
            this.name = name;

        }
        public void setBreed(String breed) {
            this.breed = breed;

        }
        public void setAge(int age) {
            this.age = age;
        }

        //toString  method for easy printing
        
public String toString() {
    return "Dog{name=" + name + ", breed=" + breed + ", age=" + age + "}";
}


    }
}
