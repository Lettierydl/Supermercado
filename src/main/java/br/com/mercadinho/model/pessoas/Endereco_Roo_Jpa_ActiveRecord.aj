// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package br.com.mercadinho.model.pessoas;

import br.com.mercadinho.model.pessoas.Endereco;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Endereco_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Endereco.entityManager;
    
    public static final EntityManager Endereco.entityManager() {
        EntityManager em = new Endereco().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Endereco.countEnderecoes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Endereco o", Long.class).getSingleResult();
    }
    
    public static List<Endereco> Endereco.findAllEnderecoes() {
        return entityManager().createQuery("SELECT o FROM Endereco o", Endereco.class).getResultList();
    }
    
    public static Endereco Endereco.findEndereco(Long id) {
        if (id == null) return null;
        return entityManager().find(Endereco.class, id);
    }
    
    public static List<Endereco> Endereco.findEnderecoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Endereco o", Endereco.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Endereco.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Endereco.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Endereco attached = Endereco.findEndereco(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Endereco.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Endereco.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Endereco Endereco.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Endereco merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}