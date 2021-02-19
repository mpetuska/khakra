@file:JsModule("@chakra-ui/styled-system/dist/esm/types")

package com.github.mpetuska.khakra.styledSystem

import com.github.mpetuska.khakra.styledSystem.config.BackgroundProps
import com.github.mpetuska.khakra.styledSystem.config.BorderProps
import com.github.mpetuska.khakra.styledSystem.config.ColorProps
import com.github.mpetuska.khakra.styledSystem.config.FlexboxProps
import com.github.mpetuska.khakra.styledSystem.config.GridProps
import com.github.mpetuska.khakra.styledSystem.config.LayoutProps
import com.github.mpetuska.khakra.styledSystem.config.ListProps
import com.github.mpetuska.khakra.styledSystem.config.OtherProps
import com.github.mpetuska.khakra.styledSystem.config.OutlineProps
import com.github.mpetuska.khakra.styledSystem.config.PositionProps
import com.github.mpetuska.khakra.styledSystem.config.ShadowProps
import com.github.mpetuska.khakra.styledSystem.config.SpaceProps
import com.github.mpetuska.khakra.styledSystem.config.TransformProps
import com.github.mpetuska.khakra.styledSystem.config.TransitionProps
import com.github.mpetuska.khakra.styledSystem.config.TypographyProps
import react.RProps

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
  OtherProps

public external interface SystemProps : StyleProps, RProps
