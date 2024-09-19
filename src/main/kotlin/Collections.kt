package org.example

// основывается на массиве, который увеличивает свой размер в 1,5 раза
fun arrayList() {
    // общие
    var a = arrayListOf<Int>() // java.ArrayList
    a.get(0) // O(1), возвращает найденный элемент
    a.set(0, 10) // O(1), возвращает добавленный элемент
    a.add(10) // амортизированное O(1), возвращает всегда true
    a.add(5, 10) // O(?), вставка элемента на позицию, со сдвигом правых элементов, void
    a.addAll(arrayListOf()) // O(m), возвращает true, если список не был пуст
    a.remove(5) // O(?), ищет и удаляет элемент, со сдвигом правых элементов, возвращает true, если элемент был удален
    a.removeIf { it > 5 } // O(?), удаляет каждый элемент списка, если он удовлетворяет предикату, возвращает true
    a.removeAt(5) // O(?), удаляет элемент на позиции, возвращает элемент
    a.removeAll(arrayListOf()) // O(?), возвращает true, если список не был пуст
    a.retainAll(arrayListOf()) // O(?), оставляет только элементы, которые есть в другой коллекции, возвращает true, если список не был пуст
    a.replaceAll { -it } // O(?), заменяет каждый элемент списка, применив унарную операцию, void

    a.contains(5) // O(n), ищет элемент, возвращает true/false
    a.containsAll(arrayListOf()) // O(n^2), ищет каждый из элементов в списке, возвращает true/false
    a.indexOf(5) // O(n), ищет первую позицию элемента
    a.lastIndexOf(5) // O(n), ищет последнюю позицию элемента
    a.toArray() // O(?)
    a.clear() // O(n), чистка списка

    a.iterator() // hasNext(), next()
    a.listIterator() // поддерживает previous, добавляет к iterator - nextIndex(), add(), set(), remove()
    a.listIterator(5) // с заданным начальным индексом
    a.spliterator() // ???

    // уникальные
    a.ensureCapacity(10) // увеличить размер массива
    a.trimToSize() // сократить размер массива до количества элементов
    a.subList(0, 5) // возвращает копию для части списка, которая отражает все изменения в основном (без структурных)

    // kotlin
    a.sort()
    a.forEach { println(it) }
    a.indices
    a.lastIndex
    a.first() // аналогично с last
    a.first { it > 5 }
    a.removeFirst()
    a.toSortedSet()
}