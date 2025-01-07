package com.resolucion.resolucion.domain.api;

public class ApiEndpoint {
  public static final String API_BASE_URL_RESOLUCION = "api/v1/resolucion/";
  public static final String API_BASE_URL_ARCHIVO = "api/v1/archivo/";
  public static final String GET_ALL_RESOLUCION = "list";
  public static final String GET_RESOLUCION_BY_ID = "get/{id_resolucion}";
  public static final String GET_RESOLUCION_BY_ID_ARCHIVO = "get/{id_archivo}";
  public static final String CREATE_RESOLUCION = "create";
  public static final String UPDATE_RESOLUCION = "update/{id_resolucion}";
  public static final String DELETE_RESOLUCION = "delete/{id_resolucion}";
  public static final String GET_ALL_ARCHIVO = "list";
}