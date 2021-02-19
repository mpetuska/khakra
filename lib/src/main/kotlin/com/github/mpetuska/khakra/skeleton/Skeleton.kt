@file:JsModule("@chakra-ui/skeleton/dist/esm/skeleton")

package com.github.mpetuska.khakra.skeleton

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import com.github.mpetuska.khakra.system.ThemingProps
import react.RClass

public external interface SkeletonOptions {
  /**
   * The color at the animation start
   */
  public var startColor: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The color at the animation end
   */
  public var endColor: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, it'll render its children with a nice fade transition
   */
  public var isLoaded: Boolean?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The animation speed in seconds
   * @default
   * 0.8
   */
  public var speed: Number?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The fadeIn duration in seconds
   *
   * @default
   * 0.4
   */
  public var fadeDuration: Number?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface SkeletonProps : HTMLChakraProps, SkeletonOptions, ThemingProps

public external val Skeleton: ComponentWithAs<SkeletonProps>

public external interface SkeletonTextProps : SkeletonProps {
  public var spacing: dynamic
    get() = definedExternally
    set(value) = definedExternally
  public var skeletonHeight: dynamic
    get() = definedExternally
    set(value) = definedExternally
}

public external val SkeletonText: RClass<SkeletonTextProps>

public external val SkeletonCircle: RClass<SkeletonProps>
