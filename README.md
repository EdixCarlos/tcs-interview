# tcs-interview
### Descipcion:  Api para aplicar tipo de cambio, consulte la documentacion con postman aqui ----> https://documenter.getpostman.com/view/7699521/UVsQr3h9

## Idicaciones para levantar el proyecto:
Ejecutar maven install para generar nuestro .jar, luego ejecutar el siguiente comando para construir la imagen.
```
docker build -t springboot-docker-api-h2:latest.
```
Luego de verificar que se creo la imagen ejecuta el contenedor con el siguiente comando.
```
docker run -p 8080:8080 springboot-docker-api-h2
```