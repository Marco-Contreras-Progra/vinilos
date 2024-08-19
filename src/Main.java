package coleccionVinilos;

public class ColeccionVinilos {

    public static void main(String[] args) {
        String vinilos[][] = new String [100][3];

        agregarVinilo(vinilos, "Iron maiden", "Iron Maiden", "1980");
        agregarVinilo(vinilos, "Iron maiden", "Killers", "1981");
        agregarVinilo(vinilos, "Iron maiden", "The number of the beast", "1982");
        agregarVinilo(vinilos, "AC-DC","back in black", "1980");
        agregarVinilo(vinilos, "AC-DC", "highway to Hell", "1979");
        agregarVinilo(vinilos, "AC-DC", "Who made who", "1986");
        agregarVinilo(vinilos, "Judas Priest", "British steel", "1980");
        agregarVinilo(vinilos, "Judas Priest", "Painkiller", "1990");
        agregarVinilo(vinilos, "Judas Priest", "Defenders of the faith", "1984");
        agregarVinilo(vinilos, "Kiss", "Destroyer", "1976");
        System.out.println("Espacio máximo colección:" + vinilos.length);

        mostrarTotal(vinilos);
        mostrarDisponibles(vinilos);

        String artista = "AC-DC";
        System.out.println(("buscar artistas:" +artista));

        buscarArtista(vinilos, artista);
        mostrarColeccion(vinilos);


    }
    public static int totalvinilos(String m[][]){
        System.out.println(m.length);



    }



}