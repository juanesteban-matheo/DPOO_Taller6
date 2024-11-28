package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
    	this.txtNombre = new JTextField();
    	JLabel txtLabel = new JLabel("NOMBRE");

        // Crea el selector para la calificación con una etiqueta al frente
        this.cbbCalificacion = new JComboBox<String>();
        JLabel cbbCalLabel = new JLabel("CALIFICACIÓN");

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        this.cbbVisitado = new JComboBox<String>();
        JLabel cbbVisLabel = new JLabel("VISITADO");

        // Agregar todos los elementos al panel
        this.setLayout(new FlowLayout());
        this.setLayout(new GridLayout(3,2));
        this.add(txtLabel);
        this.add(txtNombre);
        this.add(cbbCalLabel);
        this.add(cbbCalificacion);
        this.add(cbbVisLabel);
        this.add(cbbVisitado);
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        int visited = ( int )cbbVisitado.getSelectedIndex();
        if (visited == 0) 
        {return true;} 
        else 
        {return false;}
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	String name = ( String )txtNombre.getName();
        return name;
    }
}
