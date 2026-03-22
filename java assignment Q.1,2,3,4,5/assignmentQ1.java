class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Amit", 20);
        Person p2 = new Person("Neha", 22);

        p1.display();
        p2.display();
    }
}