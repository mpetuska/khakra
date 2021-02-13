@file:JsModule("@chakra-ui/number-input/dist/esm/utils")

package io.github.mpetuska.khakra.numberInput

import org.w3c.dom.Element

/**
 * Determine if a character is a DOM floating point character
 * @see https://www.w3.org/TR/2012/WD-html-markup-20120329/datatypes.html#common.data.float
 */
public external fun isFloatingPointNumericCharacter(character: Char): Boolean

/**
 * Determine if the event is a valid numeric keyboard event.
 * We use this so we can prevent non-number characters in the input
 */
public external fun isValidNumericKeyboardEvent(event: React.KeyboardEvent<Element>): Boolean
