fun main (args: Array<String>) {
//    var counter = 0
//
//    while (counter < 10) {
//        println("The counter is $counter")
//        counter++
//    }
//    counter = 0
//    do {
//        println("The counter is $counter")
//        counter++
//
//    } while (counter < 10)
    var selectionNum = 0
    var selectionText = mutableListOf("cheese")
    var finished = false
    while (finished != true ) {
        print("Please select your pizza toppings\n" +
                "default is cheese pizza \n" +
                "1. sausage\n" +
                "2. peperoni\n" +
                "3. pineapple\n" +
                "4. jalapeño\n" +
                "5. bacon\n")
        selectionNum = readLine()!!.toInt()
        when (selectionNum) {
            1 -> selectionText.add("sausage")
            2 -> selectionText.add("peperoni")
            3 -> selectionText.add("pineapple")
            4 -> selectionText.add("jalapeño")
            5 -> selectionText.add("bacon")
            !in 1..5 -> println("that is an invalid selection")
            else -> println("That is not a valid selection")
        }
        println("current pizza toppings: \n" +
                "$selectionText")
        print("would you like to add more toppings?\n")
        var answer: String? = readLine()
        if (answer?.lowercase() == "n"){
            finished = true
            println("current pizza toppings:\n")
            for (i in selectionText.indices) {
                println("topping ${i+1}: ${selectionText[i]} ")
            }
            println("Making pizza now...")}
        else if (answer?.lowercase() == "y") {
            println("current pizza toppings:\n")
            for (i in selectionText.indices) {
                println("topping ${i+1}: ${selectionText[i]} ")
            }
            println("next ingredient...")
        }
        else{
            println("That is not a valid answer")
            println("next number...")
        }

    }


}


