package ru.xpendence.rosbankalgorythm.util

import org.springframework.http.HttpHeaders

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 11:44
 * e-mail: v.chernyshov@pflb.ru
 */
class HeaderUtils {

    companion object {
        @JvmStatic
        fun forTaxService(): HttpHeaders {
            val headers = HttpHeaders()
            headers.add("Content-Type", "application/json")
            headers.add("Accept", "application/json")
            headers.add("Authorization", "Token d4b70df6fa07713538a8092368496b4a261b0106")
            return headers
        }
    }
}
