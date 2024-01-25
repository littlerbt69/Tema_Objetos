package Examen_2024;

public class Televisor {
    private int Width;
    private int Height;
    private String conexiones;
    private String protocolos;

    private Pixel[][] panel;

    public Televisor(int anchura, int altura, String conexiones, String protocolos) {
        this.Width = anchura;
        this.Height = altura;
        this.conexiones = conexiones;
        this.protocolos = protocolos;
        this.panel = new Pixel[altura][anchura];
        inicializarPanel();
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int anchura) {
        this.Width = anchura;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    private void inicializarPanel() {
        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < Width; j++) {
                double random = Math.random();
                panel[i][j] = new Pixel(random <= 0.03);
            }
        }
    }

    public boolean isDefectuoso() {
        int contador = 0;

        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < Width; j++) {
                if (panel[i][j].isDefectuoso()) {
                    contador++;
                }
            }
        }

        return contador >= Height * Width * 0.03;
    }

    public void setImagen(String[][] imagen) {
        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < Width; j++) {
                int verde = Integer.parseInt(imagen[i][j].substring(1, 3), 16);
                int rojo = Integer.parseInt(imagen[i][j].substring(3, 5), 16);
                int azul = Integer.parseInt(imagen[i][j].substring(5, 7), 16);

                panel[i][j].setRed(verde);
                panel[i][j].setRed(rojo);
                panel[i][j].setRed(azul);
            }
        }
    }

    public String getColorPromedio() {
        long verde = 0, rojo = 0, azul = 0;

        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < Width; j++) {
                if (panel[i][j].isDefectuoso()) {
                    rojo += panel[i][j].getRed();
                    verde += panel[i][j].getRed();
                    azul += panel[i][j].getRed();
                }
            }
        }

        int colorPromedioRojo = (int) (rojo / (Width * Height));
        int colorPromedioVerde = (int) (verde / (Width * Height));
        int colorPromedioAzul = (int) (azul / (Width * Height));

        return String.format("#%02X%02X%02X", colorPromedioRojo, colorPromedioVerde, colorPromedioAzul);
    }

    public String conectar(Dispositivo dispositivo) throws DispositivoNoCompatibleException {
        String[] televisorConexiones = conexiones.split(" ");
        String[] dispositivosConexiones = dispositivo.getConexiones().split(" ");
        String conexionUtilizada = null;

        for (int i = 0; i < televisorConexiones.length && conexionUtilizada == null; i++) {
            for (int j = 0; j < dispositivosConexiones.length && conexionUtilizada == null; j++) {
                if (televisorConexiones[i].equals(dispositivosConexiones[j])) {
                    conexionUtilizada = dispositivosConexiones[i];
                }
            }
        }
        if (conexionUtilizada == null) {
            throw new DispositivoNoCompatibleException("El dispositivo " + dispositivo.getNombre() + " no tiene ninguna conexion compatible");
        }

        String[] televisorProtocolos = conexiones.split(" ");
        String[] dispositivosProtocolo = dispositivo.getConexiones().split(" ");
        String protocoloUtilizado = null;

        for (int i = 0; i < televisorProtocolos.length && protocoloUtilizado == null; i++) {
            for (int j = 0; j < dispositivosProtocolo.length && protocoloUtilizado == null; j++) {
                if (televisorProtocolos[i].equals(dispositivosProtocolo[j])) {
                    protocoloUtilizado = dispositivosProtocolo[i];
                }
            }
        }
        if (protocoloUtilizado == null) {
            throw new DispositivoNoCompatibleException("El dispositivo " + dispositivo.getNombre() + " no tiene ningun protocolo compatible");
        }

        return String.format("Dispositivo %s conectado en el puerto %s usando el protocolo %s", dispositivo.getNombre(),conexionUtilizada,protocoloUtilizado);
    }
}
