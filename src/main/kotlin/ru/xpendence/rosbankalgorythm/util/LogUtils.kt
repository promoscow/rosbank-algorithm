package ru.xpendence.rosbankalgorythm.util

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Author: Vyacheslav Chernyshov
 * Date: 23.06.19
 * Time: 17:38
 * e-mail: 2262288@gmail.com
 */
inline fun <reified T> logger(): Logger {
    return LoggerFactory.getLogger(T::class.java)
}
