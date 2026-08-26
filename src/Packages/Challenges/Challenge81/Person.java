package Packages.Challenges.Challenge81;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person))
            return false;
        else {
            Person per = (Person) obj;
            return per.name.equals(name) &&
                    per.age == age;
        }
    }
}
