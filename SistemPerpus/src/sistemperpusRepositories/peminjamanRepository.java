/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusRepositories;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import sistemperpusModel.*;
/**
 *
 * @author Mira
 */
public class peminjamanRepository implements Repository<Peminjaman> {
    
    List<Peminjaman> list = new ArrayList();
    SimpleDateFormat dt = new SimpleDateFormat("dd/MM/YYYY");
    
    public List<Peminjaman> createData() throws ParseException{
        try {
        Peminjaman A = new Peminjaman ("1123129898212","978-1118031964",dt.parse("29/4/2015"),dt.parse("6/5/2015"));
        Peminjaman B = new Peminjaman ("1123129898212","978-0439023528",dt.parse("22/4/2015"),dt.parse("29/5/2015"));
        list.add(A); list.add(B);
        }
        catch(ParseException e){
            
        }
        return list;
    }

    @Override
    public List<Peminjaman> FindAll() {
        try {
            list = createData();
        }
        catch(ParseException e){ 
        }
        return list; 
    }

    @Override
    public Peminjaman get(int id) {
        return list.get(id);
    }

    @Override
    public void add(Peminjaman t) {
        list.add(t);
    }

    @Override
    public void delete(Peminjaman t) {
        list.remove(t);
    }

    @Override
    public void update(int id, Peminjaman t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
