public class Persona {

    protected static String[] nivelesEnsenanza = {"Secundario","Terciario","Universitario","otros"};

    protected final static String NE_DEF="otros";

    private String nombreYapellido;
    private String nivelEnsenanza;
    private String localidad; //opcinal
    private String telefonoFijo;
    private String telefonoMovil; //opcional
    private String email;
    private String ocupacion;

    //constructor de los atributos obligatorios
    public Persona(String nombreYapellido, String nivelEnsenanza, String telefonoFijo, String email, String ocupacion) {
        this(nombreYapellido, nivelEnsenanza," ",telefonoFijo," ", email, ocupacion);

    }

    //contructor que no tiene telefono fijo
    public Persona(String nombreYapellido, String nivelEnsenanza, String localidad, String telefonoFijo, String email, String ocupacion) {
        this(nombreYapellido, nivelEnsenanza,localidad,telefonoFijo," ", email, ocupacion);
    }


    //contructor que acepta todos los atributos
    public Persona(String nombreYapellido, String nivelEnsenanza, String localidad, String telefonoFijo, String telefonoMovil, String email, String ocupacion) {
        this.nombreYapellido = nombreYapellido;
        comprobarNivelEnsenanaza(nivelEnsenanza); // se llama al metodo comprobarNivelEnsenanza
        this.localidad = localidad;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.email = email;
        this.ocupacion = ocupacion;
    }

    private void comprobarNivelEnsenanaza(String nivel){

        boolean encontrado=false;

        for(int i=0;i<nivelesEnsenanza.length && !encontrado;i++){

            if(nivelesEnsenanza[i].equals(nivel)){
                encontrado=true;
            }

        }

        if(encontrado){
            this.nivelEnsenanza=nivel;
        }else{
            this.nivelEnsenanza=NE_DEF;
        }


    }
}
