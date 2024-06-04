public class Main {
    public static void main(String[] args) {
        // Crear 2 Clientes
        Cliente juanPerez = new Cliente("111111111","Juan Perez",25);
        Cliente joseSoto = new Cliente("222222222","Jose Soto",45);

        // Crear 3 Vehiculos
        Taxi bbcl34 = new Taxi("negro","BBCL34",1000);
        Bus aabb12 = new Bus("azul","AABB12",50);
        MiniBus ptcl23 = new MiniBus("amarillo","PTCL23",20,"turismo");

        // Crear 3 instancias de LibroVenta
        LibroVenta bbcl34111111111 = new LibroVenta("bbcl34111111111","01102020");
        LibroVenta aabb12111111111 = new LibroVenta("aabb12111111111","01102020");
        LibroVenta ptcl23222222222 = new LibroVenta("ptcl23222222222","03062024");

        // Registrar las 3 Ventas en archivos
        bbcl34111111111.guardarVenta(juanPerez,bbcl34);
        aabb12111111111.guardarVenta(juanPerez,aabb12);
        ptcl23222222222.guardarVenta(joseSoto,ptcl23);
    }
}
