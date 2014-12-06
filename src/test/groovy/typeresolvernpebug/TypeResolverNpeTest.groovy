package groovy.typeresolvernpebug

class TypeResolverNpeTest extends GroovyTestCase {

  void testNoNpeOnCallingProtectedStaticGenericArgMethodInDifferentPackage() {
    new CausesNpe()
  }

  void testNoNpeMiscel() {
    new NoNpe1()
    new NoNpe2()
    new NoNpe3()
  }
}
