import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta() {
    }

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {

        String directorio = "ficheros";
        String archivo = this.getNombreVenta()+".txt";

        // Crear directorio si es necesario
        File objDirectorio = new File("src/"+directorio);
        if(objDirectorio.exists()) {
            System.out.println("El directorio ya existe");
        } else {
            try {
                if (objDirectorio.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {
                    System.out.println("El directorio no se pudo crear");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Erro al crear el directorio");
                e.printStackTrace();
                return;
            }
        }

        // Listar datos para escribir en archivo
        ArrayList<String> lineas = new ArrayList<>();
        lineas.add("patente: "+vehiculo.getPatente());
        lineas.add("edad cliente: "+cliente.getEdad());
        lineas.add("fecha venta: "+this.getFechaVenta());
        lineas.add("nombre venta: "+this.getNombreVenta());

        // Crear y escribir en archivo
        File objArchivo = new File(objDirectorio.getAbsolutePath()+"/"+archivo);
        BufferedWriter bw = null;
        FileWriter fw = null;
        // Validar que el archivo no exista.
        if (objArchivo.exists()) {
            System.out.printf("El archivo: %s ya existia.\n",archivo);
            return;
        }
        try {
            objArchivo.createNewFile();
            fw = new FileWriter(objArchivo);
            bw = new BufferedWriter(fw);
            Iterator<String> iterator = lineas.iterator();

            while(iterator.hasNext()) {
                bw.write(iterator.next());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}
