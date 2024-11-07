package com.es.libreria.controller

import com.es.libreria.model.Autor
import com.es.libreria.service.AutorService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/autores")
class AutorController {
    /*
    Responsabiliades
    Manejar las solicitudes HTTP

     */
    private lateinit var autorService: AutorService
    @GetMapping("/{id}") // URI de este metodo -> localhost:8080/auotres/2
    fun getByID(
        @PathVariable id:String
    ):Autor?{
        //Comprobacion basica de parametros de entrada
        if (id.isNullOrEmpty()){
            return null
        }
        // 2º Comunico el controller con el service
        return autorService.getById(id)

    }
}