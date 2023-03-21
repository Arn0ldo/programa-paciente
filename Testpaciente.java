public class Testpaciente {
    public static void main(String[] args) {

        paciente persona = new paciente ("Arnoldo", 'm',21);//Creamos una instancia de la clase

        persona.setWeight(1.75);
        persona.setHeight(89);
        persona.imc();
    }
}
