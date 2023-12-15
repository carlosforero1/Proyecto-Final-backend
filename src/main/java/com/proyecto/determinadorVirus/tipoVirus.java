package com.proyecto.determinadorVirus;

public class tipoVirus {
	
	  public String deteminarVirus(String DescripcionVirus) {
		  String respuesta = "";
          String[] ransomwarePalabrasClave = {"WannaCry", "Petya", "Ryuk", "cifrado", "rescate", "malware"};
          String[] phishingPalabrasClave = {"Spear phishing", "vishing", "correo electrónico", "engaño", "información confidencial"};
          String[] ddosPalabrasClave = {"Ataque a Dyn", "Mirai botnet", "tráfico falso", "inaccesibilidad", "servicio en línea"};
          String[] violacionDatosPalabrasClave = {"Equifax", "Yahoo", "LinkedIn", "acceso no autorizado", "información personal", "credenciales"};
          String[] inyeccionSQLPalabrasClave = {"Ataque de inyección de SQL", "código SQL malicioso", "aplicación web", "acceso no autorizado"};
          String[] malwarePalabrasClave = {"Virus", "gusanos", "troyanos", "software malicioso", "daño", "explotación"};
          String[] zeroDayExploitsPalabrasClave = {"Stuxnet", "vulnerabilidades", "seguridad", "explotación", "parche"};
          String[] ataquesInfraestructurasPalabrasClave = {"Energía", "agua", "transporte", "infraestructuras esenciales", "compromiso"};
          String[] ataquesRedesSocialesPalabrasClave = {"Breaches en Facebook", "Twitter", "acceso no autorizado", "difusión de información falsa"};
          String[] fugasInformacionConfidencialPalabrasClave = {"WikiLeaks", "divulgación no autorizada", "información confidencial", "clasificada"};
          String[] hackingIoTPalabrasClave = {"Ataques a cámaras de seguridad", "dispositivos domésticos inteligentes", "acceso no autorizado"};
          String[] espionajeCiberneticoPalabrasClave = {"APT", "Amenazas Persistentes Avanzadas", "gobiernos", "organizaciones", "información sensible"};

          if (contienePalabrasClave(DescripcionVirus, ransomwarePalabrasClave)) {
        	  respuesta = "Ransomware";
          }
          if (contienePalabrasClave(DescripcionVirus, phishingPalabrasClave)) {
        	  respuesta = "Phishing";
          }
          if (contienePalabrasClave(DescripcionVirus, ddosPalabrasClave)) {
        	  respuesta = "Ataque de Denegación de Servicio (DDoS)";
          } else if (contienePalabrasClave(DescripcionVirus, violacionDatosPalabrasClave)) {
        	  respuesta = "Violación de Datos";
          } else if (contienePalabrasClave(DescripcionVirus, inyeccionSQLPalabrasClave)) {
        	  respuesta = "Inyección de SQL";
          } else if (contienePalabrasClave(DescripcionVirus, malwarePalabrasClave)) {
        	  respuesta = "Malware";
          } else if (contienePalabrasClave(DescripcionVirus, zeroDayExploitsPalabrasClave)) {
        	  respuesta = "Zero-Day Exploits";
          } else if (contienePalabrasClave(DescripcionVirus, ataquesInfraestructurasPalabrasClave)) {
        	  respuesta = "Ataques a Infraestructuras Críticas";
          } else if (contienePalabrasClave(DescripcionVirus, ataquesRedesSocialesPalabrasClave)) {
        	  respuesta = "Ataques a Redes Sociales";
          } else if (contienePalabrasClave(DescripcionVirus, fugasInformacionConfidencialPalabrasClave)) {
        	  respuesta = "Fugas de Información Confidencial";
          } else if (contienePalabrasClave(DescripcionVirus, hackingIoTPalabrasClave)) {
        	  respuesta = "Hacking de Dispositivos IoT";
          } else if (contienePalabrasClave(DescripcionVirus, espionajeCiberneticoPalabrasClave)) {
        	  respuesta = "Espionaje Cibernético";
          } else {
        	  respuesta = "No se pudo determinar el tipo de virus.";
          }
          return respuesta;
      }
      
      private static boolean contienePalabrasClave(String texto, String[] palabrasClave) {
          for (String palabraClave : palabrasClave) {
              if (texto.toLowerCase().contains(palabraClave.toLowerCase())) {
                  return true;
              }
          }
          return false;
      }

      private static void imprimirTipoVirus(String tipo) {
          System.out.println("El texto contiene indicios de: " + tipo);
      }
}
