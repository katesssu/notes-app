package utils

fun readIntNotNull() = readlnOrNull()?.toIntOrNull() ?: -1


fun readNextInt(promt: String?): Int {
    do {
        try {
            print(promt)
            return readln().toInt()
        } catch (e: NumberFormatException) {
            System.err.println("\tEnter a number please.")
        }
    } while (true)
}

fun readNextLine(prompt: String?): String {
    print(prompt)
    return readln()
}

fun readNextChar(prompt: String?): Char {
    do {
        try {
            print(prompt)
            return readln().first()
        } catch (e: NoSuchElementException) {
            System.err.println("\tEnter a character please.")
        }
    } while (true)
}