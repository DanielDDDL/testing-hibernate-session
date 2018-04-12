package br.mackenzie.lfs.whatisconsideredwhenpersisted.dto;

public abstract class DTO <T,D extends DTO<T,D>> {

    abstract T convertToEntity();
    abstract T convertToExistingEntity(T entity);
    abstract D convertEntityToDTO(T entity);

}
