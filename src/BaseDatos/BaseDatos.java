package BaseDatos;

import Clases.Cliente;
import Clases.Dia;
import Clases.Ejercicio;
import Clases.Entrenador;
import Clases.Informacion;
import Clases.Plan;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BaseDatos {
    
    public static void escribirEntrenadores(ArrayList<Entrenador> lista) {
        try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("Entrenadores.txt")))) {
            
            for (int i = 0; i < lista.size(); i++) {
                String usuario = lista.get(i).getUsuario();
                String nombre_apellido = lista.get(i).getInformacion().getNombre_apellido();
                int edad = lista.get(i).getInformacion().getEdad();
                String contra = lista.get(i).getContraseña();
                
                salida.println(usuario + "-" + nombre_apellido + "-" + edad + "-" + contra);     
            }
            
            salida.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos");
        }
    }
    
    public static ArrayList<Entrenador> leerEntrenadores(){
        ArrayList<Entrenador> listaEntrenador = new ArrayList<>();

        try (BufferedReader entrada = new BufferedReader(new FileReader("Entrenadores.txt"))){
            
            String s, s2 = new String();
            
            String usuario, nombre, contra;
            int edad;
            
            while ((s = entrada.readLine()) != null) {
                s2 += s + "\n";
                String[] listaTxt = s.split("-");
                
                usuario = listaTxt[0];
                nombre = listaTxt[1];
                edad = Integer.parseInt(listaTxt[2]);
                contra = listaTxt[3];
                
                Informacion info = new Informacion(nombre, edad);
                Entrenador entrenador = new Entrenador(usuario, info, contra);
                listaEntrenador.add(entrenador);
            }
            
            entrada.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer los datos");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return listaEntrenador;
    }
    
    public static void escribirClientes(ArrayList<Cliente> listaCliente) {
        try (PrintWriter salidaCl = new PrintWriter(new BufferedWriter(new FileWriter("Clientes.txt")))) {
            
            for (int i = 0; i < listaCliente.size(); i++) {
                
                Cliente client = listaCliente.get(i);
                
                String usuario = client.getUsuario();
                String nombre_apellido = client.getInformacion().getNombre_apellido();
                int edad = client.getInformacion().getEdad();
                String contra = client.getContraseña();
                String planes = "";
                
                
                if(!client.getListaPlanes().isEmpty()) {
                    for (int j = 0; j < client.getListaPlanes().size(); j++) {
                        Plan plan = client.getListaPlanes().get(i);
                        
                        for (int k = 0; k < plan.getListaDias().size(); k++) {
                            Dia dia = plan.getListaDias().get(k);
                            
                            for (int l = 0; l < dia.getListaEjercicios().size(); l++) {
                                Ejercicio ejer = dia.getListaEjercicios().get(l);
                                
                                String nombreEjer = ejer.getNombreEjercicio();
                                int series = ejer.getSeries();
                                int rep = ejer.getRepeticiones();
                                
                                planes += nombreEjer + "_" + series + "_" + rep;
                                
                                if(dia.getListaEjercicios().size() > 1) {
                                    if(l != dia.getListaEjercicios().size() - 1) {
                                        planes += ";";
                                    }
                                }
                            }
                            
                            if(plan.getListaDias().size() > 1) {
                                if(k != plan.getListaDias().size() -1) {
                                    planes += "/";
                                }
                            }
                        }
                        
                        if( client.getListaPlanes().size() > 1) {
                            if(j != client.getListaPlanes().size() -1) {
                                planes += "|";
                            }
                        }
                    }
                }
                
                salidaCl.println(usuario + "-" + nombre_apellido + "-" + edad + "-" + contra + "-" + planes);
        
            }
            salidaCl.close();
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public static ArrayList<Cliente> leerClientes() {
        ArrayList<Cliente> listaCliente = new ArrayList();
        
        try (BufferedReader entrada = new BufferedReader(new FileReader("Cliente.txt"))){
            String s, s2 = new String();
            
            String usuario, nombre, contra;
            int edad;
            while ((s = entrada.readLine()) != null) {
                s2 += s + "\n";
                String[] listaTxt = s.split("-");
                
                usuario = listaTxt[0];
                nombre = listaTxt[1];
                edad = Integer.parseInt(listaTxt[2]);
                contra = listaTxt[3];
                
                String[] planesTxt = s.split("|");
                ArrayList<Plan> listaPlanes = new ArrayList();
                
                for (int i = 0; i < planesTxt.length; i++) {
                    String[] dias = planesTxt[i].split("/");
                    ArrayList<Dia> listaDias = new ArrayList();
                    
                    for (int j = 0; j < dias.length; j++) {
                        String[] ejercicios = dias[j].split(";");
                        ArrayList<Ejercicio> listaEjercicios = new ArrayList();
                        
                        for (int k = 0; k < ejercicios.length; k++) {
                            String[] caracTxt = ejercicios[k].split("_");
                            
                            String nombreEjer = caracTxt[0];
                            int seriesEjer = Integer.parseInt(caracTxt[1]);
                            int RepEjer = Integer.parseInt(caracTxt[2]);
                            
                            Ejercicio ejer = new Ejercicio(nombreEjer, RepEjer, seriesEjer);
                            listaEjercicios.add(ejer);
                        }
                        
                        Dia dia = new Dia(listaEjercicios);
                        listaDias.add(dia);
                    }
                    Plan plan = new Plan(listaDias);
                    listaPlanes.add(plan);
                }
                
                Informacion info = new Informacion(nombre, edad);
                Cliente client = new Cliente(usuario, info, contra, listaPlanes);
                listaCliente.add(client);
            }
            
            entrada.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer los datos");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return listaCliente;
    }
}
