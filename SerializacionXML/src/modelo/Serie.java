package modelo;

public class Serie {
    private String name;
    private int cantCapitulos;

    public Serie() {
    }

    public Serie(String name, int cantCapitulos) {
	this.name = name;
	this.cantCapitulos = cantCapitulos;
    }

    public String getName(){
        return name;
    }

    public int getCantCapitulos(){
        return cantCapitulos;
    }

}