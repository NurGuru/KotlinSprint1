package lesson_14

open class SpaceObject(
    habitable: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForLanding: Boolean,
)

class Planet(
    val name: String,
    val sputnik: Int,
    habitable: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForLanding: Boolean,
) : SpaceObject(habitable, atmosphere, water, suitableForLanding)

class Sputnik(
    val name: String,
    habitable: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForLanding: Boolean,
) : SpaceObject(habitable, atmosphere, water, suitableForLanding)

fun main() {
    val planetMars = Planet(
        "Mars",
        2,
        false,
        true,
        true,
        true,
    )
    val sputnikPhobos = Sputnik(
        "Phobos",
        false,
        false,
        false,
        false,
    )

    val sputnikDeimos = Sputnik(
        "Deimos",
        false,
        false,
        false,
        false,
    )

    println("Планет: ${planetMars.name}\nСпутнкики: ${sputnikDeimos.name}, ${sputnikPhobos.name}")
}