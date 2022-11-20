package com.test.tpgestionmagasinstock.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
public class ControllerGeneric<T,ID> {
    @Autowired
    private ImplementationGeneric<T,ID> service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
        public T save(@RequestBody T t) throws Exception {
        T Response = (T) service.save(t);
        return Response;
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<T> RetrieveAll() {
        try {
            return service.repo.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteStock(@PathVariable ID id) {
        try {
            service.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "Supprimé";
    }


}