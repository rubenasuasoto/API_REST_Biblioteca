package com.es.libreria.service

import com.es.libreria.model.Autor
import com.es.libreria.repository.AutorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class AutorService {
    @Autowired
    private lateinit var autorRepository: AutorRepository
    /*
    Reposabilidades
    Controlar la logiaca de negocio
    Comunicarse con el repository
     */
    fun getById(id:String):Autor?{
        //1º Implementar la logica del negocio
         var   idl : Long = 0
        try {
            idl = id.toLong()
        } catch (e:Exception) {
            e.printStackTrace()
            return null
        }
        //  2º comunicación con repository
        val autor: Autor? = autorRepository.findByIdOrNull(idl)
        return autor
    }
}