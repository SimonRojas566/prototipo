package com.example.springfxcrud.service;
import com.example.springfxcrud.model.Usuario;
import com.example.springfxcrud.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository repo;
    public UsuarioService(UsuarioRepository repo) { this.repo = repo; }
    public List<Usuario> findAll() { return repo.findAll(); }
    public Optional<Usuario> findById(Long id) { return repo.findById(id); }
    public Usuario save(Usuario e) { return repo.save(e); }
    public void deleteById(Long id) { repo.deleteById(id); }
}
