fun <T> List<Condition<T>>.combineAll(): (T) -> Boolean =
    reduce(Condition<T>::combine).check
