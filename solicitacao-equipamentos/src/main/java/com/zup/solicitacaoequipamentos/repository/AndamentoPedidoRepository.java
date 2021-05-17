package com.zup.solicitacaoequipamentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zup.solicitacaoequipamentos.entity.AndamentoPedido;

@Repository
public interface AndamentoPedidoRepository extends JpaRepository<AndamentoPedido, Long> {

	List<AndamentoPedido> findAllByPedidoId(Long id);
}
