package com.zup.solicitacaoequipamentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zup.solicitacaoequipamentos.entity.Pedido;
import com.zup.solicitacaoequipamentos.enums.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido>findAllByUsuarioId(Long id);
	
	@Query("UPDATE Pedido SET status = ?2 WHERE id = ?1")
	public Pedido updateStatus(Long id, StatusPedido status);
}
