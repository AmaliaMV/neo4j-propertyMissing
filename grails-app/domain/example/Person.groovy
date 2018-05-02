package example

class Person extends BaseGraphDomain {

    String name

    def propertyMissing(String name) {
        super.propertyMissing(name)
    }
}
