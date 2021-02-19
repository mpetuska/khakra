@file:JsModule("@chakra-ui/image/dist/esm/image")

package com.github.mpetuska.khakra.image

import com.github.mpetuska.khakra.system.ComponentWithAs
import com.github.mpetuska.khakra.system.HTMLChakraProps
import react.ReactElement

public external interface NativeImageOptions {
  /**
   * The native HTML `width` attribute to the passed to the `img`
   *
   * type: `string | number`
   */
  public var htmlWidth: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * The native HTML `height` attribute to the passed to the `img`
   *
   * type: `string | number`
   */
  public var htmlHeight: dynamic
    get() = definedExternally
    set(value) = definedExternally

  public var alt: String?
    get() = definedExternally
    set(value) = definedExternally
}

public external interface ImageProps : HTMLChakraProps, UseImageProps, NativeImageOptions {

  /**
   * Fallback image `src` to show if image is loading or image fails.
   *
   * Note 🚨: We recommend you use a local image
   */
  public var fallbackSrc: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Fallback element to show if image is loading or image fails.
   * @type React.ReactElement
   */
  public var fallback: ReactElement?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * Defines loading strategy
   *
   * type: `"eager" | "lazy"`
   */
  public var loading: String?
    get() = definedExternally
    set(value) = definedExternally

  /**
   * How the image to fit within its bounds.
   * It maps to css `object-fit` property.
   * @type SystemProps["objectFit"]
   */
  public var fit: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * How to align the image within its bounds.
   * It maps to css `object-position` property.
   * @type SystemProps["objectPosition"]
   */
  public var align: dynamic
    get() = definedExternally
    set(value) = definedExternally

  /**
   * If `true`, opt out of the `fallbackSrc` logic and use as `img`
   */
  public override var ignoreFallback: Boolean?
    get() = definedExternally
    set(value) = definedExternally
}

public external val Image: ComponentWithAs<ImageProps>

public external interface ImgProps : HTMLChakraProps, NativeImageOptions

/**
 * Fallback component for most SSR users who want to use the native `img` with
 * support for chakra props
 */
public external val Img: ComponentWithAs<ImgProps>
