package oop_00000127746_TitoShafy.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Waspada! Muncul monster: ${event.monsterName}")
        is BattleState.LootDropped -> println("Harta Karun! Mendapatkan ${event.item.name} dengan rarity ${event.item.rarity}")
        is BattleState.GameOver -> println("Permainan Selesai: ${event.reason}")
        BattleState.SafeZone -> println("Kamu berada di zona aman. Silakan beristirahat.")
    }
}