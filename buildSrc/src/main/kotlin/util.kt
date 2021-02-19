import groovy.lang.*
import org.gradle.api.Project
import org.gradle.api.provider.*
import java.io.*
import java.nio.charset.*

typealias Lambda<R, V> = R.() -> V

fun <R, V> Lambda<R, V>.toClosure(owner: Any? = null, thisObj: Any? = null) = object : Closure<V>(owner, thisObj) {
  @Suppress("UNCHECKED_CAST")
  fun doCall() {
    with(delegate as R) {
      this@toClosure()
    }
  }
}

fun <R, V> closureOf(owner: Any? = null, thisObj: Any? = null, func: R.() -> V) = func.toClosure(owner, thisObj)

infix fun <T> Property<T>.by(value: T) {
  set(value)
}

fun Project.checkAnyTrue(vararg props: String) = props.any {
  "true".equals(project.properties[it] as String?, true)
}

fun Project.checkNoneStarting(vararg props: String) = props.none {
  project.properties.keys.any { p -> p.startsWith(it) }
}

object Git {
  val headCommitHash by lazy {
    val child = Runtime.getRuntime().exec("git rev-parse --verify HEAD")
    child.waitFor()
    child.inputStream.readAllBytes().toString(Charset.defaultCharset()).trim()
  }
}
