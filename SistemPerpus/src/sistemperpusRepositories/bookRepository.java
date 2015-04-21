/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusRepositories;
import sistemperpusModel.Buku;
import java.util.List;

/**
 *
 * @author Mira
 */
public interface bookRepository {
    
    void addBuku(Buku buku);
    void deleteBuku (Buku buku);
    void updateBuku (Buku buku);
    
    List FindAll(Buku buku);
}
