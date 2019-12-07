package ru.xpendence.rosbankalgorythm.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.xpendence.rosbankalgorythm.dto.TaxServiceRequestDto
import ru.xpendence.rosbankalgorythm.dto.TaxServiceResponseDto
import ru.xpendence.rosbankalgorythm.service.TaxService

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 12:22
 * e-mail: v.chernyshov@pflb.ru
 */
@RestController
@RequestMapping("/inn")
class TaxServiceController {

    @Autowired
    lateinit var service: TaxService

    @GetMapping
    fun getByInn(@RequestParam inn: String): ResponseEntity<TaxServiceResponseDto> =
            ResponseEntity.ok(service.send(TaxServiceRequestDto(inn)))
}
