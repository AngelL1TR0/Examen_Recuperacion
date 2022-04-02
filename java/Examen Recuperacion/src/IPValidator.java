public class IPValidator {
    public boolean ValidateIpv4Address(String ipAddress) {

        String[] octets = ipAddress.split("\\.");

        if (extracted1(octets)) return false;

        boolean todosLosNumerosEstanEntre0y255 = isTodosLosNumerosEstanEntre0y255(octets);
        if (!todosLosNumerosEstanEntre0y255)
            return false;

        return extracted2(octets);
    }

    private boolean isTodosLosNumerosEstanEntre0y255(String[] octets) {
        boolean todosLosNumerosEstanEntre0y255 = true;
        todosLosNumerosEstanEntre0y255 = isTodosLosNumerosEstanEntre0y255(octets, todosLosNumerosEstanEntre0y255);
        return todosLosNumerosEstanEntre0y255;
    }

    private boolean extracted2(String[] octets) {
        return !octets[octets.length - 1].equals("0")
                && !octets[octets.length - 1].equals("255");
    }

    private boolean extracted1(String[] octets) {
        if (extracted(octets)) return true;

        boolean todasLasPartesSonNumeros = true;
        todasLasPartesSonNumeros = isTodasLasPartesSonNumeros(octets, todasLasPartesSonNumeros);
        if (!todasLasPartesSonNumeros)
            return true;
        return false;
    }

    private boolean extracted(String[] octets) {
        boolean tieneCuatroPartes = octets.length == 4;
        if (!tieneCuatroPartes)
            return true;
        return false;
    }

    private boolean isTodosLosNumerosEstanEntre0y255(String[] octets, boolean todosLosNumerosEstanEntre0y255) {
        for (String octet: octets) {
            try {
                Integer numero = Integer.parseInt(octet);
                if (!(numero>=0 && numero <=255)){
                    todosLosNumerosEstanEntre0y255 = false;
                    break;
                }
            } catch (NumberFormatException e) {

            }
        }
        return todosLosNumerosEstanEntre0y255;
    }

    private boolean isTodasLasPartesSonNumeros(String[] octets, boolean todasLasPartesSonNumeros) {
        for (String octet: octets){
            todasLasPartesSonNumeros = isTodasLasPartesSonNumeros(todasLasPartesSonNumeros, octet);
            if (!todasLasPartesSonNumeros) break;
        }
        return todasLasPartesSonNumeros;
    }

    private boolean isTodasLasPartesSonNumeros(boolean todasLasPartesSonNumeros, String octet) {
        for (char c : octet.toCharArray())
        {
            if  (!Character.isDigit(c)) {
                todasLasPartesSonNumeros = false;
                break;
            }
        }
        return todasLasPartesSonNumeros;
    }

}

