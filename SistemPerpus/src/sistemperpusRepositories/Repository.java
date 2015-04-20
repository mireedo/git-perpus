/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusRepositories;

import java.util.List;

/**
 *
 * @author Mira
 */
public interface Repository<T> {
    public List<T> FindAll();
    public T get(int id);
    public void add(T t);
    public void delete(T t);
    public void update(int id, T t);
}
