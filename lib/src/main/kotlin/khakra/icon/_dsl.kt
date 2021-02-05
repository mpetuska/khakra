package khakra.icon

import khakra.*
import react.*

@KhakraDSL
public inline fun RBuilder.Icon(
  noinline props: Builder<IconProps> = {},
  crossinline block: Builder<RElementBuilder<IconProps>> = {},
): ReactElement = KhakraComponent(Icon, props, block)
