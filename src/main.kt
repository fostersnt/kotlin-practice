import models.Car

fun main () {
    val newCar = Car();
    val details = newCar.getCarDetails();
    println(details);
}