package com.eusugiro.adm.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.eusugiro.adm.business.UsuarioBusiness;
import com.eusugiro.adm.entity.UsuarioEntity;
import com.eusugiro.adm.repository.UsuarioRepository;

/**
 * 
 * Classe UsuarioBusinessImpl
 * 
 * Essa classe de negocio sera responsavel pelas operacoes do usuario
 * 
 * @author victor.maia
 *
 */
@Component
@Service
public class UsuarioBusinessImpl implements UsuarioBusiness {
	
	private UsuarioRepository usuarioRepository;
	
	/**
	 * 
	 * costrutor da classe UsuarioBusinessImpl
	 * 
	 * @param storage
	 * @param pessoaBusiness
	 */
    @Autowired
	public UsuarioBusinessImpl(UsuarioRepository usuarioRepository) {
    	
    	// A annotation @Autowired injeta no parametro usuarioRepository uma instancia da classe UsuarioRepository
    	// E a mesma coisa de fazer usuarioRepository = new UsuarioRepository()
    	// No entanto quando esse objeto e criado pelo Spring, o objeto fica sendo controlado por ele.
    	// Logo, ele faz com que em toda a sua aplicacao, so tenhamos UM objeto desta classe em memoria, economuzando memoria.
    	
    	
    	this.usuarioRepository = usuarioRepository;
	}
    
    /**
     * Listar todos os usuarios
     * 
     * @return List<UsuarioEntity> lista de usuarios
     */
    public List<UsuarioEntity> listarTodos(){
    	return usuarioRepository.listarTodos();
    }
    
}
