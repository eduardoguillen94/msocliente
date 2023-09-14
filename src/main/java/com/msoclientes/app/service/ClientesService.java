package com.msoclientes.app.service;

import com.msoclientes.app.model.ClientesModel;
import com.msoclientes.app.model.request.ClientesRequestModel;

public interface ClientesService {

	public Object setClientes(ClientesRequestModel cliente) throws Exception;

	public Object getClientes() throws Exception;

	public Object getDetalleCliente(String nombre) throws Exception;
}
