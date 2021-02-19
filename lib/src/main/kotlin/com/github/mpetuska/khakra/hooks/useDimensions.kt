@file:JsModule("@chakra-ui/hooks/dist/esm/use-dimensions")

package com.github.mpetuska.khakra.hooks

import css_box_model.BoxModel
import org.w3c.dom.HTMLElement
import react.RReadableRef

/**
 * Reack hook to measure a component's dimensions
 *
 * @param ref ref of the component to measure
 * @param observe if `true`, resize and scroll observers will be turned on
 */
public external fun useDimensions(
  ref: RReadableRef<HTMLElement>,
  observe: Boolean = definedExternally,
): BoxModel?
