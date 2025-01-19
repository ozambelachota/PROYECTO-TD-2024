package com.reunion.domain.endpoints;

public class APIEndPoint{
public static final String reunionConsejoBasic = "api/reunionconsejo/";
public static final String reunionMiembroBasic = "api/reunionmiembro/";
public static final String personaBasic = "api/persona/";

public static final String reunionConsejoGetAll = "getAll";
public static final String reunionConsejoCreate = "create";
public static final String reunionConsejoBuscarID = "getById/{id_reunion}";
public static final String reunionConsejoUpdate = "update";
public static final String reunionConsejoDelete = "delete/{id_reunion}";

public static final String reunionMiembroGetAll = "getAll";
    public static final String reunionMiembroCreate = "create";
    public static final String reunionMiembroBuscarID = "getById/{id_reunion_miembro}";
    public static final String reunionMiembroUpdate = "update";
    public static final String reunionMiembroDelete = "delete/{id_reunion_miembro}";

    public static final String personaGetAll = "getAll";
    public static final String personaCreate = "crearpersona";
    public static final String personaBuscarID = "getById/{id_persona}";
    public static final String personaUpdate = "update";
    public static final String personaDelete = "delete/{id_persona}";

}
