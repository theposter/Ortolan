package weapons

class `Rens Double Blaster`: Weapon() {

    val userPromptGenerator = getuserPromptGenerator()

    override fun describe() {
        userPromptGenerator.printText(arrayOf("Ren's Double blaster is a heavy artillery weapon that utilizes titanium" +
                " payload sped up to a very high velocity. Developed by the weapon division at Ren's Incorporation, " +
                "its favored by captains who like to gamble. It fires two shots and while the second shot deals" +
                "a considerably big blow, it often misses than hits", "Stats:", "Manufactured by: Flux Industries",
                "Damage: ${this.damage} units of armor", "Reload time: 20s",
                "Compatible with the following class of ships: Epoch & Halison"))
    }

    fun getWeaponName(): String{ return "Rens Double Blaster" }

}