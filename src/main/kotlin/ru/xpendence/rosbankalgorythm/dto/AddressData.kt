package ru.xpendence.rosbankalgorythm.dto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 13:11
 * e-mail: slava_rossii@list.ru
 */
data class AddressData(

        @JsonProperty("geo_lat")
        val latitude: String?,

        @JsonProperty("geo_lon")
        val longitude: String?,

        @JsonProperty("region")
        val region: String?
)
