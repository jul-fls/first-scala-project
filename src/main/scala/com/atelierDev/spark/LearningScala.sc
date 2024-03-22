// VALUES are immutable constants. Once assigned, they cannot be changed.
val hello: String = "Hello"

// VARIABLES are mutable. They are defined with the var keyword.
var helloWorld: String = hello
helloWorld = hello + " World!"

val immutableHelloWorld = hello + " There"

// Data Types
val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.14159
val piSinglePrecision: Float = 3.14159f
val bigNumber: Long = 123456789
val smallNumber: Byte = 127

println("Here is a mess: " + numberOne + truth + letterA + pi + bigNumber)
println(f"Pi is about $piSinglePrecision%.3f")

println(f"Zero padding on the left: $numberOne%05d")

println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")

val theUltimateAnswer: String = "The answer to life, the universe, and everything is 42."
val pattern = """.* ([\d]+).*""".r

val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)