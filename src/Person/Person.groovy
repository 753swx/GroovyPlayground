package Person

import groovy.transform.ToString

@ToString
class Person {
    String name
    int age

    Person(String name, int age) {
        this.name = name
        this.age = age
    }

    Person() {
    }
//    void setName(String name) {
//        this.name = name.toUpperCase()
//    }

    boolean asBoolean() {
        age < 120
    }


}
