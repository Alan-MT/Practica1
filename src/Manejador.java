
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manejador {

    public NewJFrame fra;

    public Manejador() {
        this.fra = new NewJFrame();
        fra.setVisible(true);

        this.fra.getVerificar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void verificar() {
        String linea;
       /** while ((linea = br.readLine()) != null) {
            con la linea leida, separamos los campos
            String[] campos = separarCampos(linea);
            //pasamos el texto a objeto
            Aeropuerto aero = DepartamentoAdministracion.ContruirAeropuerto(campos);
            if (aero != null) {
                Aero.add(aero);
            }
            text.append("\n" + linea);
        }*/

    }

}
