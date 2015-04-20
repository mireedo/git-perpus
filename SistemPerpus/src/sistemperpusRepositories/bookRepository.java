/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusRepositories;
import java.util.ArrayList;
import java.util.List;

import sistemperpusModel.Buku;
/**
 *
 * @author Mira
 */
public class bookRepository implements Repository<Buku> {
    private String isbn;
    private String judul;
    private String penerbit;
    private String author;
    private String sinopsis;
    private String noRak;
    private int stok;
    
    List<Buku> list = new ArrayList<Buku>();
    
    public List<Buku> createData(){
        Buku A = new Buku("978-1118031964", "The Art of Software Testing", 
                "Wiley", "Glenford J. Myers", "The Classic guide to software testing.",
                "3A", 15);
        Buku B = new Buku("978-0439023528", "The Hunger Games", 
                "Scholastic Press", "Suzanne Collins", "The Hunger Games, a fight to the death on live TV.",
                "131F", 3);
        Buku C = new Buku("978-0141441375", "What Maisie Knew", 
                "Penguin Classic", "Henry James", "A book with damning potrait of jealousy.",
                "131H", 2);
        list.add(A); list.add(B); list.add(C);
        return list;
    }
    
    @Override
    public List<Buku> FindAll() {
        list = createData();
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Buku get(int id) {
        return list.get(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Buku t) {
        list.add(t);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Buku t) {
        list.remove(t);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(int id, Buku t) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
