@file:JsModule("@chakra-ui/hooks/dist/esm/use-event-listener")

package com.github.mpetuska.khakra.hooks

import org.w3c.dom.AddEventListenerOptions
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement

/**
 * React hook to manage browser event listeners
 *
 * @param event the event name
 * @param handler the event handler function to execute
 * @param doc the dom environment to execute against (defaults to `document`)
 * @param options the event listener options
 */
public external fun useEventListener(event: String, handler: (event: Any) -> Unit, env: Document? = definedExternally, options: Boolean = definedExternally): () -> Unit

/**
 * React hook to manage browser event listeners
 *
 * @param event the event name
 * @param handler the event handler function to execute
 * @param doc the dom environment to execute against (defaults to `document`)
 * @param options the event listener options
 */
public external fun useEventListener(event: String, handler: (event: Any) -> Unit): () -> Unit

/**
 * React hook to manage browser event listeners
 *
 * @param event the event name
 * @param handler the event handler function to execute
 * @param doc the dom environment to execute against (defaults to `document`)
 * @param options the event listener options
 */
public external fun useEventListener(event: String, handler: (event: Any) -> Unit, env: Document? = definedExternally): () -> Unit

/**
 * React hook to manage browser event listeners
 *
 * @param event the event name
 * @param handler the event handler function to execute
 * @param doc the dom environment to execute against (defaults to `document`)
 * @param options the event listener options
 */
public external fun useEventListener(event: String, handler: (event: Any) -> Unit, env: Document? = definedExternally, options: AddEventListenerOptions = definedExternally): () -> Unit

/**
 * React hook to manage browser event listeners
 *
 * @param event the event name
 * @param handler the event handler function to execute
 * @param doc the dom environment to execute against (defaults to `document`)
 * @param options the event listener options
 */
public external fun useEventListener(event: String, handler: (event: Any) -> Unit, env: HTMLElement? = definedExternally, options: Boolean = definedExternally): () -> Unit

/**
 * React hook to manage browser event listeners
 *
 * @param event the event name
 * @param handler the event handler function to execute
 * @param doc the dom environment to execute against (defaults to `document`)
 * @param options the event listener options
 */
public external fun useEventListener(event: String, handler: (event: Any) -> Unit, env: HTMLElement? = definedExternally): () -> Unit

/**
 * React hook to manage browser event listeners
 *
 * @param event the event name
 * @param handler the event handler function to execute
 * @param doc the dom environment to execute against (defaults to `document`)
 * @param options the event listener options
 */
public external fun useEventListener(event: String, handler: (event: Any) -> Unit, env: HTMLElement? = definedExternally, options: AddEventListenerOptions = definedExternally): () -> Unit
