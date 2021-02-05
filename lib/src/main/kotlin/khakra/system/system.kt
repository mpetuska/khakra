@file:JsModule("@chakra-ui/system/dist/esm/system")
package khakra.system

import khakra.styledSystem.*
import kotlinext.js.*
import react.*

public external interface HTMLChakraProps: StyleProps, ChakraProps {
  public var `as`: As?
    get() = definedExternally
    set(value) = definedExternally
}
