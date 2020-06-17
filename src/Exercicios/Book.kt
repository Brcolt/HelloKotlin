package Exercicios

open class Book(var title: String, var author: String) {

    private var currentPage: Int = 1

    open fun readPage() {
        currentPage++
    }

}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {

    var currentWord: Int = 1

    override fun readPage() {
        currentWord = currentWord +250
    }

}
