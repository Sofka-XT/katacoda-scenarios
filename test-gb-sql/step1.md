En esta serie de preguntas vamos a realizar algunos pasos para configurar el ambiente de MySQL. 

Espere que termine de instalar el ambiente, ingrese un usuario y contraseña y por ultimo realice la ejecución el ambiente usando la siguiente instrucción para poder ingresar:

`/usr/bin/mysql -u root -p`{{execute}}

*Migrar datos*

`source db.sql`{{execute}}

**Consulta de validación**
`SELECT * FROM DEPARTMENT;`{{execute}}
`SELECT * FROM EMPLOYEE;`{{execute}}


**RESPONDER A CONTINUACIÓN**

¿Cuantas personas existen en el departamento de Software?
- Referencia: `select count(dno) from EMPLOYEE`

**Responder en el campus**
- A. 15
- B. 20
- C. 0
- D. 14

