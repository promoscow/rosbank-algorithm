package ru.xpendence.rosbankalgorythm.dto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 13:00
 * e-mail: slava_rossii@list.ru
 */
data class Suggestion(

        @JsonProperty("unrestricted_value")
        val unrestrictedValue: String?,

        val data: Data?
)
