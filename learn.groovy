println "Hello World!"

def x = 1
println x

x = new java.util.Date()
println x

x = -3.1499392
println x

x = false
println x

x = "Groovy!"
println x

def technologies = []

technologies.add('Grails!')

technologies << 'Groovy'

technologies.addAll(['Griffon','Gradle'])

technologies.remove('Griffon')

technologies = technologies - 'Grails!'

technologies.each {println "Technology: $it"}

technologies.eachWithIndex {it, i -> println "$i: $it"}

contained = technologies.contains('Groovy')

contained = 'Gradle' in technologies

technologies.containsAll(['Gradle','Groovy'])

//technologies.sort()
sortedTechnologies = technologies.sort(false)

Collections.replaceAll(technologies,'Gradle','gradle')

technologies << 'test'

Collections.shuffle(technologies, new Random())

println technologies