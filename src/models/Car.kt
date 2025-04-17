package models

class Car {
    var carName = "Toyota";
    var carColor = "Yellow";

    fun getCarDetails(): String
    {
        return "Name: ${this.carName}\nColor: ${this.carColor}";
    }
}