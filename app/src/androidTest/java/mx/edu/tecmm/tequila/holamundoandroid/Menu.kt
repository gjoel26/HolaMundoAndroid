package mx.edu.tecmm.tequila.holamundoandroid
import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    val nombres = mutableListOf<String>()

    var opcion: Int

    do {
        println("Menú:")
        println("1) Agregar")
        println("2) Mostrar")
        println("3) Salir")
        print("Elige una opción: ")
        opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                print("Ingresa un nombre: ")
                val nombre = readLine().toString()
                nombres.add(nombre)
                println("Nombre agregado correctamente.")
            }
            2 -> {
                println("Cantidad de nombres almacenados: ${nombres.size}")
            }
            3 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opción no válida. Por favor, elige una opción válida.")
            }
        }
    } while (opcion != 3)
}
