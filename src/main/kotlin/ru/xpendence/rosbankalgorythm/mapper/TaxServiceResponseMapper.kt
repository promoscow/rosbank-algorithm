package ru.xpendence.rosbankalgorythm.mapper

import org.springframework.stereotype.Component
import ru.xpendence.rosbankalgorythm.dto.TaxServiceResponseDto
import ru.xpendence.rosbankalgorythm.dto.TaxServiceResponseNative

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 12:59
 * e-mail: v.chernyshov@pflb.ru
 */
@Component
class TaxServiceResponseMapper {

    fun toDto(native: TaxServiceResponseNative): TaxServiceResponseDto = TaxServiceResponseDto(
            native.suggestions[0].unrestrictedValue,
            native.suggestions[0].data!!.address!!.addressData!!.latitude,
            native.suggestions[0].data!!.address!!.addressData!!.longitude,
            native.suggestions[0].data!!.inn,
            native.suggestions[0].data!!.address!!.addressData!!.region
    )
}
