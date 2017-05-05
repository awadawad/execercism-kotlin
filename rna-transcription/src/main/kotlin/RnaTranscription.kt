fun transcribe(letter: Char): Char {
    when(letter) {
        'G' -> return 'C'
        'C' -> return 'G'
        'T' -> return 'A'
        'A' -> return 'U'
        else -> throw IllegalArgumentException("")
    }
}

fun transcribeToRna(dna: String): String {
    return if(dna.isNullOrBlank()) "" else dna.toCharArray().map { it -> transcribe(it) }.joinToString(separator = "");
}
