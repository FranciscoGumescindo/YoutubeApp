# YoutubeApp
App en Android cuya funcionalidad es abrir un video en Youtube, a travez de una API, usando el lenguaje kotlin.

Descripcion del proyecto de YoutubeApp: 

Para realizar este proyecto es necesario crear un proyecto con el lenguaje
kotlin por defecto, con el nombre que se desee.

Una vez creado este proyecto, es necesario obtener la clave para poder 
obtener los servicios de youtube:
esto en el siguiente enlace:

https://console.developers.google.com

Para ello es necesario contar con el nombre del paquete del poyecto y 
del SHA1.

Con respecto a la configuración del proyecto, es necesario configurar una 
variable para poder conectarcon la api de la siguiente manera:
val = API_KEY = "CLAVE DE LA API DEL PROYECTO".

Ahora es necesario descargar la api de youtube, esto a travez del siguiente 
enlace:
https://developers.google.com/youtube/android/player/?hl=es-419

En la pantalla principal ¨GUÍAS¨, buscamos la referencia de descarga y le
damos click. Descargamos el paquete en zip de la API de Youtube. Una vez descomprimido, 
nos ubicamos en la subcarpeta /libs y copiamos la libreria con extensión .jar.

En android, cambiamos la vista  de Android a Project, abrimos la carpeta app,
y copiamos la libreria en la subcarpeta libs.

Le damosclick derecho a la libreria, seleccionamos "Add as library", añadir 
como una libreria.

Una vez declarado el button en el xml con un id para abrir youtube en el activity_main.xml,
programamos el archivo MainActiviti.kt

En donde se creara el evento que al dar click en el button permita abrir el video en Youtube,
se declarara una referencia hacia el video que se pretende abrir con el click en el button, asi 
como el inicio de esta.

Por ultimo asignamos el permiso de Internet en el manifest y corremos la aplicación en
nuestro dispositivo.
