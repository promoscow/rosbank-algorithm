package ru.xpendence.rosbankalgorythm.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.xpendence.rosbankalgorythm.dto.Test
import java.time.LocalDateTime

/**
 * Author: Vyacheslav Chernyshov
 * Date: 03.12.19
 * Time: 17:36
 * e-mail: v.chernyshov@pflb.ru
 */
@RestController
@RequestMapping("/test")
class TestController {

    @GetMapping
    fun get(): ResponseEntity<Test> = ResponseEntity.ok(Test())
}
