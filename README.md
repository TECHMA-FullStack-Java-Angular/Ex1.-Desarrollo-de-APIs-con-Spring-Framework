# Ex1.Prueba_tecnica: Desarrollo de APIs con Spring Framework

1.    Introducción
En el presente proyecto del Bootcamp Full Stack correspondiente a la parte Spring Framework se espera que el alumno demuestre todos los conocimientos adquiridos en desarrollo de APIs. 

2.    Descripción 
La empresa quiere dar un impulso a la manera que tienen los trabajadores de relacionarse, permitiendo que contacten entre ellos creando grupos de interés. 

Una primera fase de este proyecto es crear una aplicación web LFG, que permita que los  empleados  puedan  contactar  con  otros  compañeros  para formar grupos para jugar a un videojuego, con el objetivo de poder compartir un rato de ocio afterwork. 

Los requisitos funcionales de la aplicación son los siguientes: 

- RF.1   Los   usuarios  tienen  que  poder  crear  Partídas  (grupos)  para  un determinado videojuego.
<img width="524" alt="image" src="https://user-images.githubusercontent.com/110301198/233160213-20bb9fdc-5d70-4e7a-ad3b-cd8136507df3.png">

- RF.2  Los  usuarios  tienen  que  poder  buscar  Partídas  seleccionando  un videojuego.


- RF.3  Los usuarios pueden entrar y salir de una Party. 


- RF.4  Los  usuarios  tienen  que  poder  enviar  mensajes  a  la  Party. Estos mensajes tienen que poder ser editados y borrados por su usuario creador. 
<img width="462" alt="image" src="https://user-images.githubusercontent.com/110301198/233177580-1b90590c-440f-4a83-a5e9-699156c7efe8.png">


GET
/api/message - View all messages

POST
/api/message - edit message by body

DELETE
/message/{id} - delete message by id


- RF.5  Los mensajes que existan en una Party se tienen que visualizar como un chat común. 



- RF.6 Los usuarios pueden introducir y modiﬁcar sus datos de perﬁl, por ejemplo, su usuario de Steam. 
<img width="499" alt="image" src="https://user-images.githubusercontent.com/110301198/233175000-0e1136b0-de45-4078-b49e-a903e0a72b62.png">


POST

/api/user - Create new user

PUT

/api/user/{id} - update user

DELETE

/api/user/{id} - Delete user

Ejemplo de frontal: 
<img width="431" alt="image" src="https://user-images.githubusercontent.com/110301198/232996140-8d352ce9-0ebf-44c7-bc91-6471789ce3fb.png">
<img width="426" alt="image" src="https://user-images.githubusercontent.com/110301198/232996295-4db00bee-65da-4f85-86cc-7b77281b7c34.png">

En esta primera fase de proyecto el alumno ha de realizar una  API REST completa,   con   Spring Framework,   que   cumpla   con   los   requisitos   anteriormente planteados. 

Deﬁne los endpoints necesarios para que el backend pueda cumplir con lo establecido, nutriendo las diferentes vistas de frontend. 

 Además de de lo mencionado anteriormente el alumno ha de incluir la siguiente funcionalidad: 

- [] H2
- [] JPA
- [] Relaciones necesarias
- [] CRUD de los diferentes modelos.
- [] Excelente Readme (IMPORTANTE). 
