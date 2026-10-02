public static void main(String[] args) {
    // TODO code application logic here
        Ejercicio33();   
    }

    private static void Ejercicio33() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos cuántos números se van a leer
        System.out.println("Introduce cuántos números vas a poner: ");
        int cantidad = teclado.nextInt();

        // Variables para guardar las cuentas
        int suma = 0;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int pares = 0;
        int impares = 0;
        
        int mayor = 0;
        int menor = 0;

        // Bucle for porque sabemos cuántas veces se repite
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Introduce el número " + i + ": ");
            int num = teclado.nextInt();

            // Sumamos el número
            suma = suma + num;

            // El primer número que entra es el mayor y el menor al principio
            if (i == 1) {
                mayor = num;
                menor = num;
            } else {
                if (num > mayor) {
                    mayor = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }

            // Miramos si es positivo, negativo o cero
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }

            // Miramos si es par o impar con el resto (%)
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Calculamos la media
        double media = (double) suma / cantidad;

        // Mostramos todos los resultados por pantalla
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota;
        double suma = 0;
        int totalNotas = 0;

        int aprobados = 0;
        int suspensos = 0;

        int suficientes = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalientes = 0;

        double notaMayor = 0;
        double notaMenor = 10;

        System.out.println("Introduce notas del 0 al 10 (pon -1 para terminar):");

        // Usamos do-while para pedir la nota al menos una vez
        do {
            System.out.println("Introduce una nota: ");
            nota = teclado.nextDouble();

            // Solo hacemos los cálculos si no es el -1 de salir
            if (nota != -1) {
                
                // Comprobamos que la nota sea válida entre 0 y 10
                if (nota >= 0 && nota <= 10) {
                    suma = suma + nota;
                    totalNotas++;

                    // Sacamos mayor y menor
                    if (totalNotas == 1) {
                        notaMayor = nota;
                        notaMenor = nota;
                    } else {
                        if (nota > notaMayor) {
                            notaMayor = nota;
                        }
                        if (nota < notaMenor) {
                            notaMenor = nota;
                        }
                    }

                    // Contamos aprobados y suspensos
                    if (nota >= 5) {
                        aprobados++;
                    } else {
                        suspensos++;
                    }

                    // Clasificamos según la nota
                    if (nota >= 9) {
                        sobresalientes++;
                    } else if (nota >= 7) {
                        notables++;
                    } else if (nota >= 6) {
                        bienes++;
                    } else if (nota >= 5) {
                        suficientes++;
                    }
                } else {
                    System.out.println("Nota no válida, debe ser entre 0 y 10.");
                }
            }

        } while (nota != -1);

        // Mostramos resultados si se metió alguna nota válida
        if (totalNotas > 0) {
            double media = suma / totalNotas;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Total de notas introducidas: " + totalNotas);
            System.out.println("Media: " + media);
            System.out.println("Nota más alta: " + notaMayor);
            System.out.println("Nota más baja: " + notaMenor);
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Suspensos: " + suspensos);
            System.out.println("Suficientes: " + suficientes);
            System.out.println("Bienes: " + bienes);
            System.out.println("Notables: " + notables);
            System.out.println("Sobresalientes: " + sobresalientes);
        } else {
            System.out.println("No se introdujo ninguna nota válida.");
        }
    }
}
