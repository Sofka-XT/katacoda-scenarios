En esta serie de preguntas vamos a realizar algunos pasos para configurar el ambiente de MySQL. Lo primero es poner en ejecución el ambiente usando la siguiente instrucción:

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

