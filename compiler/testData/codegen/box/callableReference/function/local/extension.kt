// IGNORE_BACKEND: JVM_IR
class A

fun box(): String {
    fun A.foo() = "OK"
    return (A::foo)(A())
}
