package ru.xpendence.rosbankalgorythm.service

import ru.xpendence.rosbankalgorythm.dto.MobileDto

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 14:02
 * e-mail: slava_rossii@list.ru
 */
interface MobileService {

    fun send(phone: String): MobileDto
}
