package com.kemc.booktracker.data

//Primer libro
val author1 = Author(
    "Gabriel",
    "García Márquez",
    "6 de marzo de 1927",
    "Colombiana",
    "Escritor y periodista colombiano, ganador del premio Nobel de Literatura en 1982"
)
val publisher1 = Publisher("Círculo de Lectores", "Madrid, España", "https://www.circulo.es/", 1962)
val book1 = Book(
    "Cien años de soledad",
    listOf(author1),
    publisher1,
    "1967",
    448,
    "Novela",
    "La obra maestra de García Márquez",
    "978-84-226-0874-7"
)

//Segundo libro
val author2 = Author(
    "J.K.",
    "Rowling",
    "31 de julio de 1965",
    "Británica",
    "Escritora británica conocida por la saga de Harry Potter"
)
val publisher2 = Publisher("Salamandra", "Barcelona, España", "https://www.salamandra.info/", 2000)
val book2 = Book(
    "Harry Potter y la piedra filosofal",
    listOf(author2),
    publisher2,
    "1997",
    256,
    "Ficción",
    "El primer libro de la saga de Harry Potter",
    "978-84-7888-248-9"
)

//Tercer libro
val author3 = Author(
    "Ray",
    "Kurzweil",
    "12 de febrero de 1948",
    "Estadounidense",
    "Inventor y futurólogo estadounidense"
)
val publisher3 = Publisher(
    "Viking Press",
    "Nueva York, EE. UU.",
    "https://www.penguin.com/publishers/viking/",
    1925
)
val book3 = Book(
    "La Singularidad está cerca",
    listOf(author3),
    publisher3,
    "2005",
    672,
    "Tecnología futurista",
    "Una visión sobre la inteligencia artificial y la singularidad tecnológica",
    "978-0143037880"
)

//Cuarto libro
val publisher4 =
    Publisher("Basic Books", "Nueva York, EE. UU.", "https://www.basicbooks.com/", 1952)
val author4 = Author(
    "Sherry",
    "Turkle",
    "18 de junio de 1948",
    "Estadounidense",
    "Profesora de ciencias sociales y tecnológicas en el MIT"
)
val book4 = Book(
    "Vida en Pantalla",
    listOf(author4),
    publisher4,
    "1995",
    368,
    "Sociología de la tecnología",
    "Un análisis sobre la forma en que las computadoras están cambiando nuestra forma de pensar y de sentir",
    "978-0465093663"
)

//Quinto libro
val author5 = Author(
    "Jane",
    "Austen",
    "16 de diciembre de 1775",
    "Inglesa",
    "Escritora británica, autora de seis novelas románticas"
)
val publisher5 = Publisher(
    "Penguin Classics",
    "Londres, Reino Unido",
    "https://www.penguin.co.uk/company/publishers/penguin-classics.html",
    1946
)
val book5 = Book(
    "Orgullo y prejuicio",
    listOf(author5),
    publisher5,
    "1813",
    336,
    "Romance",
    "La historia de amor entre Elizabeth Bennet y Fitzwilliam Darcy en la Inglaterra rural del siglo XIX",
    "978-0141439518"
)

//Sexto libro
val author6 = Author(
    "Nicholas",
    "Sparks",
    "31 de diciembre de 1965",
    "Estadounidense",
    "Escritor y guionista estadounidense, autor de novelas románticas"
)
val publisher6 = Publisher(
    "Grand Central Publishing",
    "Nueva York, EE. UU.",
    "https://www.grandcentralpublishing.com/",
    2006
)
val book6 = Book(
    "El cuaderno de Noah",
    listOf(author6),
    publisher6,
    "1996",
    272,
    "Romance",
    "La historia de amor entre Noah y Allie, que se conocen durante el verano de 1946 en Carolina del Norte",
    "978-0446603657"
)


