package ru.xpendence.rosbankalgorythm.dto

import com.fasterxml.jackson.annotation.JsonInclude

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 11:58
 * e-mail: v.chernyshov@pflb.ru
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class TaxServiceResponseDto(
        val name: String?,
        val latitude: String?,
        val longitude: String?,
        val inn: String?,
        val region: String?
        )
