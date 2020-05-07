package serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.List;

import modelo.DVD;
import modelo.Movie;

public class SerializeBin {

	private static final String SERIALIZED_FILE_NAME = "dvd_serializado_binario.ser";

	private FileOutputStream file;
	private ObjectOutputStream output;

	public void abrir() throws IOException {
		file = new FileOutputStream(SERIALIZED_FILE_NAME);
		output = new ObjectOutputStream(file);
	}

	public void cerrar() throws IOException {
		if (output != null)
			output.close();
	}

	public void escribir(DVD dvd) throws IOException {
		if (output != null)
			output.writeObject(dvd);
	}

	public static void main(String args[]) {

		Movie bourneIndentity = new Movie("The Bourne Identity", 119, "Doug Liman", 2002, "Matt Damon, Franka Potente");
		Movie bourneSupermacy = new Movie("The Bourne Supremacy", 108, "Paul Greengrass", 2004,
				"Matt Damon, Franka Potente, Joan Allen");
		Movie bourneUltimatum = new Movie("The Bourne Ultimatum", 115, "Paul Greengrass", 2007,
				"Matt Damon, Edgar Ramirez, Joan Allen");
		Movie bourneLegacy = new Movie("The Bourne Legacy", 135, "Tony Gilroy", 2012,
				"Jeremy Renner, Rachel Weisz, Edward Norton");
		Movie jasonBourne = new Movie("Jason Bourne", 123, "Paul Greengrass", 2016,
				"Matt Damon, Tommy Lee Jones, Alicia Vikander");

		List moviesList = new ArrayList();
		moviesList.add(bourneIndentity);
		moviesList.add(bourneSupermacy);
		moviesList.add(bourneUltimatum);
		moviesList.add(bourneLegacy);
		moviesList.add(jasonBourne);

		DVD bourneSeries = new DVD();
		bourneSeries.setMovies(moviesList);

		SerializeBin serializador = new SerializeBin();
		try {
			serializador.abrir();
			serializador.escribir(bourneSeries);
		} catch (IOException ioe) {
			// TODO: Add catch code
			ioe.printStackTrace();
		}

	}

}
