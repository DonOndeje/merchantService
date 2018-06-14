/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Ouote;
/**
 *
 * @author Don
 */
public interface QueryRepository extends JpaRepository<Ouote,Integer>{
    public abstract void findByUsername(String username);
}
