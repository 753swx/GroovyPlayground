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

def list = [new Person("Vasya", 22), new Person("Kolya", 24)]
list.each {it.age += 10}
println(list)


