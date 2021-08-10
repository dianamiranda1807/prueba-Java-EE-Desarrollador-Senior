# prueba-Java-EE-Desarrollador-Senior
Prueba para el cargo de Desarrollador Java EE Senior

Para descargar los puntos 1 y 2 de la prueba los pasos que debe seguir son:

 •	Ingresar a master y descargar el proyecto Prueba Java EE punto 1 y punto 2

Para poder subir el Backend debe exportar el proyecto Maven en el IDE Eclipse los pasos que debe seguir son:

  •	Ingresar a master y descargar el proyecto empresa
  
  •	Abrir el IDE
  
  •	Dar click en file 
  
  •	Dar click en Import
  
  •	Dar click en Maven
  
  •	Dar click en Existing Maven Projects
  
  •	Buscar el proyecto llamado empresa en el lugar que lo haya guardado
  
  •	Dar click en Finish
  
  •	Se debe dirigir a la parte izquierda del IDE en Package Explorer y dar click derecho sobre el proyecto
  
  •	Ir a la opción de Run As
  
  •	Dar click en Spring Boot App
  
  •	Si no se encuentra esta opción debe ir a la opción de Help en la parte superior del IDE para dirigirse a la opción de Eclipse Marketplace, buscar Spring Boot para instalarlo.
  
  •	Cuando de da click en la opción de Spring Boot App debe subir el Backend.
  
  •	Buscar en la consola el puerto en el que subió el Tomcat y el jdbc de la base de datos de memoria H2.
  
  •	Validar en la ruta localhost:8080/h2-console que este la base H2 arriba, en la opción de JDBC URL se debe poner el jdbc que subio en eclipse para poder acceder a la base de datos Ej:(jdbc:h2:mem:1ead85e3-bd1e-47fe-990f-ff362e21ddca) este cambia cada vez que se sube el servicio del Backend.

Para poder subir el Frontend debe guardar la carpeta llamada EmpresaTransporte en su equipo y debe tener instalado angular 12.2 y el IDE Visual Studio Code para abrir el proyecto y subir el servidor en el terminal, los pasos que debe seguir son:

  •	Ingresar a master y descargar el proyecto EmpresaTransporte
  
  •	Abrir el IDE Visual Studio Code
  
  •	Abrir el proyecto EmpresaTransporte en el terminal
  
  •	Ejecutar el comando ng serve -o
  
  •	Abrir la ruta localhost:4200
  
  •	Ingresar los datos en el formulario
  
  •	Dar click en el botón de enviar Datos
  
Para ver los datos guardados en H2 debe seguir los siguientes pasos:

  •	Ir a la ruta localhost:8080/h2-console 
  
  •	Ingresar el jdbc de la base de datos
  
  •	Escribir la sentencia SELECT * FROM TB_EMPRESA en la caja SQL statement
  
  •	Dar click en Run para ver los que se acabaron de crear
