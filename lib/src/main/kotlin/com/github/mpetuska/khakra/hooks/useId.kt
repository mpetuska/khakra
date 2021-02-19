@file:JsModule("@chakra-ui/hooks/dist/esm/use-id")

package com.github.mpetuska.khakra.hooks

/**
 * Reack hook to generate unique id
 *
 * @param idProp the external id passed from the user
 * @param prefix prefix to append before the id
 */
public external fun useId(idProp: String = definedExternally, prefix: String = definedExternally): String

/**
 * Reack hook to generate ids for use in compound components
 *
 * @param idProp the external id passed from the user
 * @param prefixes array of prefixes to use
 *
 * @example
 *
 * ```js
 * const [buttonId, menuId] = useIds("52", "button", "menu")
 *
 * // buttonId will be `button-52`
 * // menuId will be `menu-52`
 * ```
 */
public external fun useIds(idProp: String = definedExternally, vararg prefixes: String): Array<String>
