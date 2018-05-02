package example

import grails.testing.gorm.DataTest

import spock.lang.Specification

class PersonViewSpec extends Specification implements DataTest {

    void setup() {
        mockDomain(Person)
    }

    void "test missing property"() {
        given:
        Person person = new Person(name: 'Benjamín').save(flush:true)

        when:
        String lastName = (String) person.propertyMissing('lastName')

        then:
        lastName == null

    }
}