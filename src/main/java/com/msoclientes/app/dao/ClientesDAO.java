package com.msoclientes.app.dao;

import com.msoclientes.app.model.ClientesModel;

public interface ClientesDAO {

	public Object setClientes(ClientesModel cliente) throws Exception;

	public Object getClientes() throws Exception;

	Object getDetalleCliente(String nombre) throws Exception;

}
