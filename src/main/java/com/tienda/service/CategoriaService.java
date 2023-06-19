package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se declara un metodo para obtener un listado de Array de Objetos Categorias
    //Los objetos vienen de la tabla categoria...
    //Son todos los registros o solo los activos.
    public List<Categoria> getCategorias(boolean activos);
    
    //Abajo se colocaran los metodos para un CRUD en semana 6
            
 }
