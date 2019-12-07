package ru.xpendence.rosbankalgorythm.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.xpendence.rosbankalgorythm.dto.MobileDto
import ru.xpendence.rosbankalgorythm.service.MobileService

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 14:04
 * e-mail: slava_rossii@list.ru
 */
@RestController
@RequestMapping("/mobile")
class MobileController {

    @Autowired
    private lateinit var service: MobileService

    @GetMapping
    fun get(@RequestParam phone: String): ResponseEntity<MobileDto> = ResponseEntity.ok(service.send(phone))
}
