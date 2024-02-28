package mx.edu.tecmm.tequila.holamundoandroid

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val calificaciones = mutableListOf<Double>()
    val cantidadCalificaciones = 10

    // Pedir al usuario que ingrese las 10 calificaciones
    for (i in 1..cantidadCalificaciones) {
        print("Ingresa la calificación $i: ")
        val calificacion = scanner.nextDouble()
        calificaciones.add(calificacion)
    }

    // Calcular el promedio
    val promedio = average(calificaciones)

    // Mostrar el promedio
    println("El promedio de las calificaciones es: $promedio")
}

fun average(calificaciones: List<Double>): Double {
    var sumatoria = 0.0
    for (calificacion in calificaciones) {
        sumatoria += calificacion
    }
    return sumatoria / calificaciones.size
}
