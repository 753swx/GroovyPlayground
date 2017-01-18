package Person

//Person person = new Person();
//person.@name = "Artur"
//
//println "person = " + person.name

//def person = new Person()
//person.age = 25
//
//if (person){
//    println 'жив!'
//}

List list = [new Person("Vasya", 22), new Person("Kolya", 24), new Person("Masha", 20), new Person("Hanna", 21), new Person("Sveta", 22)]

Person person = new Person("Sveta", 22)

def printNumberOfEntries(List list, Person person, Closure func){
    println func(list, person)
}

printNumberOfEntries(list, person) {List l, Person p ->
    def subList = l.findAll {it.age == p.age & it.name == p.name }
    subList.size()
}

//list.each {it.age += 10}
//println(list)


