
public class Human implements Comparable<Human> {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Сравниваем сначала по фамилии,
    // потом по имени и возрасту
    public int compareTo(Human other) {
        int result = lastName.compareTo(other.lastName);

        if (result == 0) {
            result = firstName.compareTo(other.firstName);
        }

        if (result == 0) {
            result = Integer.compare(age, other.age);
        }

        return result;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + age + " лет";
    }
}