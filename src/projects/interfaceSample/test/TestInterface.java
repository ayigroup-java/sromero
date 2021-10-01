package projects.interfaceSample.test;

import projects.interfaceSample.implementations.ImpMySql;
import projects.interfaceSample.implementations.ImpOracle;
import projects.interfaceSample.interfaces.IUseBase;
import projects.interfaceSample.interfaces.IUseOracle;

public class TestInterface {

    public static void main(String[] args) {
        IUseBase operacionesBase = new ImpMySql();
        ejecutarOperaciones(operacionesBase);

        IUseBase operacionesBaseOracle = new ImpOracle();
        ejecutarOperaciones(operacionesBaseOracle);
    }

    public static void ejecutarOperaciones(IUseBase datos) {
        datos.listar();

        if(datos instanceof ImpOracle) {
            ((ImpOracle) datos).getAllData();
        }
    }

}
