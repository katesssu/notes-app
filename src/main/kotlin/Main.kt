import io.github.oshai.kotlinlogging.KotlinLogging
import utils.readIntNotNull
import utils.readNextChar
import utils.readNextInt
import utils.readNextLine
import java.lang.System.exit

fun mainMenu(): Int {
    print("""
          ----------------------------------
          |        NOTE KEEPER APP         |
          ----------------------------------
          | NOTE MENU                      |
          |   1) Add a note                |
          |   2) List all notes            |
          |   3) Update a note             |
          |   4) Delete a note             |
          ----------------------------------
          |   0) Exit                      |
          ----------------------------------
          ==>> """.trimMargin(">"))
    return utils.readIntNotNull()
}

fun runMenu() {
    do {
        when (val option = mainMenu()) {
            1 -> addNote()
            2 -> listNotes()
            3 -> updateNote()
            4 -> deleteNote()
            0 -> exitApp()
            else -> println("Invalid option entered: $option")
        }
    } while (true)
}

fun addNote(){
    logger.info { "addNote() function invoked" }
    readNextLine ("Enter a line: ")
}

fun listNotes(){
    println("You chose List Notes")
}

fun updateNote(){
    println("You chose Update Note")
}

fun deleteNote(){
    println("You chose Delete Note")
}

fun exitApp(){
    println("Exiting...bye")
    exit(0)
}

private val logger = KotlinLogging.logger {}

fun main() {
    runMenu()
}


