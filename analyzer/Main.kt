package analyzer

import java.io.File

fun main(args: Array<String>) {
    val (filename, pattern, description) = args

    if(File(filename).readText().contains(pattern))
        println(description)
    else
        println("Unknown file type")
}