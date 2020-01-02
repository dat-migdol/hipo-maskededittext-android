package com.hipo.maskededittext

class UnselectedMask : Mask() {
    override val maskPattern: String
        get() = ""
    override val returnPattern: String
        get() = ""

    override fun getParsedText(maskedText: String): String? = null
    override fun isValidToParse(filteredText: String) = false
    override fun filterMaskedText(maskedText: String) = ""
}
