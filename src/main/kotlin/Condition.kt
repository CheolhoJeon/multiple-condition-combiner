class Condition<T>(val check: (T) -> Boolean) {
    fun combine(other: Condition<T>) = Condition<T> { check(it) && other.check(it) }
}
