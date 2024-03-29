package ru.xpendence.rosbankalgorythm.dto

import java.io.Serializable

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 12:58
 * e-mail: slava_rossii@list.ru
 */
data class TaxServiceResponseNative(val suggestions: List<Suggestion> = listOf()) : Serializable
