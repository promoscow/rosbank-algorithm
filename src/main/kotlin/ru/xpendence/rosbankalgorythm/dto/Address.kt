package ru.xpendence.rosbankalgorythm.dto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 13:11
 * e-mail: v.chernyshov@pflb.ru
 */
data class Address(

        @JsonProperty("data")
        val addressData: AddressData?
)
