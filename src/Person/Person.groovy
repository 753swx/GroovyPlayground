package Person

import groovy.transform.ToString

@ToString
class Person {
    String name
    int age

//    void setName(String name) {
//        this.name = name.toUpperCase()
//    }

    boolean asBoolean() {
        age < 120
    }


}
