fun main(args: Array<String>) {
    //IF ELSE STATEMENT
    var age:Int
    age = 20
    if (age<18){
        println("Sorry, $age is below the target range")
    }else{
        println("Congrats, you qualify as a member")
    }

    var number:Int
    number = 3
    if (number==1){
        println("Oops!, you lost the guess")
    }else if (number==2){
        println("Oops!, you lost the guess")
    }else if (number==3){
        println("Congrats!, you won")
    }else{
        println("$number is not valid. Please enter number from 1 to 3")
    }

    //WHEN STATEMENT

    var  x = 3
    when(x){
        1-> println("Oops!, you lost the guess")
        2-> println("Oops!, you lost the guess")
        3-> println("Congrats!, you won")
        else-> println("$x is not valid. Please enter number from 1 to 3")
    }
}