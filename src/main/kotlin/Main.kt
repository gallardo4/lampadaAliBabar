fun main(){
    lampada1()
    lampada2()
    menuLampada()
}

fun lampada1(){
    val lampada1: Lampada = Lampada(false, listOf("blau", "vermell", "groc", "verd"), 1)

    println(YELLOW+"\nLÀMPADA 1"+RESET)

    println(lampada1)

    lampada1.encendreLampada()
    println(lampada1)

    lampada1.canviarColorLampada()
    println(lampada1)

    lampada1.canviarColorLampada()
    println(lampada1)

    lampada1.canviarColorLampada()
    println(lampada1)

    lampada1.canviarIntensitatLampada()
    println(lampada1)

    lampada1.canviarIntensitatLampada()
    println(lampada1)

    lampada1.canviarIntensitatLampada()
    println(lampada1)

    lampada1.canviarIntensitatLampada()
    println(lampada1)
}

fun lampada2(){
    val lampada2: Lampada = Lampada(false, listOf("blau", "vermell", "groc", "verd"), 1)

    println(YELLOW+"\nLÀMPADA 2"+RESET)

    println(lampada2)

    lampada2.encendreLampada()
    println(lampada2)

    lampada2.canviarColorLampada()
    println(lampada2)

    lampada2.canviarColorLampada()
    println(lampada2)

    lampada2.canviarIntensitatLampada()
    println(lampada2)

    lampada2.canviarIntensitatLampada()
    println(lampada2)

    lampada2.canviarIntensitatLampada()
    println(lampada2)

    lampada2.canviarIntensitatLampada()
    println(lampada2)

    lampada2.apagarLampada()
    println(lampada2)

    lampada2.canviarColorLampada()
    println(lampada2) // La làmpada no canviarà de color perquè està apagada i, per tant, mostrarà només "Làmpada apagada"

    lampada2.encendreLampada()
    println(lampada2)

    lampada2.canviarColorLampada()
    println(lampada2)

    lampada2.canviarIntensitatLampada()
    println(lampada2)

    lampada2.canviarIntensitatLampada()
    println(lampada2)

    lampada2.canviarIntensitatLampada()
    println(lampada2)

    lampada2.canviarIntensitatLampada()
    println(lampada2)
}

fun menuLampada(){
    val lampada: Lampada = Lampada(false, listOf("blau", "vermell", "groc", "verd"), 1)

    var continuar = true

    println(YELLOW+"\nMENÚ LÀMPADA"+RESET)

    while (continuar){
        print("\nEscull una opció:" +
                "\n1. Encendre làmpada" +
                "\n2. Apagar làmpada" +
                "\n3. Canviar color làmpada" +
                "\n4. Canviar intensitat làmpada" +
                "\n5. Mostrar estat làmpada" +
                "\n6. Sortir" +
                "\nOpció: ")

        val opcio = llegirInt("", 1, 6)

        when (opcio){
            1 -> lampada.encendreLampada()
            2 -> lampada.apagarLampada()
            3 -> lampada.canviarColorLampada()
            4 -> lampada.canviarIntensitatLampada()
            5 -> println(lampada)
            6 -> continuar = false
        }

        if (continuar && opcio != 5) println(lampada)
    }
}