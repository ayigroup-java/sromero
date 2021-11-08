package projects.enumSample;

public enum Sitios {

    AR_AR(23, "Argentina"),
    AR_BR(30, "Brasil"),
    AR_CL(9, "Chile");

    private final int provincias;
    private final String primitiveName;

    Sitios(int provincias, String primitiveName) {
        this.provincias = provincias;
        this.primitiveName = primitiveName;
    }

    public int getProvincias() {
        return this.provincias;
    }

    public String getPrimitiveName() {
        return this.primitiveName;
    }

    public static Sitios[] getAllEnums() {
        return values();
    }

    /*
    return Arrays.stream(values())
                .filter(value -> value.getTagPrimitiveName().equals(tag))
                .findFirst()
                .orElse(null);
     */
}
