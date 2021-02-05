@file:JsModule("@chakra-ui/styled-system/dist/esm/types")

package khakra.styledSystem

import khakra.styledSystem.config.*
import react.*


public external interface StyleProps :
  RProps,
  SpaceProps,
  ColorProps,
  TransitionProps,
  TypographyProps,
  FlexboxProps,
  TransformProps,
  GridProps,
  LayoutProps,
  BorderProps,
  ShadowProps,
  BackgroundProps,
  ListProps,
  PositionProps,
  OutlineProps,
  OtherProps {}

public external interface SystemProps : StyleProps, RProps
