package com.rey.test

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
class TestController {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    @RequestMapping(value = ["/test"], method = [RequestMethod.GET], produces = [MediaType.TEXT_PLAIN_VALUE])
    fun test(): ResponseEntity<String> {
        logger.info("test response")
        return ResponseEntity<String>(HttpStatus.OK)
    }

}