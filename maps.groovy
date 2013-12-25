def devMap = [:]

devMap = ['name':'Carlos','framework':'Grails','language':'Groovy']
devMap.put('lastName','Santana')

devMap.each { println "$it.key: $it.value" }
devMap.eachWithIndex { it, i -> println "$i: $it" }

assert devMap.containsKey('name')

assert devMap.containsValue('Santana')

println devMap.keySet()

println devMap.values()

println devMap.entrySet()