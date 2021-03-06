package Lenguajes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


class Persis {
    ArrayList<Lenguajes.Usuario> usuarios=new ArrayList<Lenguajes.Usuario>();
    
    public  ArrayList<Lenguajes.Usuario> buscar()throws Exception{
        
        File file=new File("File");
        FileInputStream fileInputStream =new FileInputStream(file);
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
       usuarios=(ArrayList<Lenguajes.Usuario>) objectInputStream.readObject();
       return usuarios;
    }
    
    public void guardarUsuario(Lenguajes.Usuario u)throws Exception{
        File file=new File("File");
        if(file.exists()){
        usuarios=buscar();
        }
        FileOutputStream fileOutputStream =new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        usuarios.add(u);
        objectOutputStream.writeObject(usuarios); 
        
    }

    
}
