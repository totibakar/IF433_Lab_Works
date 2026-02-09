package oop_00000127746_TitoShafy.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Hero Setup ---")
    print("Hero name: ")
    val name = scanner.nextLine()
    print("Base damage: ")
    val damage = scanner.nextInt()

    val player = Hero(name, damage)
    var enemyHp = 100
    println("--- Starting match ----")

    while(player.isAlive() && enemyHp > 0) {
        println("\n${player.name} HP: ${player.hp} | Enemy HP: $enemyHp")
        println("Menu: 1. Attack, 2. Retreat")
        print("Choose: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            player.attack("Enemy")
            enemyHp -= player.baseDamage
            println("Enemy takes ${player.baseDamage} damage. Enemy HP remaining: ${if (enemyHp < 0 ) 0 else enemyHp}.")

            if (enemyHp > 0) {
                val randomDmg = (10..20).random()
                println("Enemy fights back! ${player.name} takes $randomDmg damage.")
                player.takeDamage(randomDmg)
            }
        }else if (choice == 2) {
            println("You choose retreat, match ended!")
            break
        } else {
            println("Invalid choice!")
        }
    }

    println("--- Result ---")
    if (enemyHp <= 0){
        println("Winner winner chicken dinner! Enemy defeated by ${player.name}")
    } else if (!player.isAlive()){
        println("You are cooked! ${player.name} is down!")
    }
}