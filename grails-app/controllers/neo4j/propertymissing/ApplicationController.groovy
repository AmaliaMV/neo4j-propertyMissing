package neo4j.propertymissing

import example.Person

class ApplicationController {

    def index() {
        render template:'/example/person', model: [person: Person.list().first()]
    }
}
