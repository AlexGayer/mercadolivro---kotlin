package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostControllerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomer(): CustomerModel{
        return CustomerModel(id = "1", name = "Alexandre", email = "alexandregs119@hoitmail.com")
    }

    @PostMapping
    fun create(@RequestBody customer: PostControllerRequest){
        println(customer)
    }


}