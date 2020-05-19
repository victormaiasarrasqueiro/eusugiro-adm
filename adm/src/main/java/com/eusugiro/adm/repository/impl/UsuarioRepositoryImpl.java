/**
 * 
 */
package com.eusugiro.adm.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eusugiro.adm.entity.UsuarioEntity;
import com.eusugiro.adm.repository.UsuarioRepository;
import com.eusugiro.adm.repository.jpa.UsuarioJpaRepository;

/**
 * @author CERC
 *
 */
@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

	private UsuarioJpaRepository usuarioJpaRepository;
	
	/**
	 * 
	 * @param storage
	 * @param pessoaBusiness
	 */
    @Autowired
	public UsuarioRepositoryImpl(UsuarioJpaRepository usuarioJpaRepository){
    	this.usuarioJpaRepository = usuarioJpaRepository;
	}

	/**
     * 
     * @return List<PessoaEntity>
     */
	public List<UsuarioEntity> listarTodos() {
		return usuarioJpaRepository.findAll();
    }
	
}
