package org.example

import java.util.function.Consumer

// основывается на массиве, который увеличивает свой размер в 1,5 раза
fun arrayList() {
    // общие
    var a = arrayListOf<Int>() // java.ArrayList
    a.get(0) // O(1), возвращает найденный элемент
    a.set(0, 10) // O(1), возвращает добавленный элемент
    a.add(10) // амортизированное O(1), возвращает всегда true
    a.add(5, 10) // O(?), вставка элемента на позицию, со сдвигом правых элементов, void
    a.addAll(arrayListOf()) // O(m), возвращает true, если список не был пуст
    a.remove(5) // O(?), удаляет элемент, со сдвигом правых элементов, возвращает true, если элемент был удален
    a.removeAll(arrayListOf()) // O(?), возвращает true, если список не был пуст
    a.retainAll(arrayListOf()) // O(?), оставляет только элементы, которые есть в другой коллекции, возвращает true, если список не был пуст
    a.removeIf { it > 5 } // O(?), удаляет каждый элемент списка, если он удовлетворяет предикату, возвращает true
    a.replaceAll { -it } // O(?), заменяет каждый элемент списка, применив унарную операцию, void

    a.contains(5) // O(n), ищет элемент, возвращает true/false
    a.indexOf(5) // O(n), ищет первую позицию элемента
    a.lastIndexOf(5) // O(n), ищет последнюю позицию элемента
    a.clear() // O(n), чистка списка
    a.sort() // kotlin
    a.forEach { println(it) } // kotlin

    a.iterator()
    a.listIterator()
    a.spliterator() // лень читать

    // уникальные
    a.ensureCapacity(10) // увеличить размер массива
    a.trimToSize() // сократить размер массива до количества элементов
    a.subList(0, 5) // возвращает копию для части списка, которая отражает все изменения в основном (без структурных)

    // изменение
    a.toArray()
}