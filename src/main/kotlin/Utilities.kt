import java.util.Scanner

fun llegirInt(pMessage: String, intMin:Int, intMax:Int):Int{
    val scan= Scanner(System.`in`)
    var valorInt=0
    var valorCorrecto:Boolean
    do {
        print(pMessage)
        valorCorrecto=scan.hasNextInt()
        if (!valorCorrecto){
            print("\nERROR: introdueix un nombre enter" +
                    "\nOpció: ")
        }else{
            valorInt=scan.nextInt()
            if (valorInt<intMin || valorInt>intMax){
                valorCorrecto=false
                print("\nERROR: introdueix un nombre entre els valors requerits" +
                        "\nOpció: ")
            }
        }
        scan.nextLine()
    }while (!valorCorrecto)
    return valorInt
}