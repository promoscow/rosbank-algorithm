package ru.xpendence.rosbankalgorythm.dto

import com.fasterxml.jackson.annotation.JsonInclude
import java.io.Serializable

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 11:58
 * e-mail: slava_rossii@list.ru
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class TaxServiceResponseDto(
        val name: String?,
        val latitude: String?,
        val longitude: String?,
        val inn: String?,
        val region: String?
        ) : Serializable
