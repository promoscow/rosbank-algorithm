package ru.xpendence.rosbankalgorythm.service

import ru.xpendence.rosbankalgorythm.dto.TaxServiceRequestDto
import ru.xpendence.rosbankalgorythm.dto.TaxServiceResponseDto

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 11:42
 * e-mail: v.chernyshov@pflb.ru
 */
interface TaxService {

    fun send(dto: TaxServiceRequestDto): TaxServiceResponseDto
}
