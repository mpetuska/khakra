@file:JsModule("@chakra-ui/hooks/dist/esm/use-merge-refs")

package io.github.mpetuska.khakra.hooks

import React.MutableRefObject
import React.RefObject

public external fun <T> assignRef(ref: Any, value: T)

public external fun <T> assignRef(ref: RefObject<T>?, value: T)

public external fun <T> assignRef(ref: MutableRefObject<T>?, value: T)

/**
 * React hook that merges react refs into a single memoized function
 *
 * @example
 * import React from "react";
 * import { useMergeRefs } from `@chakra-ui/hooks`;
 *
 * const Component = React.forwardRef((props, ref) => {
 *   const internalRef = React.useRef();
 *   return <div {...props} ref={useMergeRefs(internalRef, ref)} />;
 * });
 */
public external fun <T> useMergeRefs(vararg refs: Any? /* Any | RefObject<T>? | React.MutableRefObject<T>? */): ((node: T) -> Unit)?
