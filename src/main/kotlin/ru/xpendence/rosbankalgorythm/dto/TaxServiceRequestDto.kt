package ru.xpendence.rosbankalgorythm.dto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 11:38
 * e-mail: v.chernyshov@pflb.ru
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
data class TaxServiceRequestDto(val query: String, @JsonProperty("branch_type") val branchType: String = "MAIN")
