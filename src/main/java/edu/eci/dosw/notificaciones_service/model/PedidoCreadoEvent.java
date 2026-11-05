package edu.eci.dosw.notificaciones_service.model;
import java.util.List;

public record PedidoCreadoEvent(String pedidoId, String cliente, List<String> arepas, String fecha) {}

