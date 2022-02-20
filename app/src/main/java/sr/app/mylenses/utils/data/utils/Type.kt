package sr.app.mylenses.utils.data.utils

import androidx.annotation.Keep

@Keep
enum class Type {
    Left, Right, Undefined;

    companion object {
        fun fromInt(value: Int): Type {
            return values().singleOrNull { it.ordinal == value } ?: Undefined
        }
    }
}