// IGNORE_BACKEND: JVM_IR
fun box(): String {
    val result = "OK"

    class Local {
        fun foo() = result
    }

    val member = Local::foo
    val instance = Local()
    return member(instance)
}
