package com.rikkeiacademy.cms.service;

import java.util.List;

public interface IGeneralService <Entity>{
    List<Entity> findAll();

    Entity findById(Long id);

    void save(Entity entity);

    void remove(Long id);
}
