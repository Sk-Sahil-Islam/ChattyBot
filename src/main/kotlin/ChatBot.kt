fun main(){
    println("""
        Hello, my name is Lock.
        I was created in 2023.
        Please remind your name.""".trimIndent())
    print(">> ")
    val name = readln()
    println("""
        Nice to meet you $name!
        Let me guess your age.
        Enter remainders of dividing your age by 3, 5, and 7.""".trimIndent())
    val(remainder3, remainder5, remainder7) = List(3){
        print(">> ")
        readln().toInt()
    }
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("""
        Your age is $age; that's a good time to start programming!
        Now I will prove to you that I can count to any number you want.""".trimIndent())
    print(">> ")
    val count = readln().toInt()
    for(i in 0..count) println("$i!")
    println("""
        Let's test your programming knowledge.
        Why do we use methods?
        1. To repeat a statement multiple times.
        2. To decompose a program into several small subroutines.
        3. To determine the execution time of a program.
        4. To interrupt the execution of a program.""".trimIndent())
    do{
        print(">> ")
        val mcq = readln().toInt()
        println("Please, try again.")
    }while(mcq != 2)
    println("Congratulations, have a nice day!")
}