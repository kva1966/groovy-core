package groovy.typeresolvernpebug

import groovy.transform.CompileStatic
import groovy.typeresolvernpebug.subpackage.Base

@CompileStatic
final class NoNpe1 extends Base {
  static void bar() {
    // either no args, or no generics.
    genericsArgsNoProtectedKeyword(null)
    genericsNoArgWithProtectedKeyword()
    nonGenericsArgWithProtectedKeyword(null)
    nonGenericsArgNoProtectedKeyword(null)
  }
}
