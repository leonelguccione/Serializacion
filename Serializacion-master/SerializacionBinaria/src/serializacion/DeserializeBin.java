package serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import modelo.DVD;

public class DeserializeBin
{
    private static final String SERIALIZED_FILE_NAME = "dvd_serializado_binario.ser";
    private FileInputStream file;
    private ObjectInputStream input;

    public void abrir() throws IOException
    {
        file = new FileInputStream(SERIALIZED_FILE_NAME);
        input = new ObjectInputStream(file);
    }

    public void cerrar() throws IOException
    {
        if (input != null)
            input.close();
    }

    public DVD leer() throws IOException, ClassNotFoundException
    {
        DVD dvd = null;
        if (input != null)
        {
            dvd = (DVD) input.readObject();
        }
        return dvd;
    }


    public static void main(String[] args)
    {
        DVD dvd;
        DeserializeBin deser = new DeserializeBin();
        try
        {
            deser.abrir();
            dvd = deser.leer();
            deser.cerrar();
            System.out.println(dvd.toString());

        }
        catch (IOException ioe)
        {
            // TODO: Add catch code
            ioe.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
