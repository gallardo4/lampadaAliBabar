class Lampada {
    private var encesa: Boolean = false
    private var color = listOf("")
    private var posColorActual: Int = 0
    private var intensitat: Int = 0

    constructor(pEncesa: Boolean, pColor: List<String>, pIntensitat: Int){
        this.encesa = pEncesa
        this.color = pColor
        this.intensitat = pIntensitat
    }

    fun encendreLampada():Boolean{
        encesa = true
        return encesa
    }

    fun apagarLampada():Boolean{
        encesa = false
        posColorActual = 0
        intensitat = 1
        return encesa
    }

    fun canviarColorLampada():String{
        if (encesa) {
            posColorActual = (posColorActual + 1) % color.size
            return color[posColorActual]
        }
        return color[posColorActual]
    }

    fun canviarIntensitatLampada():Int{
        return if (encesa) intensitat++
        else 1
    }

    override fun toString(): String {
        return if (encesa && color[posColorActual]=="blau") "\nLàmpada encesa" +
                "\nColor: ${BLUE + color[posColorActual] + RESET}" +
                "\nIntensitat: $intensitat"
        else if (encesa && color[posColorActual]=="vermell") "\nLàmpada encesa" +
                "\nColor: ${RED + color[posColorActual] + RESET}" +
                "\nIntensitat: $intensitat"
        else if (encesa && color[posColorActual]=="groc") "\nLàmpada encesa" +
                "\nColor: ${YELLOW + color[posColorActual] + RESET}" +
                "\nIntensitat: $intensitat"
        else if (encesa && color[posColorActual]=="verd") "\nLàmpada encesa" +
                "\nColor: ${GREEN + color[posColorActual] + RESET}" +
                "\nIntensitat: $intensitat"
        else "\nLàmpada apagada"
    }
}