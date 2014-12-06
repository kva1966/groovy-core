package groovy.typeresolvernpebug

import groovy.typeresolvernpebug.subpackage.Base

/* No @CompileStatic, no issue */

final class NoNpe2 extends Base {
  static void bar() {
    genericsArgWithProtectedKeyword(null /* argument irrelevant */)
  }
}
