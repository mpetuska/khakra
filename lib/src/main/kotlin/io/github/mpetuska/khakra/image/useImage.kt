@file:JsModule("@chakra-ui/image/dist/esm/use-image")

package io.github.mpetuska.khakra.image

public external interface UseImageProps {
  /**
   * The image `src` attribute
   */
  public var src: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The image `srcset` attribute
   */
  public var srcSet: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The image `sizes` attribute
   */
  public var sizes: String?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * A callback for when the image `src` has been loaded
   */
  public var onLoad: ((event: dynamic) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * A callback for when there was an error loading the image `src`
   */
  public var onError: ((event: dynamic) -> Unit)?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * If `true`, opt out of the `fallbackSrc` logic and use as `img`
   */
  public var ignoreFallback: Boolean?
    get() = definedExternally
    set(value) = definedExternally
  
  /**
   * The key used to set the crossOrigin on the HTMLImageElement into which the image will be loaded.
   * This tells the browser to request cross-origin access when trying to download the image data.
   */
  public var crossOrigin: String? // "" | "anonymous" | "use-credentials" | undefined
    get() = definedExternally
    set(value) = definedExternally
}


/**
 * React hook that loads an image in the browser,
 * and let's us know the `status` so we can show image
 * fallback if it is still `pending`
 *
 * @returns the status of the image loading progress
 *
 * @example
 *
 * ```jsx
 * function App(){
 *   const status = useImage({ src: "image.png" })
 *   return status === "loaded" ? <img src="image.png" /> : <Placeholder />
 * }
 * ```
 */
public external fun useImage(props: UseImageProps): String // "loading" | "failed" | "pending" | "loaded"
