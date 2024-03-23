package br.com.fullstack.M1S10.service;

import br.com.fullstack.M1S10.entity.MaterialEntity;
import br.com.fullstack.M1S10.exception.NotFoundException;
import br.com.fullstack.M1S10.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    private final MaterialRepository repository;

    public MaterialServiceImpl(MaterialRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<MaterialEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public MaterialEntity buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Material com o id " + id + " não foi encontrado!"));
    }

    @Override
    public MaterialEntity criar(MaterialEntity entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    @Override
    public MaterialEntity alterar(Long id, MaterialEntity entity) {
        buscarPorId(id);
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void excluir(Long id) {
        MaterialEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
