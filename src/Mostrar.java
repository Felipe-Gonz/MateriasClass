public class Mostrar {

    public static void main (String[] args) {

        Materias materias = new Materias("Matematica", "Ciencias", "Sociales", "Lemguaje", "Ingles");
        Aulas aulas = new Aulas("Seccion 1", "Seccion 2", "Seccion 3");
        Profesor profesor = new Profesor("Profesor 1", "Profesor 2");

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|               Tabla de Materias por Seccion y Profesor              |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|       Materias         |       Aula        |         Profesor       |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|      " + materias.getMateria1() + "        |      " + aulas.getAula1() + "    |       " + profesor.getProfesor1() + "       |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|      " + materias.getMateria2() + "          |      " + aulas.getAula2() + "    |       " + profesor.getProfesor1() + "       |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|      " + materias.getMateria3() + "          |      " + aulas.getAula2() + "    |       " + profesor.getProfesor2() + "       |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|      " + materias.getMateria4() + "          |      " + aulas.getAula3() + "    |       " + profesor.getProfesor2() + "       |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|      " + materias.getMateria5() + "            |      " + aulas.getAula1() + "    |       " + profesor.getProfesor1() + "       |");
        System.out.println("-----------------------------------------------------------------------");
    }
}
