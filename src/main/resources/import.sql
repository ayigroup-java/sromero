
INSERT INTO CUENTA (id, password) VALUES ('1','santi@password'),('2','manolo@password'),('3','pepe@password');
INSERT INTO POSICION (id, name) VALUES ('1','developer'),('2','leader');

UPDATE EMPLEADO SET CUENTA_ID = 1 WHERE EMPLEADO.id=1;
UPDATE EMPLEADO SET CUENTA_ID = 2 WHERE EMPLEADO.id=2;

UPDATE EMPLEADO SET POSICION_ID = 1 WHERE EMPLEADO.id=1;
UPDATE EMPLEADO SET POSICION_ID = 1 WHERE EMPLEADO.id=2;
UPDATE EMPLEADO SET POSICION_ID = 2 WHERE EMPLEADO.id=3;

INSERT INTO ROL (rol_id, rol_name) VALUES ('1', 'colaborator'), ('2', 'management');
INSERT INTO POSICION_ROL_SET  (POSICION_ID , ROL_SET_ROL_ID ) VALUES ('1','1'),('2','2');

INSERT INTO EMPLEADO (id, email, name, CUENTA_ID , POSICION_ID ) VALUES ('1','santi@santi.com', 'santi', '1','1'),('2','manolo@manolo.com', 'manolo', '2','1'),('3','pepe@pepe.com', 'pepe', '3','2');