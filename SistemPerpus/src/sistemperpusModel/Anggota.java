/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.util.List;
import java.util.Set;
        
        
/**
 *
 * @author Mira
 */
public class Anggota {
    private String nipm;
    private String password;
    private String jabatan;
    private int total_pinjam;
    private SimpleDateFormat tgl_expire;
    private double denda;
 
    public Anggota (String NIPM, String passwd, String Jabatan, 
            int Total, SimpleDateFormat Expire, double Denda)
    {
        this.nipm = NIPM;
        this.password = passwd;
        this.jabatan = Jabatan;
        this.total_pinjam = Total;
        this.tgl_expire = Expire;
        this.denda = Denda;
    }
    
    public Anggota (String NIPM, String passwd){
        this.nipm = NIPM;
        this.password = passwd;
    }
    
    public Boolean Login (String NIPM, String Password){
        try {
            List<Anggota> listAnggota = getAnggota();
            Boolean status=false;
            int i=0;
            while (!status && i < listAnggota.size()){
                if (listAnggota.get(i).nipm.equals(NIPM) && 
                        listAnggota.get(i).password.equals(Password)){
                    status = true;
                }
                else
                    i++;
            }
            return status;     
        }
        catch(Exception e){
            return false;
        }
    }
    
    @SuppressWarnings({"unchecked","null"})
    public List getAnggota(){
        System.out.println("Masuk ke model");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
        List<Anggota> list = new ArrayList<Anggota>();
        Anggota A = new Anggota ("121524019","mira");
        Anggota B = new Anggota ("121524007","ine");
        list.add(A);
        list.add(B);
        System.out.println("keluar model");
        return list;
        /*System.out.println("Masuk getAnggota");
        List<Anggota> anggota = new ArrayList<Anggota>();
        try{
            System.out.println("Masuk try");
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            InputStream in = new FileInputStream("dataAnggota.xml");
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            System.out.println("Anggota A");
            Anggota A = null;
            
            while (eventReader.hasNext()){
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()){
                    StartElement startElement = event.asStartElement();
                    if(startElement.getName().getLocalPart().equals("anggota")){
                        A = new Anggota("","");
                        Iterator<Attribute> attributes = startElement.getAttributes();
                        while (attributes.hasNext()){
                            Attribute attribute = attributes.next();
                            if (attribute.getName().toString().equals("nipm")){
                                A.setNIPM(attribute.getValue());
                            }
                        }
                
                    }
                 if(event.isStartElement()){
                    if(event.asStartElement().getName().getLocalPart().equals("password")){
                         event = eventReader.nextEvent();
                         A.setPassword(event.asCharacters().getData());
                         continue;
                    }
                 }
                 if(event.asStartElement().getName().getLocalPart().equals("jabatan")){
                         event = eventReader.nextEvent();
                         A.setJabatan(event.asCharacters().getData());
                         continue;
                 }
                 if(event.asStartElement().getName().getLocalPart().equals("total_pinjam")){
                         event = eventReader.nextEvent();
                         A.setTotalPinjam(Integer.parseInt(event.asCharacters().getData()));
                         continue;
                 }
                /*if(event.asStartElement().getName().getLocalPart().equals("tgl_expire")){
                         SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
                         event = eventReader.nextEvent();
                         A.setTglExpire(format.parse(event.asCharacters().getData()));
                         continue;
                 }
                if(event.asStartElement().getName().getLocalPart().equals("denda")){
                         event = eventReader.nextEvent();
                         A.setTotalPinjam(Integer.parseInt(event.asCharacters().getData()));
                         continue;
                 }
            }
            if (event.isEndElement()){
                EndElement endElement = event.asEndElement();
                if (endElement.getName().getLocalPart().equals("anggota")){
                    anggota.add(A);
                }
            }
        }
    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (XMLStreamException e) {
        e.printStackTrace();
    }
        return anggota;*/
 }
    
    public String getNIPM (){
        return this.nipm;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public int getTotalPinjam(){
        return this.total_pinjam;
    }
    
    public SimpleDateFormat getTglExpire(){
        return this.tgl_expire;
    }
    
    public double getDenda(){
        return this.denda;
    }
    
    public void setNIPM(String NIPM){
        this.nipm = NIPM;
    }
    
    public void setPassword (String passwd){
        this.password = passwd;
    }
    
    public void setJabatan(String Jabatan){
        this.jabatan = Jabatan;
    }
    
    public void setTotalPinjam(int Pinjam){
        this.total_pinjam = Pinjam;
    }
    
    public void setTglExpire(SimpleDateFormat Expire){
        this.tgl_expire = Expire;
    }
    
    public void setDenda(double Denda){
        this.denda = Denda;
    }
}
