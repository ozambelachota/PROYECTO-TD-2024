package com.reunion.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reunion.domain.ReunionMiembroModel;
import com.reunion.domain.endpoints.ReunionMiembroEndpoint;
import com.reunion.infrastructure.service.ReunionMiembroService;


@Controller
@RequestMapping(name = ReunionMiembroEndpoint.reunionMiembroBasic)
public class ReunionMiembroController {
     @Autowired
    ReunionMiembroService serviceMiembro;

    @GetMapping(name = ReunionMiembroEndpoint.reunionMiembroGetAll)
    public List<ReunionMiembroModel>getAll(){
        return serviceMiembro.getAll();
    }

    @PostMapping(name =  ReunionMiembroEndpoint.reunionMiembroCreate)
    public ReunionMiembroModel create(@RequestBody ReunionMiembroModel model){
        return serviceMiembro.add(model);
    }
    @GetMapping(name =  ReunionMiembroEndpoint.reunionMiembroBuscarID)
<<<<<<< HEAD

    public ReunionMiembroModel getById(@PathVariable("id_reunionmiembro") int id){
        return serviceMiembro.getById(id);
    }
=======
    public ReunionMiembroModel getById(@PathVariable("id_reunionmiembro") int idMiembro){
        return serviceMiembro.getById(idMiembro);
    }

>>>>>>> 77792ef (actualizacion)
    @PutMapping(name =  ReunionMiembroEndpoint.reunionMiembroUpdate)
    public ReunionMiembroModel update(@RequestBody ReunionMiembroModel model){
        return serviceMiembro.update(model);
    }

    @DeleteMapping(name =  ReunionMiembroEndpoint.reunionMiembroDelete)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public boolean delete(@PathVariable("id_reunion_miembro") int id){
        return serviceMiembro.delete(id);
=======
    public boolean delete(@PathVariable("id_reunion_miembro") int idMiembro){
        return serviceMiembro.delete(idMiembro);
>>>>>>> 77792ef (actualizacion)
=======
    public boolean delete(@PathVariable("id_reunion_miembro") int id){
        return serviceMiembro.delete(id);
>>>>>>> 8737a2c (Avance de REunion Miembro Controller,Model Repository)
=======
    public boolean delete(@PathVariable("id_reunion_miembro") int idMiembro){
        return serviceMiembro.delete(idMiembro);
>>>>>>> 77792ef (actualizacion)
    }
}
