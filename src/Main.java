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
    public static int totalvinilos(String m[][]) {
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] != null) {
                total++;
            }
        }
        return total;
    }


    public static int agregarVinilo(String m[][],String gru, String Ip, String agno) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == null) {
                m[i][0] = gru;
                m[i][1] = Ip;
                m[i][2] = agno;
                return i;
            }
        }
        return -1;
    }

    public static  boolean buscarArtista(String m[][], String artista) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == null && m[i][0].equals(artista)){
            return true;
            }


        }
        System.out.println("El artista"+ artista + " si esta en la colección.");
        return false;

    }

    public static void mostrarColeccion(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == null) {
                System.out.println("Fila" + (i+1)+ ": Artista: " + m[i][0] + "Album: " + m[i][1] + "Año: " + m[i][2]);
            }
        }

    }

    public static void mostrarTotal(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == null) {
                System.out.println("Fila" + (i+1)+ ": Artista: " + m[i][0] + "Album: " + m[i][1] + "Año: " + m[i][2]);
            }
        }
    }




}