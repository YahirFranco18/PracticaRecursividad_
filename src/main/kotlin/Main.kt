fun main(args: Array<String>) {
    println("la diferencia entre es: ${numberCounter(7, 10)}")


    println("Program arguments: ${args.joinToString()}")
}


fun numberCounter(startNumber:Int,finalNumber:Int):Int{



    val suma:Int
    if(startNumber !=  finalNumber){
        suma = 1 + numberCounter(startNumber + 1,finalNumber)
    }else{
        return 0
    }
    return suma
}