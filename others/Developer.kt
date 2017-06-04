class Developer(var name: String?, var age: Int) {

    // default getters/setters

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val developer = o as Developer?

        if (age != developer!!.age) return false
        return if (name != null) name == developer.name else developer.name == null
    }

    override fun hashCode(): Int {
        var result = if (name != null) name!!.hashCode() else 0
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        val text = """
                | Developer
                | Name = $name
                | Age = $age

                """.trimMargin()
        return text
    }
}
