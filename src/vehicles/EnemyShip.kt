package vehicles

import weapons.VoidCannon
import weapons.Weapon
import kotlin.random.Random

open class EnemyShip() {

    private var weapon: Weapon = VoidCannon()
    open var health: Int = 100

    fun fireWeapons(): Int {
        val luckyMultiplier: Double = if (Random.nextDouble(0.0,1.0) > 0.60) 0.5 else 0.0
        if (luckyMultiplier!=0.0){
            print("Enemy ship makes a lucky shot. ")
        } else {
            print("Enemy ship fires at your ship. ")
        }
        return (this.weapon.damage + this.weapon.damage*luckyMultiplier).toInt()
    }

    fun takeDamage(damage: Int) {
        this.health -= damage
        if (this.health <= 0) {
            println(
                "The last shot ruptures the engine drive causing an explosion to rupture through the enemy\'s ship."
            )
        } else {
            println("Enemy ship health is now at: ${this.health}")
        }
    }

    fun getShipName(): String{return "The Doomsday"}

    fun describe(){
        println("You're hailed by a pirate ship calling itself \"The Doomsday\" ")
    }


}