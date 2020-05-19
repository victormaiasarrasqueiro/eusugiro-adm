package com.eusugiro.adm.business;

import java.util.List;

import com.eusugiro.adm.entity.UsuarioEntity;

public interface UsuarioBusiness {

	 /**
     * Listar todos os usuarios
     * 
     * @return List<UsuarioEntity> lista de usuarios
     */
    public List<UsuarioEntity> listarTodos();
    
}
