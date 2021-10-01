package projects.interfaceSample.implementations;

import projects.interfaceSample.interfaces.IUseOracle;

public class ImpDB2 implements IUseOracle {

    @Override
    public void getAllData() {
        System.out.println("Obtener todos los registros desde DB2...");
    }
}
