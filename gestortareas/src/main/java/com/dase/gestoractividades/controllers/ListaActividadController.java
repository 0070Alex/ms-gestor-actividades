/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.controllers;

import com.dase.gestoractividades.commons.CommonController;
import com.dase.gestoractividades.entities.ListaActividad;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dase.gestoractividades.services.ListaActividadSvc;

/**
 *
 * @author Alexander Elias
 */

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path = "/lista-actividad")
public class ListaActividadController extends CommonController<ListaActividad, ListaActividadSvc>{
    
}
