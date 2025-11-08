import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                default:
                    System.out.println("Opción Inválida");
            }

        }
        System.out.println("Fin del programa");
        scanner.close();
    }

    public static void menu() {
        System.out.println("--------------------------------");
        System.out.println("Bienvenido a la aplicación de la semana 10");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("0. para salir");
        System.out.println("Selecciona una opción: ");
        System.out.println("--------------------------------");
    }

    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejercicio 1: Calculadora de descuentos en Tienda");
        int cantProductos = 0;
        double totalCompra = 0;
        double precioConDescuento = 0;
        double totalPagar = 0;

        System.out.print("Ingresar la cantidad de productos comprados: ");
        cantProductos = scanner.nextInt();
        System.out.print("Ingresar el total de la compra: ");
        totalCompra = scanner.nextDouble();

        if (cantProductos > 20) {
            precioConDescuento = 0.20 * totalCompra;
            totalPagar = totalCompra - precioConDescuento;
            System.out.println("El descuento aplicado es del 20%");
            System.out.println("El total a pagar es: " + totalPagar);
        } else if (cantProductos > 10) {
            precioConDescuento = 0.15 * totalCompra;
            totalPagar = totalCompra - precioConDescuento;
            System.out.println("El descuento aplicado es del 15%");
            System.out.println("El total a pagar es: " + totalPagar);
        } else if (cantProductos > 5) {
            precioConDescuento = 0.10 * totalCompra;
            totalPagar = totalCompra - precioConDescuento;
            System.out.println("El descuento aplicado es del 10%");
            System.out.println("El total a pagar es: " + totalPagar);
        } else {
            System.out.println("No aplica descuento");
            System.out.println("El total a pagar es: " + totalCompra);
        }
        scanner.close();
    }

    public static void ejercicio2() {
        System.out.println("Ejercicio 2");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su ingreso mensual: ");
        double ingresoMensual = scanner.nextDouble();
        System.out.print("Ingrese sus gastos mensuales: ");
        double gastosMensuales = scanner.nextDouble();
        double porcentGastos = (gastosMensuales / ingresoMensual) * 100;
        if (edad < 17 || edad < 66) {
            // Esta en el rango de edad
            if (porcentGastos < 70 && ingresoMensual >= 2000000) {
                System.out.println("Crédito Aprobado hasta por un monto de: " + (ingresoMensual * 5));
            } else {
                System.out.println("Crédito Denegado por no cumplir requisitos financieros");
            }
        } else {
            System.out.println("Crédito Denegado por no cumplir requisitos de edad");
        }
        System.out.println("Porcentaje de gastos: " + porcentGastos + "%");
        scanner.close();
    }

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");

    }

    public static void ejercicio4() {
        System.out.println("Ejercicio 3");

        Scanner scanner = new Scanner(System.in);

        int minEnBus = 20;
        int minEnMetro = 15;
        int minCaminando = 10;
        int minDeViaje = minEnBus + minCaminando + minEnMetro;
        System.out.print("El tráfico está pesado? (S/N): ");
        String traficoPesado = scanner.nextLine();
        System.out.print("Está lloviendo? (S/N): ");
        String estaLloviendo = scanner.nextLine();
        if (traficoPesado == "S") {
            minEnBus += 10;
            minDeViaje = minEnBus + minCaminando + minEnMetro;
        }
        if (estaLloviendo == "S") {
            minCaminando += 10;
            minDeViaje = minEnBus + minCaminando + minEnMetro;
        }
        System.out.println("El tiempo total de viaje es: " + minDeViaje + " minutos");
        scanner.close();
    }

    public static void ejercicio5() {
        System.out.println("Ejercicio 5. Transporte/Aviación");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la hora de su vuelo: (Formato 24h y en número decimal. Ej. 8:30pm digitar 20,5)");
        Double horaVuelo = scanner.nextDouble();
        System.out.println("Seleccione estado del vuelo: ");
        System.out.println("1. Vuelo a tiempo");
        System.out.println("2. Vuelo retrasado");
        System.out.println("3. Vuelo cancelado");
        int estadoVuelo = scanner.nextInt();
        System.out.println("Hay buen clima? (true/false): ");
        Boolean estadoClima = scanner.nextBoolean();
        if (estadoVuelo == 1 && estadoClima == true) {
            System.out.println("Su vuelo está programado para la hora indicada: " + horaVuelo + " hrs.");
        } else if (estadoVuelo == 1 && estadoClima == false) {
            System.out.println("Su vuelo se atrasará 30 minutos: Nueva hora de vuelo: " + (horaVuelo + 0.5) + " hrs.");
        } else if (estadoVuelo == 2 && estadoClima == true) {
            System.out.println("Su vuelo ha sido retrasado 2 horas. Nueva hora de vuelo: " + (horaVuelo + 2) + " hrs.");
        } else if (estadoVuelo == 2 && estadoClima == false) {
            System.out.println(
                    "Su vuelo ha sido retrasado 2 horas y media. También debido a las condiciones climáticas. Nueva hora de vuelo: "
                            + (horaVuelo + 2.5) + " hrs.");
        } else if (estadoVuelo == 3) {
            System.out.println("Su vuelo ha sido cancelado.");
        } else {
            System.out.println("Información inválida. Por favor, verifique los datos ingresados.");
        }
        scanner.close();

    }

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
    }

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
    }

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
                Scanner scanner = new Scanner(System.in);
        String clasificacion = "Normal";
        System.out.println("Sistema de Triaje Hospitalario");

        for (int i = 1; i <= 5; i++) {
            System.out.println("paciente" + i);
        }
        double temperatura;
        double presionArterial;
        int escalaDolor;

        System.out.print("Ingrese temperatura °C: ");
        temperatura = scanner.nextDouble();

        System.out.print("Ingrese presión arterial:");
        presionArterial = scanner.nextDouble();

        System.out.print("Ingrese dolor (escala 1-10): ");
        escalaDolor = scanner.nextInt();

        if (temperatura > 38.5 || presionArterial > 140.0 || escalaDolor >= 8) {
            clasificacion = "URGENTE";
        } else if (temperatura > 37.5 || presionArterial > 120.0 || escalaDolor >= 5) {
            clasificacion = "PRIORITARIO";
        }
        System.out.println("==> CLASIFICACIÓN FINAL: " + clasificacion);
        scanner.close();
    }

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
    }

    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
    }

}
