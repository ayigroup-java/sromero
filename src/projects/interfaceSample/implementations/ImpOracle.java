package projects.interfaceSample.implementations;

import projects.interfaceSample.interfaces.IUseBase;
import projects.interfaceSample.interfaces.IUseOracle;

public class ImpOracle implements IUseBase, IUseOracle {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle...");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle...");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle...");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle...");
    }

    @Override
    public void getAllData() {
        System.out.println("Obtener todos los registros desde Oracle...");
    }
}
