package com.rikkeiacademy.cms.repository;

import java.util.List;

public interface IGeneralRepository<Entity> {
    List<Entity> findAll();

    Entity findById(Long id);

    void save(Entity entity);

    void remove(Long id);
}
