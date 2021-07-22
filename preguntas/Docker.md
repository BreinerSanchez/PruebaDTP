# Las sigueinte preguntas estan relacionadas con Docker.

# ¿Qué es Docker?

Respuesta: Docker es un servicio de software abierto que permite el despliegue de aplicaciones dentro de contenedores con diferentes sistemas operativos sin tener inconvenientes con incompatibilidades o problemas de despliegue ya que en cada contenedor se encuentran las herramientas para que las aplicaciones funcionen 

# ¿Cuál es la imagen base de este devcontainer?

Respuesta: la imagen base es esta https://github.com/microsoft/vscode-dev-containers/tree/v0.166.1/containers/java/.devcontainer/base.Dockerfile

# ¿Cómo se instaló postgresql en este contenedor?

Respuesta: se realizo por medio de linea de comando ingresando a la pagina de postgres con el comando apt-get update descargando la version 11 y luego con el comando apt -y install  

# ¿Cuantas capas tiene la imagen de este devcontainer?

Respuesta:  vi algunas opciones pero no pude ejecutarlo con docker inspect NameImagen | jq .[0].RootFS ahi saldria las capas
