package ru.xpendence.rosbankalgorythm.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import ru.xpendence.rosbankalgorythm.dto.TaxServiceRequestDto
import ru.xpendence.rosbankalgorythm.dto.TaxServiceResponseDto
import ru.xpendence.rosbankalgorythm.dto.TaxServiceResponseNative
import ru.xpendence.rosbankalgorythm.mapper.TaxServiceResponseMapper
import ru.xpendence.rosbankalgorythm.util.HeaderUtils

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 11:43
 * e-mail: slava_rossii@list.ru
 */
@Service
class TaxServiceImpl : TaxService {

    @Autowired
    private lateinit var restTemplate: RestTemplate

    @Autowired
    private lateinit var mapper: TaxServiceResponseMapper

    override fun send(dto: TaxServiceRequestDto): TaxServiceResponseDto {
        val httpEntity = HttpEntity(dto, HeaderUtils.forTaxService())
        val body = mapper.toDto(restTemplate.exchange(
                "https://suggestions.dadata.ru/suggestions/api/4_1/rs/findById/party",
                HttpMethod.POST,
                httpEntity,
                TaxServiceResponseNative::class.java
        ).body!!)
        return body
    }
}
