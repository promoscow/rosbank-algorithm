package ru.xpendence.rosbankalgorythm.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.InvalidDataAccessApiUsageException
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder
import ru.xpendence.rosbankalgorythm.dto.MobileDto
import ru.xpendence.rosbankalgorythm.util.logger

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 14:03
 * e-mail: slava_rossii@list.ru
 */
@Service
class MobileServiceImpl : MobileService {

    val log = logger<MobileServiceImpl>()

    @Autowired
    private lateinit var restTemplate: RestTemplate

    override fun send(phone: String): MobileDto {
        val mobileDto = restTemplate.getForObject(
                UriComponentsBuilder.fromHttpUrl("http://localhost:8083/cities").queryParam("phone", phone).toUriString(),
                MobileDto::class.java
        ) ?: throw InvalidDataAccessApiUsageException("Телефонный номер $phone не распознан операторами.")
        log.info("returned info for phone $phone: $mobileDto")
        return mobileDto
    }
}
